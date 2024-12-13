package assignment.one;
import java.util.*;
public class PrintOrderDetails {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int orderId,quantity,totalCost;
	String name;
	System.out.println("en orderId");
	orderId=sc.nextInt();
	System.out.println("enter item name");
	name=sc.next();

	System.out.println("enter quantity");
	quantity=sc.nextInt();

	System.out.println("enter totalcost");
	totalCost=sc.nextInt();

	System.out.println("\""+orderId+":"+quantity+" of "+name+" for a total of RS "+totalCost+".");


	}

}
