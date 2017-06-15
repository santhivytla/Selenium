

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataDrivenTest {
	public static void main(String[] args) throws  IOException, BiffException
	{
		File f=new File("c:/DataDrivenTest.XLSX");
		
			Workbook w=Workbook.getWorkbook(f);
			Sheet s=w.getSheet(0);
			int rows=s.getRows();
			int columns=s.getColumns();
			System.out.println(rows);
			System.out.println(columns);
		
	}

}
