// Java program to swap pair of character
import java.io.*;
public class SwapThePair {

    public static void main(String[] args) {
        String str = "1010";
        char [] arr = str.toCharArray();
        for(int i=0 ; i<arr.length - 1 ; i++){
            char temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        System.out.println(new String(arr));
    }
}