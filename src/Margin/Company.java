package Margin;

public class Company {
	private static int counter = 0;
	private int id;
	private String companyName;
	private int revenue;
	private int expenses;
	
	public Company()
	{
		counter++;
		id = counter;
	}
	public int getId()
	{
		return id;
	}
	
	public void setCompanyName(String cn)
	{
		companyName = cn;
	}
	public String getCompanyName()
	{
		return companyName;
	}
	
	public void setRevenue(int r)
	{
		revenue = r;
	}
	public int getRevenue()
	{
		return revenue;
	}
	
	public void setExpenses(int e)
	{
		expenses = e;
	}
	public int getExpenses()
	{
		return expenses;
	}
}
