package main;

public class Main {

    public static int binarySearch(int[]nums, int target) {
        int left = 0;
        int right = nums.length -1;

        while(left <= right) {
            int mid = left + (right - left) /2;

            if(nums[mid] == target) return mid;
            else if(nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static int[] searchRange(int[] nums, int target) {

        int res = binarySearch(nums, target);
        int l = res;
        int r = res;

        if(res == -1) return (new int[] {-1, -1});
        else {
            while(l >= 0 && nums[l] == target) {
                l--;
            }

            while(r < nums.length && nums[r] == target){
                r++;
            }

            l++;
            r--;
        }

        return new int[] {l, r};

    }

    public static void main(String[] args) {

        int[] arr = {5,7,7,8,8,10};
        int[] arr1 = {1};

       searchRange(arr1, 1);

    }
}
