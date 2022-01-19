/*Create a class 'Person' with 4 fields of different type and initialize all the
fields using constructor and print all the value of fields*/
class Person{
        public Person( String name,int roll, float fee,long mobile_no)
		{
            String Name=name;
		    int Roll=roll;
		    float Fee=fee;
			long Mobile_No=mobile_no;
			System.out.println("Name =" + Name + "Roll = " + Roll + "Fee= " + Fee + "Mobile_No=" + Mobile_No);
		   
			}
	public static void main(String[] args)
	{
		
		Person obj=new Person("subash",1000,500,620365239);
	}
}