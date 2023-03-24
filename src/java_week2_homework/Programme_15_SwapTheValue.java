package java_week2_homework;

import java.util.Scanner;

/**
 * write a java program to swap two variables.
 */
public class Programme_15_SwapTheValue {
    public static void main(String[] args) {
        //scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first variable value :");
        int first = scanner.nextInt();
        System.out.println("Enter the second variable value :");
        int second = scanner.nextInt();
        Programme_15_SwapTheValue obj = new Programme_15_SwapTheValue();
        obj.swapTheValue(first, second);
        // closing the scanner object
        scanner.close();
    }

    // swaping the value of variables
    public void swapTheValue(int a, int b) {
        int c;
        System.out.println("Before the swapping,The The values of first variable is : " + a + " and second variable is :" + b);
        c = a;
        a = b;
        b = c;
        System.out.println(" After the swapping , The values of first variable is : " + a + " ans second variable is : " +b);
    }

}
