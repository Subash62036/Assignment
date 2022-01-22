import java.util.*;
class exception{
       private int a,b;
       public void get()
         {
            System.out.println("Enter any two integer values for division");
            Scanner sc=new Scanner(System.in);
            a=sc.nextInt();
            b=sc.nextInt();
			return();
         }
       public void show()
          {
             System.out.println(a/b);
          }
      }
	  
	  
public class main{
     public static void main(String[] args)
         {
           try{
			   // creating object of exception class 
			   
                exception obj=new exception();
                 obj.get();
                 obj.show();
              }
           catch(ArithmeticException e)
		   { // if we get any mathematic error then this section will excute ;
			      System.out.println(" You have entered something wrong please try again");
				 
		   }
	     }
}