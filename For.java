//program related to for loop
import java.util.Scanner;
public class For {
   public static void main(String[]args) {
	         System.out.println("Enter any number for checking weather no is prime or not");
		 Scanner sc=new Scanner(System.in);
		 int num=sc.nextInt();
		 int flag=1;
		 for(int i=2;i<=num/2;i++) {
			    if(num%2==0){
				flag=0;
			   }
		 }
		if(flag==1)
		    System.out.println("Number is prime");
		else
		    System.out.println("Number is not prime");
	    }
 }
 
