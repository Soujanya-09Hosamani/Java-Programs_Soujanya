// Java String Program to Insert a String into Another String
import java.io.*;
public class InsertString {
    public static void main(String[] args) {
        String str = "Hey! To SGU";
        String result = "Welcome";
        int index = 4;
        System.out.println(str.substring(0, index)+ result + str.substring(index));
    }
}

   
