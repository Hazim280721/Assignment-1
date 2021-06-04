
import java.util.Scanner;
public class employee {//user define class
	String rn;
	private String name;
	private int salary;
	Scanner sc = new Scanner(System.in);
	
	employee(){
    this.rn="    Crowne Restaurant";
	}
	employee(String n, int s)
	{
		 this.setName(n);
		 this.salary = s;
	
		System.out.print("\nThe Employee name: "+getName()+"\nMonthly Salary: RM "+salary+"\nRole: Waiter");
		
		}
	
	employee(String name ){
		this.setName(name);
	}
	void list() {
		System.out.print("\nThe Employee name: Abu"+"\nMonthly Salary: RM 4000"+"\nRole: Chef");
		System.out.print("\nThe Employee name: Shafiq"+"\nMonthly Salary: RM 3200"+"\nRole: Chef");
		System.out.print("\nThe Employee name: Ahmad"+"\nMonthly Salary: RM 1900"+"\nRole: Worker");
		System.out.print("\nThe Employee name: Yusoff"+"\nMonthly Salary: RM 1950"+"\nRole: Worker");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}