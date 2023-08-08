import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonFileReader {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\Gowtham.P\\Downloads\\FinalConfig_F1.cfg");

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonFactory jsonFactory = objectMapper.getFactory();
            JsonParser jsonParser = jsonFactory.createParser(file);

            JsonNode rootNode = objectMapper.readTree(jsonParser);

            // Get the "advSet" array
            JsonNode advSetNode = rootNode.get("advSet");

            if (advSetNode != null && advSetNode.isArray()) {
                for (JsonNode advNode : advSetNode) {
                    int id = advNode.get("id").asInt();

                    // Get the "payload" array

                    JsonNode payloadNode = advNode.get("payload");

                    if (payloadNode != null && payloadNode.isArray()) {
                        for (JsonNode payloadEntry : payloadNode) {
                            if (payloadEntry.has("data")) {
                                String data = payloadEntry.get("data").asText();
                                if (isNumericData(data)) {
                                    System.out.println("ID: " + id);
                                    System.out.println("Payload Data: " + data);
                                    System.out.println("--------------------");
                                }
                            }
                        }
                    }
                }
            }

            jsonParser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean isNumericData(String data) {

        return data.matches("\\d+");
    }
}