import java.util.Scanner; 
public class restaurant { //user define class

	
private int order;	
private int employee;	
private int finance;	
private int reservation;
private int inventory;
Scanner sc = new Scanner(System.in);//predefine class

 restaurant(){// constructor no argument
	 
	 
}
void admin() {
	int admin;
	int option = 0;
	System.out.println("Select Your Option");
	System.out.println("1.Admin\n2.User");
	admin=sc.nextInt();
	if(admin==1) {
		System.out.println("Choose Category");
		System.out.print("1.Employee\n"+"2.Finance\n"
				 +"3.Inventory\n");
        option=sc.nextInt();
		if(option==1) {
			employee a=new employee("Ali",2000); //constructor 2 argument
	        a.list();
        }
		if (option==2) {
			finance a=new finance(); 
		       System.out.println("Total Sales this month: "+a.totalSale);
		   	   System.out.println("Total Operation costs this month: "+a.operationCost);
		   	   System.out.println("Total net profit this month: "+a.profit);
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
			 order a=new order(3);//constructor 1 argument
			    System.out.println("-------------------------------------------------");
				System.out.println("\t\tThis is your receipt");
				System.out.println("Counter: "+2+"\t\t\t\tStaff: "+"Hazim");
				System.out.println("Table No: "+a.table);
				System.out.printf("Total price  : RM %.2f\n",a.realPrice);
				System.out.printf("Paid         : RM %.2f\n",a.pay);
				System.out.printf("The change  : RM %.2f\n",a.change);
				System.out.println("\t\tThank you buy with us");
				System.out.println("-------------------------------------------------");	
				System.out.println();
		}
		if(option==2) {
			reservation a=new reservation(); 
	    	System.out.println("Date: "+a.date);
	    	System.out.println("Enter time: "+a.time);
	    	System.out.println("Enter party size: "+a.size+" Person");
		}
	}
}
public int getOrder() {
	return order;
}

public void setOrder(int order) {
	this.order = order;
}


public int getEmployee() {
	return employee;
}

public void setEmployee(int employee) {
	this.employee = employee;
}

public int getFinance() {
	return finance;
}


public void setFinance(int finance) {
	this.finance = finance;
}

public int getReservation() {
	return reservation;
}




public void setReservation(int reservation) {
	this.reservation = reservation;
}

public int getInventory() {
	return inventory;
}




public void setInventory(int inventory) {
	this.inventory = inventory;
}

public class order{//user define class

public double change;
public double pay;
public double realPrice;
private int food;
private int quantity;
private int totalPrice;
private int drink;
private int quantity2;
private double totalPrice2;
int table;

order(int table){
	menu();
	foodOrder();
	drinkOrder();
	balance(table,totalPrice,totalPrice2);
	
}

public void menu() {
	System.out.println("\tWelcome to MyRestaurant ");
	System.out.println(" ----------------Menu----------------");
	System.out.println("\t---Food---");
	System.out.println(" 1.Nasi Lemak"+ "  RM4.00");
	System.out.println(" 2.Nasi Ayam"+ "   RM5.00");
	System.out.println(" 3.Nasi Kandar"+ " RM7.00");
	System.out.println(" 4.Nasi Kukus"+ "  RM5.00");
	System.out.println("\t---Drink---");
	System.out.println(" 1.Air Sirap"+ "   RM1.00");
	System.out.println(" 2.Air Limau"+ "   RM1.50");
	System.out.println(" 3.Air Teh"+ "     RM2.00");
	System.out.println(" 4.Air Bandung"+ " RM1.80");
	
}

public void foodOrder() {
	System.out.print("\nPlease enter the food code : ");
	this.food = sc.nextInt();
	if(food==1){ 
		System.out.println("You order Nasi Lemak");
		System.out.print("How many Nasi Lemak you want to Buy? :");
		this.quantity =sc.nextInt();//quantity that you want
		this.totalPrice =(quantity*4);
		
		
	}
	if(food==2){
		System.out.println("You order Nasi Ayam");
		System.out.print("How many Nasi Ayam you want to Buy? :");
		this.quantity =sc.nextInt();//quantity that you want
		this.totalPrice =(quantity*5);
		
	}
	if(food==3){
		System.out.println("You order Nasi Kandar");
		System.out.print("How many Nasi Kandar you want to Buy? :");
		this.quantity =sc.nextInt();//quantity that you want
		this.totalPrice =(quantity*7);
		
	}
	if(food==4){
		System.out.println("You order Nasi Kukus");
		System.out.print("How many Nasi Kukus you want to Buy? :");
		this.quantity =sc.nextInt();//quantity that you want
		this.totalPrice =(quantity*5);
	    }
		
}
public void drinkOrder() {
	
	System.out.print("\nPlease enter the drink code : ");
	this.drink= sc.nextInt();
	if(drink==1){
		System.out.println("You order Air Sirap");
		System.out.print("How many Air sirap you want to Buy? :");
		this.quantity2 =sc.nextInt();//quantity that you want
		this.totalPrice2 =(quantity2*1.00);
		
		
	}
	if(drink==2){
		System.out.println("You order Air Limau");
		System.out.print("How many Air Limau you want to Buy? :");
		this.quantity2 =sc.nextInt();//quantity that you want
		this.totalPrice2 =(quantity2*1.50);
		
	}
	if (drink==3){
		System.out.println("You order Air Teh");
		System.out.print("How many Air Teh you want to Buy? :");
		this.quantity2 =sc.nextInt();//quantity that you want
		this.totalPrice2 =(quantity2*2.00);
		
	}
	 if(drink==4){
		System.out.println("You order Air Bandung");
		System.out.print("How many Air Bandung you want to Buy? :");
		this.quantity2 =sc.nextInt();//quantity that you want
		this.totalPrice2 =(quantity2*1.80);
		
	}	

}
public void balance(int table,double totalPrice,double totalPrice2) { 
	this.table=table;
	double change = 0;
	double realPrice = (totalPrice+totalPrice2);
	System.out.println("Total price is : RM " +realPrice); 
	System.out.print("Enter a payment : RM ");
	double pay = sc.nextDouble();//enter your payment 
	if(pay < realPrice){
	System.out.println("Not enough payment");
	}else{
	change = pay-realPrice;//money change
	System.out.printf("The change is : RM%.2f\n",change);
	}
	
}

}
public class employee{//user define class
	
