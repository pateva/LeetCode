package main;

public class Main {

    public static char nextGreatestLetter(char[] letters, char target) {
        int left = 0;
        int right = letters.length -1;

        while(left <= right) {
            int mid = left + (right - left) /2;

            if(letters[mid] <= target) {
                left = mid + 1;
            } else if(letters[mid] > target) {
                right = mid - 1;
            }
        }

        return letters[left % letters.length];
    }

    public static void main(String[] args) {

        char letters[] = {'c','f','j'};
        char target = 'd';
        System.out.println(nextGreatestLetter(letters, target));
    }
}
