import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;

public class MapExample {
    Scanner sc =new Scanner(System.in);
    public void MapFunction() {
        Map<Integer, String> Name = new HashMap<Integer, String>();
        Name.put(new Integer(1), "Subash");
        Name.put(new Integer(2), "Ramshek");
        Name.put(new Integer(3), "Suraj");
        Name.put(new Integer(4), "Rajnish");
        Name.put(new Integer(5), "Mithlesh");
        Name.put(new Integer(6), "Prasad");
        System.out.println("Enter what you want to do 1-Printing Map,2-keySet, 3-values,EntrySet,4-Size");
        int a=sc.nextInt();
        switch(a)
        {
            case 1:
                System.out.println("Key & values of Map " +Name);
                break;
            case 2:
                System.out.println("Map KeySet is " +Name.keySet());
                break;
            case 3:
                System.out.println("Map Value set or values " +Name.values());
                break;
            case 4:
                System.out.println( "Map Size is " +Name.size());
                break;
            default:
                System.out.println("You have entered wrong input try again !!!");
        }
    }
    public  void HashMapFunction() {
        HashMap<String, Integer> Fruit = new HashMap<String, Integer>();
        Fruit.put("Apple", 100);
        Fruit.put("Orange", 60);
        Fruit.put("Banana", 40);
        Fruit.put("Mangoes", 00);
        System.out.println("Enter what you want to do 1-Printing HashMap,2-keySet, 3-values,EntrySet,4-Size");
        int a=sc.nextInt();
        switch(a)
        {
            case 1:
                System.out.println(Fruit);
                break;
            case 2:
                System.out.println("Key set of HashMap is " +Fruit.keySet());
                break;
            case 3:
                System.out.println("Values of HashMap is " +Fruit.values());
                break;
            case 4:
                System.out.println("Size of HashMap is " +Fruit.size());
                break;
            default:
                System.out.println("You have entered wrong input try again !!!");
        }
    }
    public  void TreeMapFunction() {
        TreeMap<String ,String > City = new TreeMap<>();
        City.put("R","Ranchi");
        City.put("H", "Hazaribag");
        City.put("G", "Giridih");
        City.put("D","Dhanbad");

        System.out.println("Enter what you want to do 1-Printing TreeMap,2-keySet, 3-values,EntrySet,4-Size");
        int a=sc.nextInt();
        switch(a)
        {
            case 1:
                System.out.println("TreeMap Keys & values" +City);
                break;
            case 2:
                System.out.println("TreeMap keySet is " +City.keySet());
                break;
            case 3:
                System.out.println("TreeMap values is " +City.values());
                break;
            case 4:
                System.out.println("TreeMap size is " +City.size());
                break;
            default:
                System.out.println("You have entered wrong input try again !!!");
        }


    }
    public static void main(String[] args) {
          MapExample obj = new MapExample();
          obj.TreeMapFunction();
          obj.HashMapFunction();
          obj.MapFunction();

    }
}