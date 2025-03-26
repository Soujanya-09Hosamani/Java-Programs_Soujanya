// Java Program to Replace a Character at a Specific Index
import java.io.*;

public class ReplaceAChar {
    public static void main(String[] args) {
        String str = "Hello";
        int index = 1;
        char result = 'a';
        System.out.println(str.substring(0, index) + result + str.substring(index + 1));
    }
}