package in.javacoding.problems;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Comparator {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("hi", "this", "is", "ankit", "this", "is", "my", "first", "java", "programming");
        System.out.println(strList);
        sortInDecending(strList);
        System.out.println(strList);
        System.out.println(Collections.frequency(strList, "is"));

    }

    public static void sortInDecending(List<String> strList) {
      String[] strArray = strList.toArray(new String[strList.size()]);

    }
}


