package com.ag01.ebs42.export;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
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

import com.ag01.ebs42.transform.TransferArc42InterfaceConnection;
import com.ag01.ebs42.transform.TransferArc42SystemComponent;
import com.ag01.ebs42.transform.TransferArc42SystemInterface;

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
	
	/**
	 * Static mathod that delivers a singleton instance of the ExcelExporter to
	 *  ensure that a report is only generated once.
	 *  
	 * @return 
	 */
	public static ExcelExporter getInstance()
	{
		if (ExcelExporter.instance == null)
		{
			ExcelExporter.instance = new ExcelExporter();
		}
		return ExcelExporter.instance;
	}
	
	/**	
	 * Exports values of systems to an excel workbook
	 * 
	 * @param componentList Values for systems in temporary transfer format as List
	 */
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
	}
	
	public void exportInterfaces(List<TransferArc42SystemInterface> interfaceList, String title)
	{
		XSSFSheet sheet = workbook.createSheet(title);		
		ArrayList<String> headers = new ArrayList<String>(Arrays.asList("Name", 
				"Art", "Corp ID", "Definierendes System", "Object Id", "Package Id", "Parent Id"));
		this.createHeaders(headers, sheet);
		this.font.setBold(false);
		this.style.setFont(font);
		byte[] rgb = { (byte) 255, (byte) 255, (byte) 255};		
		this.style.setFillBackgroundColor(new XSSFColor(rgb, new DefaultIndexedColorMap()));
		
		int rownum = 1;
		for (TransferArc42SystemInterface iface : interfaceList)
		{
			Row row = sheet.createRow(rownum++);
			Cell nameCell = row.createCell(0);
			nameCell.setCellValue(iface.getSystemInterfaceName());
			Cell kindCell = row.createCell(1);
			kindCell.setCellValue((iface.getInterfaceType()).name());
			Cell idCell = row.createCell(2);
			idCell.setCellValue(iface.getCorporateId());
			Cell sysCell = row.createCell(3);
			sysCell.setCellValue(iface.getDefinedInSystem().getSystemName());			
			Cell objCell = row.createCell(4);
			objCell.setCellValue(iface.getEaId());
			Cell packCell = row.createCell(5);
			packCell.setCellValue(iface.getEaPackageId());
			Cell parCell = row.createCell(6);
			parCell.setCellValue(iface.getEaParentId());
		}
	}
	
	public void exportConnections(HashMap<TransferArc42SystemInterface, List<TransferArc42InterfaceConnection>> interfaceMap)
	{
		int rownum = 0;
		XSSFSheet sheet = workbook.createSheet("Connections");
		for (TransferArc42SystemInterface tInterface : interfaceMap.keySet())
		{
			ArrayList<String> headersInterface = new ArrayList<String>(Arrays.asList("Name", 
					"Art", "Corp ID", "Definierendes System", "Object Id", "Package Id", "Parent Id"));
			this.createSubHeaders(headersInterface, sheet, rownum, 0);
			this.font.setBold(false);
			this.style.setFont(font);
			byte[] rgb = { (byte) 255, (byte) 255, (byte) 255};		
			this.style.setFillBackgroundColor(new XSSFColor(rgb, new DefaultIndexedColorMap()));
			rownum++;
			Row row = sheet.createRow(rownum++);
			Cell nameCell = row.createCell(0);
			nameCell.setCellValue(tInterface.getSystemInterfaceName());
			Cell kindCell = row.createCell(1);
			kindCell.setCellValue((tInterface.getInterfaceType()).name());
			Cell idCell = row.createCell(2);
			idCell.setCellValue(tInterface.getCorporateId());
			Cell sysCell = row.createCell(3);
			sysCell.setCellValue(tInterface.getDefinedInSystem().getSystemName());			
			Cell objCell = row.createCell(4);
			objCell.setCellValue(tInterface.getEaId());
			Cell packCell = row.createCell(5);
			packCell.setCellValue(tInterface.getEaPackageId());
			Cell parCell = row.createCell(6);
			parCell.setCellValue(tInterface.getEaParentId());
			
			List<TransferArc42InterfaceConnection> iConList = interfaceMap.get(tInterface);
			ArrayList<String> headersConnection = new ArrayList<String>(Arrays.asList(
					"Name", "Interface", "Server", "End Id", "Start Id", "Connector Id"));
			this.createSubHeaders(headersConnection, sheet, rownum, 2);	
			this.font.setBold(false);
			this.style.setFont(font);
			this.style.setFillBackgroundColor(new XSSFColor(rgb, new DefaultIndexedColorMap()));
			rownum++;
			for (TransferArc42InterfaceConnection iCon : iConList)
			{
				Row row1 = sheet.createRow(rownum++);
				Cell nameCellCon = row1.createCell(2);
				nameCellCon.setCellValue(iCon.getInterfaceConnectionName());
				Cell intCell= row1.createCell(3);
				intCell.setCellValue(iCon.getInterfaceDefinition().getSystemInterfaceName());
				Cell servCell= row1.createCell(4);
				servCell.setCellValue(iCon.getServer().getSystemComponentName());
				Cell endCell= row1.createCell(5);
				endCell.setCellValue(iCon.getEaEndId());
				Cell startCell= row1.createCell(6);
				startCell.setCellValue(iCon.getEaStartId());
				Cell conCell= row1.createCell(7);
				conCell.setCellValue(iCon.getEaStartId());
			}
		}
		
		
		
	}
	
	/**
	 * Writes the generated report to disk
	 * 
	 * @throws IOException 
	 */
	public void generateReport() throws IOException
	{
		FileOutputStream out = new FileOutputStream(new File("report.xlsx"));
		workbook.write(out);
		out.close();
	}
	
	/**
	 * Creates a formatted header line with given values for the header
	 *  
	 * @param headers the names of the columns
	 * @param sheet the sheet that needs a header
	 */
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
	
	/**
	 * Creates a formatted sub-header line with given values for the header lines 
	 * in the current row
	 *  
	 * @param headers the names of the columns
	 * @param sheet the sheet that needs a header
	 */
	private void createSubHeaders (ArrayList<String> headers, XSSFSheet sheet, int row, int startcell)
	{
		this.font.setBold(true);
		byte[] rgb = { (byte) 255, (byte) 192, (byte) 0};		
		this.style.setFillBackgroundColor(new XSSFColor(rgb, new DefaultIndexedColorMap()));
		this.style.setFont(font);
		
		int cellNum = 0 + startcell;
		Row headRow = sheet.createRow(row);
		
		for (String head :headers)
		{
			Cell cell = headRow.createCell(cellNum++);
			cell.setCellValue(head);
			cell.setCellStyle(style);
		}
	}

}
