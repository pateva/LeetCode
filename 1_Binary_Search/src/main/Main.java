package main;

public class Main {

    public static int search(int[] nums, int target) {
        int mid = nums.length / 2;
        int left = 0;
        int right = nums.length -1;

        while(left <= right) {

            if(target == nums[mid]) return mid;
            else if(target < nums[mid]) {
                right = mid - 1;
            } else if (target > nums[mid]) {
                left = mid + 1;
            }
            mid = left + (right - left) / 2;
        }

        return -1;
    }

    public static void main(String[] args) {
        int nums[] = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(search(nums, target));
    }
}
