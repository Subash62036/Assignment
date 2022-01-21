import java.util.*;

class HashCodeExample1{
    int []Keys ;
    String []Values;
    Scanner sc = new Scanner(System.in);
    public  void HashMapFunciton(){

        HashMap<int[],String[]> Enteries = new HashMap<>();
        System.out.println("Enter any five pairs values(Key & Values) !!! First Enter Keys");
        for(int i=0;i<5;i++) {
            Keys[i] = sc.nextInt();
        }
        System.out.println("Enter any five Values !!!!!!!");
        for(int i=0;i<5;i++) {
            Values[i] = sc.nextLine();
        }
        // Stored above values into
        Enteries.put(Keys,Values);
    }

}
public class HashCodeExample {
    int[] Keys;
    String[] Values;
    Scanner sc = new Scanner(System.in);

    public void TreeMapFunction() {

        TreeMap<int[], String[]> Entries = new TreeMap();
        System.out.println("Enter any five pairs values(Key & Values) !!! First Enter Keys");
        for (int i = 0; i < 5; i++) {
            Keys[i] = sc.nextInt();
        }
        System.out.println("Enter any five Values !!!!!!!");
        for (int i = 0; i < 5; i++) {
            Values[i] = sc.nextLine();
        }
        // Stored above values into TreeMap
        Entries.put(Keys, Values);
    }

    // Main Method
    public static void main(String[] args) {
        HashCodeExample object = new HashCodeExample();
        HashCodeExample1 object2 = new HashCodeExample1();

       // Implementing hashCode and equals();
        if (object.equals(object2)) {
            System.out.println("Equal!!!!!!!!!");
        } else {
            System.out.println(object.hashCode());
            System.out.println(object2.hashCode());
        }
        // I have done only on the queries of seniors
        Set<Object> obj = new HashSet<Object>() ;
        obj.add(object);
        obj.add(object2);
        System.out.println(obj);

    }

}