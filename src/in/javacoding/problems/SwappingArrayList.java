package in.javacoding.problems;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class SwappingArrayList {
    public static void main(String[] args) {
        List<String > list = Arrays.asList("i","am","java","developer");
     swap(list ,2,3);
   System.out.println(list);
    }
    public static   void swap(List<String> list, int index1, int index2){

   String str1 = list.get(index1);
   list.set(index1,list.get(index2));
   list.set(index2,str1);

    }
}
