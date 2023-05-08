package main;

public class Main {

    public static int binarySearchZero(int[] arr, int n) {
        int left = 0;
        int right = n - 1;

        if(arr[0] < 0) return n ;
        if(arr[n-1] > 0) return 0;


        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] >= 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return n - left;
    }


    public static int countNegatives(int[][] grid) {
        int n = grid[0].length;
        int res = 0;

        for (int[] ints : grid) {
            res += binarySearchZero(ints, n);
        }

        return res;
    }

    public static void main(String[] args) {

        int[][] grid = {{8,-2,-2,-2,-4,-5,-5}};
                //{{4,3,2,-1},{3,2,1,-1}, {1,1,-1,-2},{-1,-1,-2,-3}};
                //{{3,2},{1,0}};

        System.out.println(countNegatives(grid));
    }
}
