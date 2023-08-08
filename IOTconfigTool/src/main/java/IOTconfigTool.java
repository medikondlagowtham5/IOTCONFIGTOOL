
import java.util.List;

public class IOTconfigTool {
    public static void main(String[] args) {
        String filePath = "D:\\EXCELFILE.xlsx"; // path to Excel file
        String heading = "STUDENTID"; // The heading to extract data from

        // Read data from the Excel file using ExcelReader module
        List<RowData> rowDataList = excelReader.readExcelData(filePath, heading);

        // Convert data to hex in IOTconfigTool module
        for (RowData rowData : rowDataList) {
            String value = convertToHex(rowData.getValue1());
            rowData.setValue1(value);
        }

        // Generate JSON files using JsonFileGenerator module
        JsonFileGenerator.generateJsonFiles(rowDataList);
    }

    private static String convertToHex(String asciiText) {
        // Conversion logic to hexadecimal here (same as before)
        StringBuilder hexValue = new StringBuilder();
        for (char c : asciiText.toCharArray()) {
            hexValue.append(Integer.toHexString(c));
        }
        return hexValue.toString();
    }
}
