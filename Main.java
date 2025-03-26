// Widening
// import java.io.*;

// public class Main {
//     public static void main(String[] args) {
//         int num = 10;
//         double result = num;
//         System.out.println("Integer = " + num);
//         System.out.println("Double = " + result);
//     }// end of main
// }// end of class

// Narrowing
// import java.io.*;
// class Main{
//     public static void main(String[] args) {
//         double num = 10.5;
//         int result = (int)num;
//         System.out.println("Double : "+num);
//         System.out.println("Integer : "+result);
//     }
// }

// Widening(char to int) 
// import java.io.*;
// public class Main {
//     public static void main(String[] args) {
//         char ch = '';
//         int ascii = ch;
//         System.out.println("Char : "+ch);
//         System.out.println("ASCII : "+ascii);
//     }
// }

// Narrowing(int to char)
// import java.io.*;
// public class Main {

//     public static void main(String[] args) {
//         int ascii = 97;
//         char ch = (char)ascii;
//         System.out.println("ASCII : "+ascii);
//         System.out.println("Char : "+ch);
//     }
// }

// Narrowing (float to int)
// import java.io.*;
// public class Main {

//     public static void main(String[] args) {
//         float num = 5.99f;
//         int num2 = (int)num;
//         System.out.println("Float : "+num);
//         System.out.println("Integer : "+num2);
//     }
// }

// Narrowing (Long to byte)
// import java.io.*;
// public class Main {

//     public static void main(String[] args) {
//         long num = 130;
//         byte result = (byte) num;
//         System.out.println("Long : "+num);
//         System.out.println("Byte : "+result);
//     }
// }

// Narrowing (Double to byte)
// import java.io.*;
// public class Main {

//     public static void main(String[] args) {
//         double num = 257.75;
//         byte result = (byte) num;
//         System.out.println("Double : "+num);
//         System.out.println("Byte : "+result);
//     }
// }

// String to integer
// import java.io.*;
// public class Main {

//     public static void main(String[] args) {
//         String str = "100";
//         int num = Integer.parseInt(str);
//         System.out.println("String : "+str);
//         System.out.println("Integer : "+num);
//     }
// }

// integer to String
// import java.io.*;
// public class Main {

//     public static void main(String[] args) {
//         int num = 123;
//         String str = Integer.toString(num);
//         System.out.println("Integer : "+num);
//         System.out.println("String : "+str);
//     }
// }

// Narrowing (Object to String)
// import java.io.*;
// public class Main {

//     public static void main(String[] args) {
//         Object obj = "Hello";
//         String str = (String) obj;
//         System.out.println("Object : "+obj);
//         System.out.println("String : "+str);
//     }
// }

// Narrowing (String to double)
// import java.io.*;
// public class Main {

//     public static void main(String[] args) {
//         String str = "3.14";
//         double num = Double.parseDouble(str);
//         System.out.println("String : "+str);
//         System.out.println("Double : "+num);
//     }
// }

// Narrowing(Char to byte)
// import java.io.*;
// public class Main {

//     public static void main(String[] args) {
//         char ch = 'b';
//         byte b = (byte) ch ;
//         System.out.println("Char : "+ch);
//         System.out.println("Byte : "+b);
//     }
// }

// Narrowing (Long to short)
// import java.io.*;
// public class Main {

//     public static void main(String[] args) {
//         long num = 32770;
//         short s = (short) num;
//         System.out.println("Long : "+num);
//         System.out.println("Short : "+s);
//     }
// }

// Narrowing(String to Float)
// import java.io.*;
// public class Main {

//     public static void main(String[] args) {
//         String str = "5.67";
//         float num = Float.parseFloat(str);
//         System.out.println("String : "+str);
//         System.out.println("Float : "+num);
//     }
// }

// Narrowing(int to String)
// import java.io.*;
// public class Main {

//     public static void main(String[] args) {
//         int num = 42;
//         String str = String.valueOf(num);
//         System.out.println("Integer : "+num);
//         System.out.println("Sting : "+str);
//     }
// }

 // Casting Wrapper Class Object 
//  import java.io.*;
//  public class Main {
 
//     public static void main(String[] args) {
//         Integer intObj = 100;
//         double d = intObj.doubleValue();
//         System.out.println("Integer : "+intObj);
//         System.out.println("Double : "+d);
//     }
//  }

// Narrowing (int to Boolean)
// import java.io.*;
// public class Main {

//     public static void main(String[] args) {
//         int num = 1;
//         boolean flag = (num != 0);
//         System.out.println("Integer : "+num);
//         System.out.println("Boolean : "+flag);
//     }
// }

// Narrowing (Boolean to integer)
// import java.io.*;
// public class Main {

//     public static void main(String[] args) {
//         boolean flag = false ;
//         int num = flag ? 1:0; 
//         System.out.println("Boolean : "+flag);
//         System.out.println("Integer : "+num);
//     }
// }

//Narrowing (Double to Float)
import java.io.*;
public class Main {

    public static void main(String[] args) {
        double num = 10.99;
        float f = (float) num;
        System.out.println("Double : "+num);
        System.out.println("Float : "+f);
    }
}

// Typecasting Method Overloading
// import java.io.*;
// public class Main {
//     static void show(int x) {
//         System.out.println("int: " + x);
//     }

//     static void show(byte x) {
//         System.out.println("byte: " + x);
//     }

//     static void show(double x) {
//         System.out.println("double: " + x);
//     }

//     public static void main(String[] args) {
//         byte b = 10;
//         show(b); 
        
//         int i = 100;
//         show(i); 

//         float f = 5.5f;
//         show(f); 
//     }
// }
