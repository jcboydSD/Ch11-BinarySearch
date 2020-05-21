package binarysearch;

/******************************************************************************
* BinarySearch.java 
* Programmer: @author jcboyd
* Version: 1.0
* Course: SDEV 2220
* This program [PROJECT DESCRIPTION]
******************************************************************************/

import java.util.*;  // Scanner, Arrays

public class BinarySearch {

    public static void main(String[] args) {
        System.out.println("Hello");
            // declarations
        Scanner stdIn = new Scanner(System.in);
        double numInput;
        // input
        System.out.print("Enter a non-negative number: ");
        numInput = stdIn.nextInt();
        // processing & output
        if (numInput >= 0) {
            System.out.println(factorial(numInput));
        } // end if
            
        stdIn.nextLine(); //clear Scanner input
        
        String msg; // user-entered message
        System.out.print("Enter a message: ");
        msg = stdIn.nextLine();
        printReverseMessage(msg); 
        System.out.println();
        printReverseMsg(msg);
        System.out.println();
 
    } // end main

    private static double factorial(double n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        else {
            return n * factorial(n-1);
        } // end if
    } // end factorial method
    
    private static void printReverseMessage(String msg) {
        int index;  // position of character that is to be printed
        index = msg.length() - 1;  
        while (index >= 0)  {  
            System.out.print(msg.charAt(index));
            index--;  
        } //end while
    } // end printReverseMessage method
    
    private static void printReverseMsg(String msg) {
        int index; // position of last character in message
        if (!msg.isEmpty()) {
            index = msg.length() -1;
            System.out.print(msg.charAt(index));
            printReverseMsg(msg.substring(0, index));
        } // end if
    } // end printReverseMsg method
    
} // end BinarySearch class
