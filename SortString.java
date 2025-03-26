// Java program to sort a string 
import java.io.*;
import java.util.Arrays;

public class SortString {

    public static void main(String[] args) {
        String str = "java";
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        System.out.println(new String(arr));
    }
}