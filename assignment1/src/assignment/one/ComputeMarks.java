package assignment.one;
import java.util.*;
public class ComputeMarks {

	public static void main(String[] args) {
		float physics,chemistry,maths,p,c,m;
		float total;
		String name;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter physics ,chemistry,maths marks");
		name=sc.next();
		physics=sc.nextFloat();
		chemistry=sc.nextFloat();
		maths=sc.nextFloat();
		total=((physics+chemistry+maths)/300)*100;
		System.out.println("Physics:"+physics+"% in Physics,chemistry:"+chemistry+" % in chemistry,Maths:"+maths+" % in maths");
		
		System.out.println("total;"+total );
		

	}

}
