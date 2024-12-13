package assignment.one;

import java.util.Scanner;

public class WeightConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double kg,poun;
		double kgg;
		double pound;
		Scanner sc=new Scanner(System.in);
		poun=sc.nextDouble();
		pound=453.592;
		kgg=453.592*poun;
		kg=kgg/1000;
		System.out.print(kg);
		

	}

}
