package assignment.one;
import java.io.*;
import java.lang.*;
import java.util.*;

public class Quadratic {

	public static void main(String[] args) {
		double x,x1;
		float a,b,c,d;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a,b,c");
		a=sc.nextFloat();
		b=sc.nextFloat();
		c=sc.nextFloat();
		d=((b*b)-(4*a*c));
		double x2=Math.sqrt(d);
		x=(-b+(x2))/(2*a);
		x1=(-b-(x2))/(2*a);
		System.out.println("the roots are"+x+","+x1+""+a);
	

	}

}
