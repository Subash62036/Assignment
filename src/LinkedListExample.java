
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListExample {
    LinkedList<String> Name = new LinkedList<>();

    public void Insert() {
        System.out.println("Enter how many name you want to entered like 1,2,....");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Name.add(sc.nextLine());
        }
        System.out.println(Name);

    }

    public void Remove() {
        if (Name.size() > 0) {
            System.out.println("Remove this elements from LinkedList " + Name.remove());
            System.out.println(Name);
        }
        else
            System.out.println("Linked List is empty !!! Try Again");
    }

    public void RemoveAll() {
        if (Name.size() > 0) {
            Name.clear();
            System.out.println("All have removed !!");
        }
        else
        System.out.println("LinkedList is empty !!");
    }

    public static void main(String[] args) {

        LinkedListExample object = new LinkedListExample();
        while (true) {
            System.out.println("Enter 1-Inseration ,2- Remove single value ,3- Romove All value 4- Exit");
            Scanner num = new Scanner(System.in);
            int a = num.nextInt();
            switch (a) {
                case 1:
                    object.Insert();
                    break;
                case 2:
                    object.Remove();
                    break;
                case 3:
                    object.RemoveAll();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("You have enter wrong input please try again !!!");
                    break;
            }


        }

    }
}
