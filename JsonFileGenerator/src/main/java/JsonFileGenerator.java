import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JsonFileGenerator {

    public static void generateJsonFiles(List<RowData> rowDataList) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
            JsonNode templateNode = objectMapper.readTree(new File("C:\\Users\\Gowtham.P\\Downloads\\FinalConfig_F1.cfg"));

            int idCounter = 0;

            for (RowData rowData : rowDataList) {
                // Reading data from the Excel file and updating payload data
                String dataValue = rowData.getValue1();

                Payload payload1 = new Payload(dataValue);

                // Creating a new JSON node for each row in the Excel file
                JsonNode jsonNode = templateNode.deepCopy();

                // Update the payload data in the new JSON node
                ArrayNode advSetArray = (ArrayNode) jsonNode.path("advSet");
                for (JsonNode advSetNode : advSetArray) {
                    int id = idCounter++;
                    ((ObjectNode) advSetNode).put("id", id);
                    ((ObjectNode) advSetNode.path("payload").get(0)).put("data", payload1.getData());
                }

                // Create a JSON file with ASCII text as the filename
                String fileName = convertToASCII(dataValue);
                File jsonFile = new File("D:" + fileName + ".json");

                // Write the modified JSON to the file
                objectMapper.writeValue(jsonFile, jsonNode);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String convertToASCII(String hexValue) {
        // Conversion logic to ASCII
        StringBuilder asciiText = new StringBuilder();
        for (int i = 0; i < hexValue.length(); i += 2) {
            String hexPair = hexValue.substring(i, i + 2);
            int decimalValue = Integer.parseInt(hexPair, 16);
            asciiText.append((char) decimalValue);
        }
        return asciiText.toString();
    }
}


/*

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JsonFileGenerator {

    public static void generateJsonFiles(List<RowData> rowDataList) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

            int idCounter = 0;

            for (RowData rowData : rowDataList) {
                Payload payload = new Payload(rowData.getValue1());

                ObjectNode rootNode = objectMapper.createObjectNode();
                rootNode.put("version", "3.10");

                ArrayNode advSetArray = rootNode.putArray("advSet");
                for (int i = 0; i < 3; i++) { // Change this loop as per your requirements
                    ObjectNode advSetNode = advSetArray.addObject();
                    advSetNode.put("id", idCounter++);

                    advSetNode.put("bdAddr", AdvSet.getBdAddr());
                    advSetNode.put("addrType", AdvSet.getAddrType());
                    advSetNode.put("addrKey", AdvSet.getAddrKey());
                    advSetNode.put("addrGenInterval", AdvSet.getAddrGenInterval());


                    ArrayNode payloadArray = advSetNode.putArray("payload");
                    ObjectNode payloadNode = payloadArray.addObject();
                    payloadNode.put("len", payload.getLen());
                    payloadNode.put("type", payload.getType());
                    payloadNode.put("data", payload.getData());
                }

                String fileName = convertToASCII(rowData.getValue1());
                File jsonFile = new File("D:" + fileName + ".json");

                objectMapper.writeValue(jsonFile, rootNode);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String convertToASCII(String hexValue) {
        StringBuilder asciiText = new StringBuilder();
        for (int i = 0; i < hexValue.length(); i += 2) {
            String hexPair = hexValue.substring(i, i + 2);
            int decimalValue = Integer.parseInt(hexPair, 16);
            asciiText.append((char) decimalValue);
        }
        return asciiText.toString();
    }
}

 */
