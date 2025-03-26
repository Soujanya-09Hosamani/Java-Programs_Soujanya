//Java String Program to Print Even-Length Words
import java.io.*;
public class PrintEvenLength {

    public static void main(String[] args) {
        String str = "Hey! Myself Soujanya. I am Studying in SGU";
        System.out.println(str);
        for(String Word : str.split(" ")){
            if(Word.length() % 2 == 0){
                System.out.println(Word);
            }
        }
    }
}