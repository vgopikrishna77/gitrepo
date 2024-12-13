package assignment.one;
import java.util.*;
public class TimeConversion {

	public static void main(String[] args) {
		int h,m,s,t,k,l,n;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		h=t/3600;
		k=h*3600;
		l=t-k;
		n=l/60;
		s=t-((h*3600)+(n*60));
		System.out.println(h);
		System.out.println(n);

		System.out.println(s);

		
		

	}

}
