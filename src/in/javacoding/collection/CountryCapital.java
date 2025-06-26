package in.javacoding.collection;

import java.util.HashMap;
import java.util.Map;

public class CountryCapital {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<String, String>();
        map.put("India", "New Delhi");
        map.put("Pakistan", "Islamabad");
        map.put("Srilanka", "Colombo");
        map.put("Bangladesh", "Dhaka");
        map.put("China", "Beijing");
        for(String key : map.keySet()){

            System.out.printf("%s : %s\n",key,map.get(key));
            System.out.println("changed successfully");
        }
    }
}
