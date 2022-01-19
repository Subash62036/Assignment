// Do-while loop program
import java.util.*;
public class Do
{
  public static void main(String[] args)
   {
	   
     int sum=0,i=0;
     System.out.println("Ente any number to find out some of natural series like 1+2+3+.....nth  term");
	  Scanner ob=new Scanner(System.in);
	   int term=ob.nextInt();
	   do
	    {
		   i++;
		  sum=sum+i; 
		}while(i<term);
		  System.out.println("Sum Of Natural Series is = " + sum);
	 }
 
}