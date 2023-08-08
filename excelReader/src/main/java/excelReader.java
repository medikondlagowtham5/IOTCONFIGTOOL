import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.util.ArrayList;
import java.util.List;

public class excelReader {
    public static List<RowData> readExcelData(String filePath, String heading) {
        List<RowData> rowDataList = new ArrayList<>();

        try (FileInputStream fileInputStream = new FileInputStream(filePath)) {
            Workbook workbook = new XSSFWorkbook(fileInputStream);
            Sheet sheet = workbook.getSheetAt(0); // read the first sheet

            // Finding the column index according to heading
            int columnIndex = -1;
            Row headerRow = sheet.getRow(0); // As heading will be in the first row
            for (Cell cell : headerRow) {
                if (cell.getStringCellValue().equalsIgnoreCase(heading)) {
                    columnIndex = cell.getColumnIndex();
                    break;
                }
            }

            if (columnIndex != -1) {
                // Loop through the rows in the sheet (skipping header row)
                for (int rowIndex = 1; rowIndex <= sheet.getLastRowNum(); rowIndex++) {
                    Row row = sheet.getRow(rowIndex);
                    if (row != null) {
                        Cell cell = row.getCell(columnIndex);

                        // Check if the cell is not empty
                        if (cell != null) {
                            String value = cell.getStringCellValue();
                            // Creating a RowData object and add it to the list
                            rowDataList.add(new RowData(value));
                        }
                    }
                }
            } else {
                System.out.println("Heading not found in the sheet.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return rowDataList;
    }
}

class RowData {
    private String value1;

    public RowData(String value1) {
        this.value1 = value1;
    }

    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }
}

