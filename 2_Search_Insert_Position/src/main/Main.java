package main;

public class Main {

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = left + (right - left) / 2;

        while(left <= right) {

            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            }

            mid = left + (right - left) / 2;
        }

        return mid;
    }

    public static void main(String[] args) {
        int nums[] = {1,3,5,6};
        int target = 7;
        System.out.println(searchInsert(nums, target));
    }
}
