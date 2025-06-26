package in.javacoding.collection;

import java.util.Collection;

public class Utility {
    public static <E> /*generics*/ void printList(Collection<E> collection){
        for (E element : collection) {
            System.out.print(element);
        }
        System.out.println();
    }
}
