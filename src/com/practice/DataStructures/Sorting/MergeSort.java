package com.practice.DataStructures.Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void sort(int[] input){
        if(input==null || input.length<=1)
            return;

        mergeSort(input, 0, input.length-1);
    }

    public static void mergeSort(int[] input, int start, int end){
        if(start < end){
            int mid = (start + end)/2;
            mergeSort(input, start, mid);
            mergeSort(input, mid + 1, end);
            merge(input, start, mid, end);
        }
    }

    public static void merge(int[] input, int start, int mid, int end){
        int[] temp = new int[end-start+1];
        int left = start;
        int index = 0;
        int right = mid+1;

        while(left <= mid && right <= end){
            if(input[left]<input[right]){
                temp[index] = input[left];
                index++;left++;
            }else{
                temp[index] = input[right];
                index++;right++;
            }
        }

        while(left<=mid){
            temp[index] = input[left];
            index++;left++;
        }

        while(right<=end){
            temp[index] = input[right];
            index++;right++;
        }

        for(int i=0;i<temp.length;i++){
            input[start+i] = temp[i];
        }
    }

    public static void main(String args[]){
        int[] inputArray = {3,2,1,4,5,8,9,7};
        MergeSort.sort(inputArray);
        System.out.println(Arrays.toString(inputArray));
    }
}