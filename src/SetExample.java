// Example of Set
import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(4);
        set.add(5);
        set.add(25);
        set.add(35);
        set.add(40);
       // data will display as
        System.out.println(set);
        // set does not follow order so data will not print as you have entered !!!
    }
}
