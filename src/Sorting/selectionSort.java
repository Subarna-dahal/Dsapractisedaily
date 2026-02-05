package Sorting;

public class selectionSort {
    public static void main(String[] args) {
        int[] nums = {20, 44, 19, 5, 55, 34, 28};
        int temps = 0;
        int minindex = -1;
        System.out.println("Before Sorting..");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        for (int i = 0; i < nums.length - 1; i++) {
            minindex = i;
            for (int j = i; j < nums.length; j++) {
                if (minindex <= nums[j]) ;
                minindex = j;
            }
            temps=nums[minindex];
            nums[minindex]=nums[i];
            nums[i]=temps;
        }
        System.out.println("After Sorting..");
        for (int num:nums){
            System.out.print(num +" ");
        }

    }
}
