//Java program to check whether a string is a Palindrome
import java.io.*;
public class Palindrome {

    public static void main(String[] args) {
        String str = "madam";
        String rev = new StringBuilder(str).reverse().toString();
        System.out.println(str.equals(rev));
    }
}