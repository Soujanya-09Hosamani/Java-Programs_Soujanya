// String to int

// import java.io.*;

// public class Typecast {
//     public static void main(String[] args) {
//         String str = "1234";
//         int num = Integer.parseInt(str);

//         System.out.println("Integer : " + num);
//     }
// }

// Non numeric String to int
// import java.io.*;

// public class Typecast {

//     public static void main(String[] args) {
//         String str = "cppbuzz";
//         int num = Integer.valueOf(str);

//         System.out.println("Integer : " + num);
//     }
// }

// String to float
// import java.io.*;

// public class Typecast {

//     public static void main(String[] args) {
//         String str = "1234.34";
//         float num = Float.parseFloat(str);
//         System.out.println(num);
//     }
// }

// int to String
// import java.io.*;

// public class Typecast {

//     public static void main(String[] args) {
//         int num = 10;
//         String str = Integer.toString(num);
//         System.out.println("String : " + str);
//     }
// }

// public class Typecast {

//     public static void main(String[] args)throws Exception {
//         String str = "10.87";
//         int num = Integer.parseInt(str);
//         System.out.println("Integer : " + num);
//     }
// }

// int tostring
//  import java.io.*;

// public class Typecast {

//     public static void main(String[] args) {
//         int a = 10;
//         String temp = Integer.toString(a);
//         System.out.println("String : " + temp);
//     }
// }

// float to string
// import java.io.*;

// public class Typecast {

//     public static void main(String[] args) {
//         Float a = 10.0f;
//         String temp = Float.toString(a);
//         System.out.println("String : " + temp);
//     }
// }

// celsius to fahrenheit

// import java.io.*;
// public class Typecast {

//     public static void main(String[] args)throws Exception {
//         InputStreamReader r=new InputStreamReader(System.in);  
//         BufferedReader br=new BufferedReader(r);

//         System.out.println("Enter celsius : ");
//         String celsius = br.readline();

//         double fahrenheit = (celsius * 9/5) + 32;

//         fahrenheit = Double.parseDouble(celsius);

//         System.out.println("Fahrenheit : "+fahrenheit);
//     }
// }

// import java.io.*;
// import java.util.Scanner;

// public class Typecast {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter celsius : ");
//         int celsius = sc.nextInt();

//         double fahrenheit = (celsius * 9 / 5) + 32;
//         System.out.println("Fahrenheit : " + fahrenheit);
//         sc.close();
//     }
// }

// Age input in a survey(double to int)
// import java.io.*;
// import java.util.Scanner;
// public class Typecast {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter your Age: ");
// double age = sc.nextDouble();
// int num = (int) age;
// System.out.println("Age : "+num);
// sc.close();
// }
// }

// E-commmerce discount calculation(Float to int)
// import java.io.*;
// import java.util.Scanner;

// public class Typecast {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Discount in Float : ");
//         float discount = sc.nextFloat();
//         int result = (int) discount;
//         System.out.println("Discount in Integer : " + result + "%");
//     }
// }

// // Sensor Data Processing in iot Device (double to int)
// import java.io.*;
// import java.util.Scanner;

// public class Typecast {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Pressure in double : ");
//         double Pressure = sc.nextDouble();

//         int result = (int) Pressure;
//         System.out.println("Pressure in int : " + result);
//     }
// }