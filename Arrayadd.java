/*WAP to add all the elements of an array, WAP
to print second largesr element of an array.*/
import java.util.*;
public class Arrayadd
 {
   public static void main(String [] args)
    {
	   int arr[] =new int [5],sum=0,large=0,seclarge=0;
	   System.out.println("Enter any five nos into array");
        Scanner ref=new Scanner(System.in);
         for(int i=0;i<5;i++)
           {
             arr[i]=ref.nextInt();
            }
       // for sum
	   
	   // first i am going to find large no 
	     large=arr[0];
         for(int i=0;i<5;i++)
            {
              sum=sum+arr[i];	
			  if(large<arr[i])
			  {
				  large=arr[i];
			  }
			}
			
		   /*first  of all i am initilizing seclarge variable with any lement of given array except large value 
		   this block only for that*/
			
			for(int i=0;i<5;i++)
			{
				if(arr[i]!=large)
				{
				seclarge=arr[i];
				  break;
				}
				
			}
			// Now i am seaching second large no with this block;
			for(int i=0;i<5;i++)
			{
				 if(seclarge<arr[i] && arr[i]!=large)
				 {
					 seclarge=arr[i];
				 }
			}
			
				
       System.out.println("Sum of array lements =" + sum +"\n Second large value of array="+ seclarge);
	   
	}
 }	