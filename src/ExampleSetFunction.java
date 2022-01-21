/* All mathematical operation of set like
   -- Union
   -- Intersection
   -- Difference
   --
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import  java.util.Set;
public class ExampleSetFunction {
    public void SetOperation() {
        // ArrayList
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        System.out.println("Enter any five nos");
        Scanner p1 = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            arrayList1.add(p1.nextInt());
        }
        // Second ArrayList
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        System.out.println("Enter any five nos");
        Scanner p2 = new Scanner(System.in);
        for(int i=0;i<5;i++) {
            arrayList2.add(p2.nextInt());
        }
        // Constructing Set & performing union
        Set <Integer> Union = new HashSet<Integer>(arrayList1);
        Union.addAll(arrayList2);
        System.out.println("Union Value of set =" +Union);

        // Intersection Set Opertion
        Set<Integer>Intersection = new HashSet<Integer>(arrayList1);
        Intersection.retainAll(arrayList2);
         System.out.println(Intersection);

        // Difference
        Set<Integer> Difference = new HashSet<Integer>(arrayList1);
        Difference.removeAll(arrayList2);
        System.out.println(Difference);

    }
    public static void main(String[] args) {
        // object
       ExampleSetFunction object= new ExampleSetFunction();
         object.SetOperation();
    }
}
