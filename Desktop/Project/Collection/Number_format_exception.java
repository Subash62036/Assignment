import java.util.*;
public class Number_fomate_exception
{
	  private String Name;
	  private long Roll ;
	  private int Fee;
	   public void get(String name,long roll, int fee)
	     {
	        Name = name;
		    Roll = roll;
		     Fee=fee;
	     }
	   public void show()
	      {
		     System.out.println(" Name "+ Name+ "\n Roll " + Roll + "\n Fee" + Fee);
	       }
	 public static void main(String [] args)
	    {
			Number_fomate_exception obj=new Number_fomate_exception();
			    try{
					 obj.get("Rahul",101,10000000000000000000000);
				      obj.show();
				     }
				catch(NumberFormatException e)
				     {
					      System.out.println("Please NumberFormatException");
					 }
		}	

}		
				
	    