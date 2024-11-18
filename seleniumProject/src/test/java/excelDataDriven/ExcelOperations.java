package excelDataDriven;

public class ExcelOperations 
{

	public static void main(String[] args) throws Exception 
	{
		ExcelAPI e = new ExcelAPI("C:\\Users\\DELL\\Desktop\\testdata1.xlsx");
		System.out.println("Rows Count : " + e.getRowCount("login"));
		System.out.println("Column Count : " +  e.columnCount("login"));
		
		System.out.println(e.getCellData("login", 0, 1));
		System.out.println(e.getCellData("login", "Password", 1));
		e.setCellData("login", 4, 2, "Aborted");
		
	}

}
