package in.javacoding.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class TestingCollections {
    public static void main(String[] args) {
        List<Integer> strList=new ArrayList<>();
        strList.add(1);
        strList.add(2);
        strList.add(5);
        strList.add(3);
        List<Integer> unmodifiableList=Collections.unmodifiableList(strList);
            Collections.sort(strList);
            Utility.printList(strList);
            Utility.printList(unmodifiableList);
            unmodifiableList.add(4);

    }
}
