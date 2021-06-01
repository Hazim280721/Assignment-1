
import java.util.Scanner;
public class employee{//user define class
	
	private String name;
	private int salary;
	Scanner sc = new Scanner(System.in);	
	employee(String n, int s)
	{
		 this.name = n;
		 this.salary = s;
		System.out.print("====The Employee List====\n");
		System.out.print("\nThe Employee name: "+name+"\nMonthly Salary: RM "+salary+"\nRole: Waiter");
		
		}
	void list() {
		System.out.print("\nThe Employee name: Abu"+"\nMonthly Salary: RM 4000"+"\nRole: Chef");
		System.out.print("\nThe Employee name: Shafiq"+"\nMonthly Salary: RM 3200"+"\nRole: Chef");
		System.out.print("\nThe Employee name: Ahmad"+"\nMonthly Salary: RM 1900"+"\nRole: Worker");
		System.out.print("\nThe Employee name: Yusoff"+"\nMonthly Salary: RM 1950"+"\nRole: Worker");
	}
	
}