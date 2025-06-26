package in.javacoding;

import java.util.Scanner;

public class VarArgs {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(sum(sc.nextInt(), sc.nextInt(), sc.nextInt()));
    }
    public  static int sum(int... a) {
        int sum = 0;
        for(int i: a)
            sum += i;
        return sum;
    }
}
