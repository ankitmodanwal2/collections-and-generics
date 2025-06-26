package in.javacoding.collection;

import java.util.ArrayList;
import java.util.List;

public class TestingList {
    public static void main(String[] args) {
        List<String> strList=new ArrayList<>();
        strList.add("Ankit");
        strList.add("Modanwal");
        strList.add(1,"kumar");
       // strList.remove(1);

        for(int i=0;i<strList.size();i++){
            System.out.println(strList.get(i));
        }
      System.out.println(strList.contains("Modanwal"));
    }
}
