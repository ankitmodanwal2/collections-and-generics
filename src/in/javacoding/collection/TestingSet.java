package in.javacoding.collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class TestingSet {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
       int hashCode=set.hashCode();

       System.out.println(hashCode);

        Utility.printList(set);
    }
}
