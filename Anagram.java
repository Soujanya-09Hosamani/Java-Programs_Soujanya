// Java program to check Anagram
import java.io.*;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "mug";
        String str2 = "gum";
        char[] arr1 = str1.replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] arr2 = str2.replaceAll("\\s", "").toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr1, arr2) ? "Anagram" : "Not an Anagram");
    }
}