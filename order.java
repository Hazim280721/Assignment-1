import java.util.Scanner;

public class order {
//user define class

		private double change;
		private double pay;
		private double realPrice;
		private int food;
		private int quantity;
		private int totalPrice;
		private int drink;
		private int quantity2;
		private double totalPrice2;
		int table;
		Scanner sc = new Scanner(System.in);
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
			change = 0;
			realPrice = (totalPrice+totalPrice2);
			System.out.println("Total price is : RM " +realPrice); 
			System.out.print("Enter a payment : RM ");
			pay = sc.nextDouble();//enter your payment 
			if(pay < realPrice){
			System.out.println("Not enough payment");
			}else{
			change = pay-realPrice;//money change
			System.out.printf("The change is : RM%.2f\n",change);
			}
			 System.out.println("-------------------------------------------------");
				System.out.println("\t\tThis is your receipt");
				System.out.println("Counter: "+2+"\t\t\t\tStaff: "+"Hazim");
				System.out.println("Table No: "+table);
				System.out.printf("Total price  : RM %.2f\n",realPrice);
				System.out.printf("Paid         : RM %.2f\n",pay);
				System.out.printf("The change  : RM %.2f\n",change);
				System.out.println("\t\tThank you buy with us");
				System.out.println("-------------------------------------------------");	
				System.out.println();
			
		}

		}

