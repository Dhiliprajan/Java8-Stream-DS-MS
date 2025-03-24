package codeexample;

import java.util.Arrays;

// Time & space - O(N)
public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int N = 3;
        int length = arr.length;
        N %= length;

        reverse(arr, 0, length-1);
        reverse(arr,0,N-1);
        reverse(arr,N,length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
