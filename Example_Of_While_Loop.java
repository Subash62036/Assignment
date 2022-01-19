import java.util.Scanner;
public class Example_Of_While_Loop {
  public static void main(String[]args) {
    while(true) {
         System.out.println("Enter any two number");
         Scanner ob=new Scanner(System.in);
         int n1=ob.nextInt();
         int n2=ob.nextInt();
         System.out.println("Enter 1-Add,2-Substract,3-Mul,4-Divide,5-Module,6-Exit");
         Scanner obj=new Scanner(System.in);
         int a=obj.nextInt();
         switch(a) {
             case 1:
                  System.out.println("Sum of given no =" + (n1+n2));
                  break;
            case 2:
                 System.out.println("Substraction of given no =" + (n1-n2));
                 break;
            case 3:
                 System.out.println("Multiplication of given no="+ (n1*n2));
                 break;
            case 4:
                 System.out.println("Division of given no =" + (n1/n2));
                 break;
            case 5:
                 System.out.println("Modular Division of given no="+ (n1%n2));
                 break;
            case 6:
                  System.exit(0);
            default:
                 System.out.println("Please Enter valid input!!! try again");
                 break;
           }
    }
  }
}
     
                 
                    
