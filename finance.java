
import java.util.Scanner;
public class finance{//user define class
	private double profit;
	private double totalSale;
	private double saleWeek1;
	private double saleWeek2;
	private double saleWeek3;
	private double saleWeek4;
	private double operationCost;
	Scanner sc = new Scanner(System.in);
	
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
	 profit=(totalSale-operationCost);
	 System.out.println("Total Sales this month: "+totalSale);
 	 System.out.println("Total Operation costs this month: "+operationCost);
 	 System.out.println("Total net profit this month: "+profit);

}


}
