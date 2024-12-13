package assignment.one;

import java.util.Scanner;

public class SpeedConversion {

	public static void main(String[] args) {
		float m,km,h;
		Scanner c=new Scanner(System.in);
		km=c.nextFloat();
		h=c.nextFloat();
		
		m=(float) ((km)*0.277778);
		System.out.print(m);
		

	}

}
