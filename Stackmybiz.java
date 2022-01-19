/*  Create a sample application to implement the feature of Inheritance*/
class Honeycum
{
   	String Name;
	 int Id;
     float Salary;
      void employee(String name,int id,float salary)
	      {
	         Name=name;
		     Id=id;
		     Salary=salary;
		   }
	  void  display( )
	      {
		    System.out.println("Name =" +Name + "\n Employee Id =" +Id + "\n Employee Salary=" + Salary );
	       }  
 }
 
 public class Stackmybiz extends Honeycum{
       String Desktop;
	   float Bonus_salary;
	   public void facilities( String desktop,float bonus_salary)
	   {
	       Desktop=desktop;
		   Bonus_salary=bonus_salary;
		 }
	   public void show()
	   {
		    System.out.println("Employee Bonu Salary=" + Bonus_salary + " \n Employee Desktop " + Desktop);
	   }
	public static void main(String [] args)
	{
		 Stackmybiz obj=new Stackmybiz();
		 obj.employee("Subash",10001,10050);
		 obj.display();
		 obj.facilities("Benq",400);
		 obj.show();
	}
			
 }
 
 