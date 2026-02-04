package Arraylearn;

public class searchMethod {
    public static void main(String[] args) {
        int[] nums = {1, 13, 24, 55, 66, 78, 80};
        int target = 55;
        int result = linearSearch(nums, target);
        if (result != -1) {
            System.out.println("element found at index :" + result);
        } else {
            System.out.println("element couldnt found");
        }
//        int results = BinarySearch(nums, target);
        int results = BinarySearch(nums, target, 0, nums.length - 1);
        if (result != -1) {
            System.out.println("element found at index :" + results);
        } else {
            System.out.println("element couldnt found");
        }
    }

    public static int linearSearch(int[] nums, int target) {
        int Steps = 0;
        for (int i = 0; i <= nums.length; i++) {
            Steps++;

            if (nums[i] == target) {
                System.out.println("Steps taken by the Linear Search:" + Steps);
                return i;
            }
        }
        System.out.println("Steps taken by the linear Search:" + Steps);
        return -1;
    }

    public static int BinarySearch(int[] nums, int target, int left, int right) {
        if (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                return BinarySearch(nums, target, mid + 1, right);
            } else {
                return BinarySearch(nums, target, left, mid - 1);
            }
            //        int Steps = 0;
//        int left = 0;
//        int right = nums.length - 1;
//        while (left <= right) {
//            Steps++;
//            int mid = (left + right) / 2;
//
//            if (nums[mid] == target) {
//                System.out.println("Steps taken by the Binary Search:" + Steps);
//                return mid;
//            } else if (nums[mid] <= target) {
//                left = mid + 1;
//            } else
//                right = mid - 1;
//        }
//        System.out.println("Steps taken by the Binary  Search:" + Steps);
//        return -1;
        }
        return -1;
    }
}