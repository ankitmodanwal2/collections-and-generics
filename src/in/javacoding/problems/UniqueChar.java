package in.javacoding.problems;

import java.util.HashSet;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;

public class UniqueChar {
    public static void main(String[] args) {
        Set<Character> unique = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
       int size=0;
        for( char ch:str.toCharArray()){
           if(unique.add(ch)){
               size++;
               if(ch==' ')
               {
                   size--;
               }
           }
        }

        System.out.println("your string has unique element"+size);
    }
}
