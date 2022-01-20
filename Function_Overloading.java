/*Create a sample application to implement the feature of PolyMorphism*/
public class Function_Overloading {
       public void Human(String name,int age,float salary)
	   {
	       String Name=name;
		   int Age=age;
		   float Salary=salary;
		   System.out.println("Name ="+ Name + "\n Age = "+ Age + " \n Salary =" + Salary);
		   
		}
		
		// function overloading 
		
		public void Human(String name,int age ,float salary,String gender)
		{
		    String Name=name;
		   int Age=age;
		   float Salary=salary;
		   String Gender=gender;
		    System.out.println("Name =" + Name + "\n Age = "+ Age +"\n Salary " + Salary+ "\n Gender ="+ Gender);
		  }
		  public static void main(String[] args)
		  {
			  Poly obj=new Poly();
			      obj.Human("Amit Kumar",35,300000);
				  obj.Human("Subash" ,22,10000);
		  }
   }
		   
		
