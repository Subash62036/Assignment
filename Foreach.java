// for each loop program or example
import  java.lang.*;
public class Foreach{
   public static void main(String []args)
    {
		int a=5;
	
	  for(int i : a)
	  {
		  for(int j : a)
		  {
			  System.out.print("*");
			  j++;
		  }
		  i++;
	    System.out.println();
	  }
	}
}
			  
	   