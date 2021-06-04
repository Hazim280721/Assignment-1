import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		restaurant b=new restaurant();
		System.out.println(b.getInfo());
		b.aboutUs();
		b.printInfo();
		int admin;
		int option;
		System.out.println("Select Your Option");
		System.out.println("1.Admin\n2.User");
		admin=sc.nextInt();
		if(admin==1) {
			System.out.println("Choose Category");
			System.out.print("1.Employee\n"+"2.Finance\n"
					 +"3.Inventory\n");
	        option=sc.nextInt();
			if(option==1) {
				employee c=new employee();//constructor no argument
				System.out.println(c.rn);
				employee d=new employee("Aiman Salim");//constructor 1 arfument
				System.out.println("====The Employee List====\n");
				System.out.print("\nThe Supervisor name: "+d.getName());
				System.out.print("\nThe Monthly Salary: 4000");
				employee a=new employee("Ali",2000); //constructor 2 argument
				a.list();
				
				
	        }
			if (option==2) {
				finance a=new finance(); //constructor no argument
				System.out.println(a);  
			}
			if(option==3) {
				inventory a=new inventory();
		        a.foodItem();
			}
				
		}
		if(admin==2) {
			System.out.println("Choose Category");
			System.out.print("1.Order\n"+"2.Reservation\n");
			option=sc.nextInt();
			if(option==1) {
				 restaurant a=new order(3);//constructor 1 argument
				 System.out.println(a); 
				 a.printInfo();//polymorphism
			}
			if(option==2) {
				restaurant a=new reservation(); 
				System.out.println(a);
				a.printInfo();//polymorphism
		    	
			}
		}	

	}

}
