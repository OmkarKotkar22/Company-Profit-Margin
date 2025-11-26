/*5. Company Profit Margin
Task:
 Create a Company class with fields: companyName, revenue, and expenses.
 In the main method:
Create a Company object.
Calculate the profit margin (profit/revenue) and display the result.
*/

package Margin;

import java.util.*;
public class Profit_Margin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array: ");
		int size = sc.nextInt(); 
		
		Company c[] = new Company[size];
		
		int Id = 0, Revenue = 0, Expenses = 0;
		String Name = " ";
		
		for(int i = 0; i < c.length; i++)
		{
			c[i] = new Company();
			
			System.out.println("Enter the Company Name: ");
			Name = sc.next();
			
			System.out.println("Enter the Revenue of Company: ");
			Revenue = sc.nextInt();
			
			System.out.println("Enter the Expenses of Company: ");
			Expenses = sc.nextInt();
			
			c[i].setCompanyName(Name);
			c[i].setRevenue(Revenue);
			c[i].setExpenses(Expenses);
			
			System.out.println("Id \t Company Name \t Revenue \t Expenses");
			System.out.println(c[i].getId() + "\t" + c[i].getCompanyName() + "\t\t" + c[i].getRevenue() + "\t\t" + c[i].getExpenses());
			
			int profit = Revenue - Expenses;
			System.out.println("Profit of Company: " + profit);
			
			double profit_margin = (double)profit / Revenue;
			System.out.println("Profit Margin of Company: " + profit_margin);
		}
	}
}
