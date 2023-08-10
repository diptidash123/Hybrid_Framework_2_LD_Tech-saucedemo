package generics;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLibrary implements Autoconstant
{
  //excelfile reader scripting
  public static String Excelfilefecth(String path,String sheet,int row,int cell) throws IOException
  {
	
	FileInputStream file=new FileInputStream(excelfilepath);
	XSSFWorkbook wide=new XSSFWorkbook(file);
    String contain=wide.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
	return contain;
	  
  }
}
