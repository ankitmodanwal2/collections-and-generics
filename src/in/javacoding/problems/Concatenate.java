package in.javacoding.problems;

public class Concatenate {
    public static void main(String[] args) {

        Concatenate.inputStr();
    }
    public static String  inputStr(String... str){
        StringBuilder sb = new StringBuilder();

        for(String s: str){
          sb.append(s).append(" ");
        }
        return sb.toString();
    }
}
