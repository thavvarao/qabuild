package com.automation.framework;
import java.io.File;

import jxl.Cell;
import jxl.CellType;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelReader {


	public static String sheetName=null;
	public static String testDataId=null;

	public ExcelReader()
	{

	}
	public static String getTestDataFromExcel(String columnHeader) throws Exception  {

		int row=0,col=0;
		String data=null;
		String dataFile = "lib/TestData.xls";

		File inputWorkbook = new File(dataFile);
		Workbook wbook;
		try {
			wbook = Workbook.getWorkbook(inputWorkbook);

			Sheet sheet = wbook.getSheet(sheetName);
			if(columnHeader!=null){
				for (int j = 0; j < sheet.getColumns(); j++) {
					for (int i = 0; i < sheet.getRows(); i++) {
						Cell cell = sheet.getCell(j, i);
						if(cell.getContents().equals(columnHeader))
							row=j;
						if(cell.getContents().equals(testDataId))
							col=i;

					}
				}
				Cell cell = sheet.getCell(row,col);
				CellType type = cell.getType();
				if (type == CellType.LABEL) {
					data=cell.getContents();
					System.out.println("Value from Excel: " + data);
				}
			}
		} catch (BiffException e) {
			e.printStackTrace();
		}

		return data;
	}

	/**
	 * get Excel Sheet name
	 * @return
	 */
	public String getSheetName(){
		return sheetName;
	}

	/**
	 * Set sheet name for test data excel.
	 * @param excelSheetName
	 * @return
	 */
	public String setSheetName(String excelSheetName)
	{
		sheetName = excelSheetName;
		return sheetName;
	}




	/**
	 * get Excel Sheet name
	 * @return
	 */
	public String getTestDataId(){
		return testDataId;
	}

	/**
	 * Set sheet name for test data excel.
	 * @param excelSheetName
	 * @return
	 */
	public String setTestDataId(String testDataRowId)
	{
		testDataId = testDataRowId;
		return testDataId;
	}
} 