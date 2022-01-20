import java.util.*;

public class ExampleList {
    public static void main(String [] args){
       List<String> al = new ArrayList<String>();
       al.add("Subash");
       al.add("Rahul");
       al.add("Pankaj");// for accessing single value from list by ref.get(index);
       for(int i=0; i<al.size();i++) {
           System.out.println(al.get(i));
       }
    }
}
