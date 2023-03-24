package java_week2_homework;

import java.util.Scanner;

/**
 * Write a Java program to convert a given string into lowercase.
 *   Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 *  Output: the quick brown fox jumps over the lazy dog.
 */
public class Programme_19_ConvertStringToLowerCase {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        String uppercase = scanner.nextLine();
        Programme_19_ConvertStringToLowerCase obj = new Programme_19_ConvertStringToLowerCase();
        obj.convertStringToLowerCase(uppercase);
        // closing the scanner object
        scanner.close();
    }
    // convert string the to lower case
    public void convertStringToLowerCase(String str){
        System.out.println("The lowercase of the string is = " + str.toLowerCase());
    }

}
