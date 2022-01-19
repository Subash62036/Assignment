/*create a class 'Person' with 4 fields of different type and initialize all the
fields using setter and get the value of fileds by using getter abd display
the value of all the fields.*/

import java.util.*;
class Person{
	String Name;
	int Roll;
	float Fee;
	long Mobile_no;
   public void setter()
     {
	   
	   System.out.println("Enter Name, Roll,Fee & Mobile_no of condidate");
	   Scanner ref=new Scanner(System.in);
	   Name=ref.nextLine();
	    Roll=ref.nextInt();
	    Fee=ref.nextFloat();
	    Mobile_no=ref.nextLong();
	   }
	 public void getter()
	 {
		 System.out.println( " Name = " + Name + "\n Roll Number=  " + Roll +  "\n Fee = "  + Fee  +"\n Mobile_no " + Mobile_no);
	 }
}

public class PersonG{
	public static void main(String[]args)
	{
		 Person obj=new Person();
		 obj.setter();
		 obj.getter();
	}
}
	   