// vector is class that implements list
// vector is synchronized( those class or interface that are present in previous version of java
// vector increase size 100% if its size goes full
// stack class extends vector class ;
import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class VectorClassExample {
    public void pointsOfVectors() {

          Vector<String > Point = new Vector<>();
          System.out.println("Enter any five points of vectors");
          Scanner sc = new Scanner(System.in);
          for(int i=0 ;i<5; i++) {
              Point.add(sc.nextLine());
          }
          // find out all vowel character of the given points
        Iterator<String> it = Point.iterator();
         while(it.hasNext()) {
            String s =toUpperCase(it.next());
             System.out.println("In Line "+(1) );
             for(int j = 0;j<s.length();j++) {
                 if(s.charAt(j) == 'A' || s.charAt(j) =='E'|| s.charAt(j) =='I' ||s.charAt(j) =='O' || s.charAt(j) =='U') {
                     System.out.print("\t" +s.charAt(j));
                 }
             }
             System.out.println( " ");
         }

    }
    public static void main(String[] args) {
         VectorClassExample object = new VectorClassExample();
         object.pointsOfVectors();

    }
}
