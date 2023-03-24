package java_week2_homework;

/**
 * Write a java programme using the following steps.
 * 2.1 Declare two  static variables.
 * 2.2 Declare one static method.
 * 2.3 Call both static variable into the static inside the print statement.
 * 2.4 Declare the main method.
 * 2.5 Call the static method into the main method and run the programme.
 */
public class Programme_2 {

    // Declare two static variable
    static int a = 100;
    static int b = 200;

    //Declare one static method.
    //Call both static variable into the static inside the print statement.
     public static void staticMethod(){
         System.out.println(a);
         System.out.println(b);
     }

     //Declare the main method.
    // Call the static method into the main method and run the programme.
     public static void main(String[] args) {
         staticMethod();
     }


}
