package Arraylearn;

public class Arraytraversal {
    public static void main(String[] args) {
        int[] nums={34,64,23,75,12,73,84,23,16,89};
        reverseArray(nums);
        for (int i:nums){
            System.out.println(i);
        }
    }
    public static void reverseArray(int[] array){
        int left=0;
        int right=array.length-1;  //1,3,4,5,6,7
        while (left<right){
            int temp=array[left];
            array[left]=array[right];
            array[right]=temp;
            left++;
            right--;
        }
    }
}
