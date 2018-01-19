package com.practice.arrays;

/*
    Problem: Find an element in a sorted array
 */

public class BinarySearchExample {

    public static int binarySearch(int[] arr, int min, int max, int value){
        if(min<=max){
            int mid = (min+max)/2;
            if(arr[mid]==value){
                return mid;
            }else if(arr[mid]>value){
                return binarySearch(arr,min,mid-1,value);
            }else{
                return binarySearch(arr,mid+1,max, value);
            }
        }

        return -1;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(binarySearch(arr,0,arr.length-1,1));
        System.out.println(binarySearch(arr,0,arr.length-1,10));
        System.out.println(binarySearch(arr,0,arr.length-1,9));
        System.out.println(binarySearch(arr,0,arr.length-1,11));
    }
}

/*
    End Remarks:
    Time Complexity: O(log n)
    Space Complexity: O(1)
 */
