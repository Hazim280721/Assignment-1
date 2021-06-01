
import java.util.Scanner;
public class reservation{//user define class
	private String date;
	private double time;
	private int size;
	private int fp;
	private int phone;
	Scanner sc = new Scanner(System.in);
	
reservation(){
	System.out.println("Enter date: ");
	date=sc.next();
	System.out.println("Enter time: ");
	time=sc.nextDouble();
	System.out.println("Enter party size: ");
	size=sc.nextInt();
	System.out.println("Enter phone no: ");
	phone=sc.nextInt();
	foodPackage();
	
}

void foodPackage() {
	
	System.out.println("1.Western Food\n2.Thai Food\n3.Malay Food");
	System.out.println("Enter Food Package: ");
	fp=sc.nextInt();
	
	if(fp==1) {
		System.out.println("===Your Reservation Detail===");
	System.out.println("\nWestern Food "+"\n1.Chicken Chop\n2.Burger\n3.Apple Juice");	
	System.out.println("Date: "+date);
	System.out.println("Time: "+time);
	System.out.println("Party size: "+size+" Person");
	System.out.println("Phone No: "+phone);
	}
	if(fp==2) {
		System.out.println("===Your Reservation Detail===");
		System.out.println("\nThai Food "+"\n1.Tom Yam\n2.Phad Thai\n3.Grape Juice");	
		System.out.println("Date: "+date);
		System.out.println("Time: "+time);
		System.out.println("Party size: "+size+" Person");
		System.out.println("Phone No: "+phone);
		}
	if(fp==3) {
		System.out.println("===Your Reservation Detail===");
		System.out.println("\nMalay Food "+"\n1.Nasi Goreng\n2.Satay\n3.Orange Juice");	
		System.out.println("Date: "+date);
		System.out.println("Time: "+time);
		System.out.println("Party size: "+size+" Person");
		System.out.println("Phone No: "+phone);
		}
}



}