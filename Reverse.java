//WAP to reverse a number
import java.util.*;

class Reverse{
	  public static void main(String [] args)
	  {
		reverse=0,d;
		  
		  System.out.println("Enter any no for reverse");
		  Scanner ref=new Scanner(System.in);
		  int n=ref.nextInt();
		  while(n!=0)
		  {
			  d=n%10;
			  n=n/10;
			  reverse=reverse*10 +d;
			  
		  }
		  System.out.println("Reverse of given no =" + reverse);
		
	  }
}

