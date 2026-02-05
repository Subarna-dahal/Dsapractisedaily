package Sorting;

public class bubleSort {
    public static void main(String[] args) {
        int[] nums = {1, 40, 23, 22, 60, 4, 34, 74};
        int temp = 0;
        System.out.println("Before Sorting..");
        for (int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("After Sorting..");
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length -i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j+1] = temp;
                }
            }
        }
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }


}