	employee(String n, int s)
	{
		String name = n;
		int salary = s;
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

public class finance{//user define class
	private double profit;
	private double totalSale;
	private double saleWeek1;
	private double saleWeek2;
	private double saleWeek3;
	private double saleWeek4;
	private double operationCost;
	
finance(){
	System.out.print("Enter sales for week 1: ");
	saleWeek1 = sc.nextDouble();
	System.out.print("Enter sales for week 2: ");
	saleWeek2 = sc.nextDouble();
	System.out.print("Enter sales for week 3: ");
	saleWeek3 = sc.nextDouble();
	System.out.print("Enter sales for week 4: ");
	saleWeek4 = sc.nextDouble();
	System.out.print("Enter Operation cost this month: ");
	operationCost=sc.nextDouble();
	netSale(saleWeek1,saleWeek2,saleWeek3,saleWeek4);
}
void netSale(double saleWeek1,double saleWeek2,double saleWeek3,double saleWeek4) {
	 totalSale=saleWeek1+saleWeek2+saleWeek3+saleWeek4;
	 profit=totalSale-operationCost;

}

public double getOperationCost() {
	return operationCost;
}
public void setOperationCost(double operationCost) {
	this.operationCost = operationCost;
}

}

public class reservation{
	private String date;
	private double time;
	private int size;
	public int fp;
	
reservation(){
	System.out.println("Enter date: ");
	date=sc.next();
	System.out.println("Enter time: ");
	time=sc.nextDouble();
	System.out.println("Enter party size: ");
	size=sc.nextInt();
	foodPackage();
}

void foodPackage() {
	int fp;
	System.out.println("1.Western Food\n2.Thai Food\n3.Malay Food");
	System.out.println("Enter Food Package: ");
	fp=sc.nextInt();
	if(fp==1) {
		System.out.println("===Your Reservation Detail===");
	System.out.println("\nWestern Food "+"\n1.Chicken Chop\n2.Burger\n3.Apple Juice");	
	}
	if(fp==2) {
		System.out.println("===Your Reservation Detail===");
		System.out.println("\nThai Food "+"\n1.Tom Yam\n2.Phad Thai\n3.Grape Juice");	
		}
	if(fp==3) {
		System.out.println("===Your Reservation Detail===");
		System.out.println("\nMalay Food "+"\n1.Nasi Goreng\n2.Satay\n3.Orange Juice");	
		}
}
public String getDate() {
	return date;
}

public void setDate(String date) {
	this.date = date;
}

public double getTime() {
	return time;
}

public void setTime(double time) {
	this.time = time;
}

public int getSize() {
	return size;
}

public void setSize(int size) {
	this.size=size;
}
}

public class inventory{//userdefine class
	String item;
	int quantity;
	
	inventory(){
		System.out.println("Enter item to load: ");
		item=sc.next();
		System.out.println("Enter quantity: ");
		quantity=sc.nextInt();
		
	}
	void foodItem() {
		System.out.println("==Restaurant Inventory==");
		System.out.print("1.Mineral Water-10\n2.Coffee-5\n3.Cheese-2\n4.Rice-8\n5."+item+"-"+quantity);
	}
}




}//end class


