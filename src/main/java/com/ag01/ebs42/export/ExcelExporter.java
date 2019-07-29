package com.ag01.ebs42.export;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.DefaultIndexedColorMap;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFFont;
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
	private static ExcelExporter instance;
	
	private XSSFWorkbook workbook; 
	private XSSFFont font;
	private XSSFCellStyle style;
	
	private static Logger LOGGER = LogManager.getLogger(ExcelExporter.class);
	
	private ExcelExporter() 
	{
		this.workbook = new XSSFWorkbook();
		this.font = this.workbook.createFont();
		this.style = workbook.createCellStyle();
	}
	
	public static ExcelExporter getInstance()
	{
		if (ExcelExporter.instance == null)
		{
			ExcelExporter.instance = new ExcelExporter();
		}
		return ExcelExporter.instance;
	}
	
	public void exportSystems(List<TransferArc42SystemComponent> componentList)
	{
		XSSFSheet sheet = workbook.createSheet("Systeme");		
		ArrayList<String> headers = new ArrayList<String>(Arrays.asList("ID", "System"));
		this.createHeaders(headers, sheet);
		this.font.setBold(false);
		this.style.setFont(font);
		byte[] rgb = { (byte) 255, (byte) 255, (byte) 255};		
		this.style.setFillBackgroundColor(new XSSFColor(rgb, new DefaultIndexedColorMap()));
		
		int rownum = 1;
		for (TransferArc42SystemComponent comp : componentList)
		{
			Row row = sheet.createRow(rownum++);
			Cell sysCell = row.createCell(0);
			sysCell.setCellValue(comp.getSystemComponentName());
			Cell idCell = row.createCell(1);
			idCell.setCellValue(comp.getCorporateId());
		}
		
		try 
		{
			this.generateReport();
		} 
		catch (IOException e) 
		{
			LOGGER.error("Exception  generating report\n" + e.getMessage(), e);
		}
	}
	
	private void generateReport() throws IOException
	{
		FileOutputStream out = new FileOutputStream(new File("report.xlsx"));
		workbook.write(out);
		out.close();
	}
	
	private void createHeaders (ArrayList<String> headers, XSSFSheet sheet)
	{
		this.font.setBold(true);
		byte[] rgb = { (byte) 255, (byte) 192, (byte) 0};		
		this.style.setFillBackgroundColor(new XSSFColor(rgb, new DefaultIndexedColorMap()));
		this.style.setFont(font);
		
		int cellNum = 0;
		Row headRow = sheet.createRow(0);
		
		for (String head :headers)
		{
			Cell cell = headRow.createCell(cellNum++);
			cell.setCellValue(head);
			cell.setCellStyle(style);
		}
	}

}
