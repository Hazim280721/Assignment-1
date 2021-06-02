import java.util.Scanner;
public class inventory {//userdefine class
	private String item;
	private int quantity;
	String date;
	double price;
	Scanner sc = new Scanner(System.in);
	
	inventory(){
		System.out.println("Enter item to load: ");
		item=sc.next();
		System.out.println("Enter quantity: ");
		quantity=sc.nextInt();
		System.out.println("Enter price: ");
		price=sc.nextDouble();
		System.out.println("Enter date load: ");
		date=sc.next();
		
	}
	void foodItem() {
		System.out.println("Date load: "+date);
		System.out.println("==Restaurant Inventory==");
		System.out.println("Item\t\tQuantity\tPrice");
		System.out.println("1.Sugar"+"\t\t"+10+"\t\t"+1.50);
		System.out.println("2.Cofee"+"\t\t"+20+"\t\t"+2.50);
		System.out.println("3.Salt"+"\t\t"+5+"\t\t"+3.00);
		System.out.println("4.Rice"+"\t\t"+3+"\t\t"+7.00);
		System.out.println("5."+item+"\t\t"+quantity+"\t\t"+price);
	}
}

