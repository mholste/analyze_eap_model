package com.ag01.ebs42.export;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

import com.ag01.ebs42.transform.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.DefaultIndexedColorMap;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * Class to export analysis results to an excel workbook
 * 
 * 
 * @author Michael Holste
 *
 */
public class ExcelExporter implements TransferValues
{
	private static ExcelExporter instance;
	
	private XSSFWorkbook workbook; 
	private XSSFFont font;
	private XSSFCellStyle style;
	private Row row;
	
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
		this.setStandardStyle(IndexedColors.BLACK.getIndex());

		
		int rownum = 1;
		for (TransferArc42SystemComponent comp : componentList)
		{
			row = sheet.createRow(rownum++);
			Cell sysCell = row.createCell(0);
			sysCell.setCellValue(comp.getSystemComponentName());
			Cell idCell = row.createCell(1);
			idCell.setCellValue(comp.getCorporateId());
		}
	}

	public void exportAllConnections(ArrayList<HashMap> allConnections)
	{
		XSSFSheet sheet = workbook.createSheet("Alle Verbindungen");
		HashMap first = allConnections.get(0);
		ArrayList<String> headers = new ArrayList<String>(Arrays.asList(SYSTEMNAME,
				PROV_CORP_ID, INTERFACE_NAME, INTERFACE_TYP, CONNECTION,
				REQ_INTERFACE, INTERFACE_TYP2, REQ_SYSTEMNAME, REQ_CORP_ID));
		this.createHeaders(headers, sheet);
		this.setStandardStyle(IndexedColors.BLACK.getIndex());

		int rownum = 1;

		for (HashMap<String, String> values : allConnections)
		{
			row = sheet.createRow(rownum++);
			Cell cell1 = row.createCell(0);
			cell1.setCellValue(values.get(SYSTEMNAME));
			Cell cell2 = row.createCell(1);
			cell1.setCellValue(values.get(PROV_CORP_ID));
			Cell cell3 = row.createCell(2);
			cell3.setCellValue(values.get(INTERFACE_NAME));
			Cell cell4 = row.createCell(3);
			cell4.setCellValue(values.get(INTERFACE_TYP));
			Cell cell5 = row.createCell(4);
			cell5.setCellValue(values.get(CONNECTION));
			Cell cell6 = row.createCell(5);
			cell6.setCellValue(values.get(REQ_INTERFACE));
			Cell cell7 = row.createCell(6);
			cell7.setCellValue(values.get(INTERFACE_TYP2));
			Cell cell8 = row.createCell(7);
			cell8.setCellValue(values.get(REQ_SYSTEMNAME));
			Cell cell9 = row.createCell(8);
			cell9.setCellValue(values.get(REQ_CORP_ID));
		}
	}
	
	public void exportInterfaces(List<TransferArc42SystemInterface> interfaceList, String title)
	{
		XSSFSheet sheet = workbook.createSheet(title);		
		ArrayList<String> headers = new ArrayList<String>(Arrays.asList("Name", 
				"Art", "Corp ID", "Definierendes System", "Object Id", "Package Id", "Parent Id"));
		this.createHeaders(headers, sheet);
		this.setStandardStyle(IndexedColors.BLACK.getIndex());
		
		int rownum = 1;
		for (TransferArc42SystemInterface iface : interfaceList)
		{
			row = sheet.createRow(rownum++);
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
	
	public void exportConnections(HashMap<TransferArc42SystemInterface, List<TransferArc42InterfaceConnection>> interfaceMap, 
			List<TransferArc42SystemInterface> interfaceList)
	{
		int rownum = 0;
		XSSFSheet sheet = workbook.createSheet("Connections");
		ArrayList<String> headersInterface = new ArrayList<String>(Arrays.asList("Interface Name",
				"Art", "Corp ID", "Definierendes System", "Object Id", "Package Id", "Parent Id"));
		this.createSubHeaders(headersInterface, sheet, rownum, 0);
		this.setStandardStyle(IndexedColors.BLACK.getIndex());
		rownum++;
		for (TransferArc42SystemInterface tInterface : interfaceMap.keySet())
		{
			row = sheet.createRow(rownum++);
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
					"Verbindungsname", "Interface", "Server", "End Id", "Start Id", "Connector Id"));
			rownum++;
			this.createSubHeaders(headersConnection, sheet, rownum, 3);
			rownum++;
			for (TransferArc42InterfaceConnection iCon : iConList)
			{
				this.setStandardStyle(IndexedColors.BLACK.getIndex());
				Row row1 = sheet.createRow(rownum++);
				Cell nameCellCon = row1.createCell(3);
				nameCellCon.setCellValue(iCon.getInterfaceConnectionName());
				Cell intCell= row1.createCell(4);
				intCell.setCellValue(iCon.getInterfaceDefinition().getSystemInterfaceName());
				Cell servCell= row1.createCell(5);
				servCell.setCellValue(iCon.getServer().getSystemComponentName());
				Cell endCell= row1.createCell(6);
				endCell.setCellValue(iCon.getEaEndId());
				Cell startCell= row1.createCell(7);
				startCell.setCellValue(iCon.getEaStartId());
				Cell conCell= row1.createCell(8);
				conCell.setCellValue(iCon.getEaId());
				
				TransferArc42SystemInterface reqInterface = null;
				ArrayList<String> requiredInterface = new ArrayList<String>(Arrays.asList("Req Interface Name",
						"Art", "Corp ID", "Definierendes System", "Object Id", "Package Id", "Parent Id"));
				this.createSubHeaders(requiredInterface, sheet, rownum, 4);
				this.setStandardStyle(IndexedColors.RED.getIndex());
				rownum++;

				for (TransferArc42SystemInterface iface : interfaceList)
				{
					
					if (iface.getEaId().equalsIgnoreCase(iCon.getEaStartId()))
					{
						reqInterface = iface;
					}
				}
				if (reqInterface != null)
				{
					

					Row rowReq = sheet.createRow(rownum++);
					Cell name1Cell = rowReq.createCell(4);
					name1Cell.setCellValue(reqInterface.getSystemInterfaceName());
					Cell kind1Cell = rowReq.createCell(5);
					kind1Cell.setCellValue((reqInterface.getInterfaceType()).name());
					Cell id1Cell = rowReq.createCell(6);
					id1Cell.setCellValue(reqInterface.getCorporateId());
					Cell sys1Cell = rowReq.createCell(7);
					sys1Cell.setCellValue(reqInterface.getDefinedInSystem().getSystemName());			
					Cell obj1Cell = rowReq.createCell(8);
					obj1Cell.setCellValue(reqInterface.getEaId());
					Cell pack1Cell = rowReq.createCell(9);
					pack1Cell.setCellValue(reqInterface.getEaPackageId());
					Cell par1Cell = rowReq.createCell(10);
					par1Cell.setCellValue(reqInterface.getEaParentId());
					Cell lastCell = rowReq.createCell(11);
					lastCell.setCellValue("ReqInterf");
					//break;
				}
				
			}
			rownum++;
		}
	}

	public void exportConnections2(HashMap<TransferArc42SystemInterface, List<TransferArc42InterfaceConnection>> interfaceMap,
								  List<TransferArc42SystemInterface> interfaceList)
	{
		int rownum = 0;
		XSSFSheet sheet = workbook.createSheet("ConnectionsAll");

		ArrayList<String> headers = new ArrayList<String>(Arrays.asList("Corpotate ID",
				"Systemname", "Name der Schnittstelle", "Art der Schnittstelle",
				"Verbindung", "Name der empfangenden Schnittstelle", "Art der Schnittstelle",
				"Name des empfangenden Systems", "Corporate ID des empfangenden Systems"));
		this.createHeaders(headers, sheet);
		this.setStandardStyle(IndexedColors.BLACK.getIndex());

		for (TransferArc42SystemInterface tInterface : interfaceMap.keySet())
		{
			rownum++;

			row = sheet.createRow(rownum++);
			Cell idCell = row.createCell(0);
			idCell.setCellValue(tInterface.getCorporateId());
			Cell nameCell = row.createCell(1);
			nameCell.setCellValue(tInterface.getDefinedInSystem().getSystemName());
			Cell sysIntCell = row.createCell(2);
			sysIntCell.setCellValue(tInterface.getSystemInterfaceName());
			Cell typeCell = row.createCell(3);
			typeCell.setCellValue(tInterface.getInterfaceType().name());


			List<TransferArc42InterfaceConnection> iConList = interfaceMap.get(tInterface);

			for (TransferArc42InterfaceConnection iCon : iConList)
			{
				Cell nameCellCon = row.createCell(4);
				nameCellCon.setCellValue(iCon.getInterfaceConnectionName());

				TransferArc42SystemInterface startInterface = null;
				TransferArc42SystemInterface reqInterface = null;
				for (TransferArc42SystemInterface iface : interfaceList)
				{

					if (iface.getEaId().equalsIgnoreCase(iCon.getEaStartId()))
					{
						startInterface = iface;
						if (startInterface != null)
						{
							Cell intCell= row.createCell(5);
							intCell.setCellValue(startInterface.getSystemInterfaceName());
							Cell intTypeCell= row.createCell(6);
							intTypeCell.setCellValue(startInterface.getInterfaceType().name());

							for (TransferArc42SystemInterface ifaceR : interfaceList)
							{

								if (ifaceR.getEaId().equalsIgnoreCase(iCon.getEaEndId()))
								{
									reqInterface = ifaceR;
									if (reqInterface != null)
									{
										Cell nameReqCell = row.createCell(7);
										nameReqCell.setCellValue(reqInterface.getDefinedInSystem().getSystemName());
										Cell idReqCell = row.createCell(8);
										idReqCell.setCellValue(reqInterface.getCorporateId());
										rownum++;
										row = sheet.createRow(rownum++);
									}
								}
							}
							rownum++;
							row = sheet.createRow(rownum++);
						}
					}
				}

			}
			rownum++;
		}
	}


	public void exportGeneral(HashMap<TransferArc42SystemInterface, List<TransferArc42InterfaceConnection>> interfaceMap,
							  List<TransferArc42SystemInterface> provInterfaceList,
							  List<TransferArc42SystemInterface> reqInterfaceList)
	{

		Optional<TransferArc42SystemInterface> optInt;
		XSSFSheet sheet = workbook.createSheet("Übersicht");
		ArrayList<String> headers = new ArrayList<String>(Arrays.asList("Corpotate ID",
				"Systemname", "Name der Schnittstelle", "Art der Schnittstelle",
				"Verbindung", "Name der empfangenden Schnittstelle", "Art der Schnittstelle",
				"Name des empfangenden Systems", "Corporate ID des empfangenden Systems"));
		this.createHeaders(headers, sheet);
		this.setStandardStyle(IndexedColors.BLACK.getIndex());

		int rownum = 1;
		for (TransferArc42SystemInterface iface : provInterfaceList)
		{
			row = sheet.createRow(rownum++);
			Cell idCell = row.createCell(0);
			idCell.setCellValue(iface.getCorporateId());
			Cell nameCell = row.createCell(1);
			nameCell.setCellValue(iface.getDefinedInSystem().getSystemName());
			Cell sysIntCell = row.createCell(2);
			sysIntCell.setCellValue(iface.getSystemInterfaceName());
			Cell typeCell = row.createCell(3);
			typeCell.setCellValue(iface.getInterfaceType().name());

            List<TransferArc42InterfaceConnection> conList = interfaceMap.get(iface);
			if (conList != null)
			{
				row = this.composeReqired(conList, reqInterfaceList, true);
			}

			/*
			Optional<TransferArc42InterfaceConnection> optCon;
			List<TransferArc42InterfaceConnection> conList = interfaceMap.get(iface);
			if (conList == null)
			{
				continue;
			}
			optCon = conList.stream().filter(con -> iface.getEaId().equalsIgnoreCase(con.getEaEndId())).findAny();
			Cell intCell = row.createCell(4);
			intCell.setCellValue(optCon.get().getInterfaceConnectionName());

			optInt = Optional.of(reqInterfaceList.stream().filter(
					reqInt -> optCon.get().getEaStartId().equalsIgnoreCase(reqInt.getEaId())).
						findAny().orElse(TransferManager.createDummyTranferInterface()));
			Cell reqIntCell = row.createCell(5);
			reqIntCell.setCellValue(optInt.get().getSystemInterfaceName());
			Cell typeReqCell = row.createCell(6);
			typeReqCell.setCellValue(optInt.get().getInterfaceType().name());
			Cell nameReqCell = row.createCell(7);
			nameReqCell.setCellValue(optInt.get().getDefinedInSystem().getSystemName());
			Cell idReqCell = row.createCell(8);
			idReqCell.setCellValue(optInt.get().getCorporateId());
            */

		}
	}

	private Row composeReqired(List<TransferArc42InterfaceConnection> connections,
                                List<TransferArc42SystemInterface> reqInterfaceList, boolean init)
    {
    	int rowNum = row.getRowNum();

        for (TransferArc42InterfaceConnection con : connections)
        {
        	if (init == false)
        	{
        		row = this.workbook.getSheet("Übersicht").createRow(rowNum++);
			}
			TransferArc42SystemInterface requiredInterface = null;
        	Cell intCell = row.createCell(4);
			intCell.setCellValue(con.getInterfaceConnectionName());

			for (TransferArc42SystemInterface req : reqInterfaceList)
			{
				if (con.getEaStartId().equalsIgnoreCase(req.getEaId()))
				{
					requiredInterface = req;
					//break;
				}
			}

			if (requiredInterface != null)
			{
				Cell reqIntCell = row.createCell(5);
				reqIntCell.setCellValue(requiredInterface.getSystemInterfaceName());
				Cell typeReqCell = row.createCell(6);
				typeReqCell.setCellValue(requiredInterface.getInterfaceType().name());
				Cell nameReqCell = row.createCell(7);
				nameReqCell.setCellValue(requiredInterface.getDefinedInSystem().getSystemName());
				Cell idReqCell = row.createCell(8);
				idReqCell.setCellValue(requiredInterface.getCorporateId());
			}
            init = false;
        }
        return row;
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
		this.setHeaderStyle();
		
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
		this.setHeaderStyle();
		
		int cellNum = 0 + startcell;
		Row headRow = sheet.createRow(row);
		
		for (String head :headers)
		{
			Cell cell = headRow.createCell(cellNum++);
			cell.setCellValue(head);
			cell.setCellStyle(style);
		}
	}

	/**
	 * Convenience method for setting the headline style
	 */
	private void setHeaderStyle()
	{
		this.font.setBold(true);
		this.font.setColor(IndexedColors.BLACK.getIndex());
		byte[] rgb = { (byte) 255, (byte) 192, (byte) 0};
		this.style.setFillBackgroundColor(new XSSFColor(rgb, new DefaultIndexedColorMap()));
		this.style.setFont(font);
	}

	/**
	 * Convenience method for setting a standard font style combined with a font
	 * color
	 *
	 * @param
	 */
	private void setStandardStyle(short color)
	{
		this.font.setBold(false);
		this.font.setColor(color);
		this.style.setFont(font);
		byte[] rgb = { (byte) 255, (byte) 255, (byte) 255};
		this.style.setFillBackgroundColor(new XSSFColor(rgb, new DefaultIndexedColorMap()));
	}

}
