import java.util.Scanner;
public class inventory{//userdefine class
	private String item;
	private int quantity;
	String date;
	Scanner sc = new Scanner(System.in);
	
	inventory(){
		System.out.println("Enter item to load: ");
		item=sc.next();
		System.out.println("Enter quantity: ");
		quantity=sc.nextInt();
		System.out.println("Enter date load: ");
		date=sc.next();
		
	}
	void foodItem() {
		System.out.println("Date load: "+date);
		System.out.println("==Restaurant Inventory==");
		System.out.print("1.Mineral Water-10\n2.Coffee-5\n3.Cheese-2\n4.Rice-8\n5."+item+"-"+quantity);
	}
}

