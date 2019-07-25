package com.ag01.ebs42.export;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.ag01.ebs42.transform.TransferArc42SystemComponent;

/**
 * Class to export analysis results to an excel workbook
 * 
 * 
 * @author Michael Holste
 *
 */
public class ExcelExporter 
{
	public ExcelExporter() 
	{
		
	}
	
	public void exportSystems(List<TransferArc42SystemComponent> componentList)
	{
		XSSFWorkbook workbook = new XSSFWorkbook(); 
		XSSFSheet sheet = workbook.createSheet("Systeme");
		
		// Create headers
		Row headRow = sheet.createRow(1);
		Cell cell1 = headRow.createCell(1);
		cell1.setCellValue("System");
		Cell cell2 = headRow.createCell(2);
		cell2.setCellValue("ID");
		
		int rownum = 1;
		for (TransferArc42SystemComponent comp : componentList)
		{
			Row row = sheet.createRow(rownum++);
			Cell sysCell = row.createCell(1);
			sysCell.setCellValue(comp.getSystemComponentName());
			Cell idCell = row.createCell(2);
			idCell.setCellValue(comp.getCorporateId());
		}
		
		try
		{
			FileOutputStream out = new FileOutputStream(new File("report.xlsx"));
			workbook.write(out);
			out.close();
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	}

}
