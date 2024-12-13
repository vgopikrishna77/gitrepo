
package assignment.one;

import java.util.*;

public class RandomOperationMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r=(int) (Math.floor(Math.random()*9)+1);
		int r1=(int)(Math.floor(Math.random()*9)+1);
		int r2=(int) (Math.floor(Math.random()*6)+1);
	int r4;	
switch(r2) {
case 1:{
	r4=r1+r;
	System.out.println("the + operation is:"+r4);
	break;
}
case 2:{
	r4=r1-r;
	System.out.println("the - operation is:"+r4);
	break;
}
case 3:{
	r4=r1*r;
	System.out.println("the * operation is:"+r4);
	break;
}
case 4:{
	r4=r1/r;
	System.out.println("the / operation is:"+r4);
	break;
}
case 5:{
	r4=r1%r;
	System.out.println("the % operation is:"+r4);
	break;
}
default:
	System.out.print("operation not correct");
	
}
}
	        // Generate two random numbers between 1 and 6
	        

	        // Calculate the sum
	       

	        // Print the result
	    
	}

	


