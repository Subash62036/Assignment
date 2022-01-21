import java.util.ArrayList;
import java.util.Scanner;

public class ExampleArrayList {
    ArrayList<Integer> ar= new ArrayList<Integer>();
    public void get(){
        System.out.println("Enter any five integer no ");
        Scanner sc =new Scanner(System.in);
        for(int i=0; i<5;i++){
            ar.add(sc.nextInt(i));
        }
    }
    public  void show (){
        for (int i=0; i<5;i++) {
            System.out.println(ar.get(i));
        }
    }
    //  main function
    public static void main(String[] args)
    {
      ExampleArrayList object=new ExampleArrayList();
      object.get();
      object.show();
    }
}
