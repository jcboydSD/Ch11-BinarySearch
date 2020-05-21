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

    public static int binarySearch(int[] arr, int first, int last, int target) {
        int mid, index;
        System.out.printf("first=%d, last=%d\n", first, last);
        if (first == last) {            // stopping condition
           if (arr[first] == target) {
               index = first;
               System.out.println("found");
           } else {
               index = -1;
               System.out.println("not found");
           }
        } else {
            mid = (last + first) / 2;   // continue recursion
            if (target > arr[mid]) {
                first = mid + 1;
            } else {
                last = mid;
            }
            index = binarySearch(arr, first, last, target);
            System.out.println("returnedValue=" + index);
        }
        return index;
    } // end binarySearch method
    
} // end BinarySearch class
