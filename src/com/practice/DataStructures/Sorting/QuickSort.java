package com.practice.DataStructures.Sorting;

import java.util.Arrays;

public class QuickSort{
    public static void sort(int[] input, int start, int end){
        if(start<end){
            int pivot = input[start];
            int left = start;
            int right = end;
            while(left<right){
                while(left<=end && input[left]<=pivot)
                    left++;

                while(right>=start && input[right]>pivot)
                    right--;

                if(left<right)
                    swap(input, left, right);
            }

            swap(input, start, right);

            sort(input, start, right-1);
            sort(input, right+1, end);
        }
    }

    public static void swap(int[] input, int pos1, int pos2){
       int temp = input[pos1];
       input[pos1] = input[pos2];
       input[pos2] = temp;
    }


    public static void main(String args[]){
        int[] inputArray = {5,4,3,2,1};
        QuickSort.sort(inputArray, 0 , inputArray.length-1);
        System.out.println(Arrays.toString(inputArray));
    }
}
