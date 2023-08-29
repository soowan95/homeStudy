import java.util.HashSet;
import java.util.ArrayList;
import java.util.Iterator;

public class LearnCollections {
    public static void main(String[] args) {
        HashSet<Integer> A = new HashSet<Integer>();
        A.add(1);
        A.add(2);
        A.add(2);
        A.add(3);

        Iterator hi = A.iterator();
        while(hi.hasNext()) {
            System.out.println(hi.next());
        }

        ArrayList<Integer> A1 = new ArrayList<Integer>();
        A1.add(1);
        A1.add(2);
        A1.add(2);
        A1.add(3);

        Iterator hi1 = A1.iterator();
        while(hi1.hasNext()) {
            System.out.println(hi1.next());
        }
    }
}
