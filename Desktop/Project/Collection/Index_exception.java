  // exception handling second exmple
  // Array index out of bound exception;
  import java.util.*;
  class index
    {
            int arr[]=new int [5],i;
			public void getter()
			 {
			 System.out.println("Enter any five no");
			 Scanner sc=new Scanner(System.in);
			   for( i=0;i<5;i++)
			     {
			         arr[i]=sc.nextInt();
			      }
			 }
			 
		 public void display()
			{ 
			    System.out.println(arr[5]);
		    }
			
			
		
	}
		
public class Index_exception extends index{
	  public static void main(String[] args)
	  {
		   try{
			       Index_exception object=new Index_exception();
				  object.getter();
				  object.display();
		     }
			 
		   catch(ArrayIndexOutOfBoundsException e)
		   {
			   System.out.println(" You have trying  to access out of index of array elements");
		   }
		   
		   finally
		   {
			    for ( int i=0;i<5;i++)
				{
					for(int j=3;j>i;j--)
					{
						 System.out.print(" ");
					}
					for(int k=0;k<=i;k++)
					{
				      System.out.println(arr[i]);
					}
				}
				
		   }
}

}

			    
         