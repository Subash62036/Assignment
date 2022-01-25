// Get data from users using vectors and sort that
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class FunctionsOfVectors {
    String [] name ;
    Vector<Integer> ref = new Vector<>();
    public void createVector() {
        System.out.println("Enter how many number of name you want to sort ");
        Scanner sc = new Scanner(System.in) ;
        int num = sc.nextInt() ;
        for( int i =0 ;i<num; i++) {
            ref.add(sc.nextInt()) ;
        }
    }
    // sorting above number
    public void sortString () {
        Iterator<Integer> it = ref.iterator();
        while(it.hasNext()) {
            int num = it.next();

        }
    }

}
}
