// Java program to Remove leading Zeros
import java.io.*;
public class RemoveZeros {
    public static void main(String[] args) {
        String str = "000123";
        System.out.println(str.replaceFirst("0+", ""));
    }
}


