package leedcode;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int rotate = 3;
        int len = arr.length;
        rotate %= len;

//        //5,6,7,1,2,3,4 - left rotation
//        reverse(arr, 0, len-1);
//        //7,6,5,4,3,2,1
//        reverse(arr, 0, rotate-1);  // (arr, 0, 2)
//        //5,6,7,4,3,2,1
//        reverse(arr, rotate, len-1);     // (arr, 3, 6)
//        //5,6,7,1,2,3,4

        //4,5,6,7,1,2,3 - right rotation
        reverse(arr, 0, len-1);
        //7,6,5,4,3,2,1
        reverse(arr, 0, len-rotate-1);   //  (arr, 0, 3)
        //4,5,6,7,3,2,1
        reverse(arr, len-rotate, len-1); //  (arr, 4, 6)
        System.out.println(Arrays.toString(arr));
    }
    public static void reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
