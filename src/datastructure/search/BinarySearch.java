package datastructure.search;


public class BinarySearch {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6};
        int target = 4;
        int result = binarySearch(nums, target);
        int result1 = binarySearchRecursive(nums, target, 0, nums.length-1);
        if(result1 != -1)
            System.out.println("Element fount at index : "+result1);
        else
            System.out.println("Element not found");
    }

    public static int binarySearchRecursive(int[] nums, int target, int left, int right) {
        if(left <= right){
            int mid = (left + right)/2;
            if(nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                return binarySearchRecursive(nums, target, mid+1, right);
            else
                return binarySearchRecursive(nums, target, left, mid-1);
        }
        return -1;
    }

    public static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int mid = (left + right)/2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }
}
