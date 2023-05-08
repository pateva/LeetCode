package main;

public class Main {

    static int getCount(int[] nums, int num) {
        int cnt = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > num) cnt++;
        }

        return cnt;
    }



    static int[] solution(int[] numbers) {
        int len = numbers.length;
        int[] first = new int[len];
        int[] sec = new int[len];
        int fInd = 1;
        int sInd = 1;

        first[0] = numbers[0];
        sec[0] = numbers[1];

        for(int i = 2; i < len; i++) {
            if(getCount(first, numbers[i]) > getCount(sec, numbers[i])) {
                first[fInd] = numbers[i];
                fInd++;
            } else if(getCount(first, numbers[i]) < getCount(sec, numbers[i])) {
                sec[sInd] = numbers[i];
                sInd++;
            } else {
                if(fInd <= sInd) {
                    first[fInd] = numbers[i];
                    fInd++;
                } else {
                    sec[sInd] = numbers[i];
                    sInd++;
                }
            }
        }

        for(int i = fInd; i <len; i++) {
            first[i] = sec[sInd];
            sInd++;
        }



        return first;
    }

    static int getCoun(int num) {
        int cnt = 0;
        int n = num;

        while(n != 0 ) {
            n /= 10;
            cnt++;
        }

        return cnt;
    }

    static boolean areSameDigits(int a, int b) {
boolean con = true;

        while(a != 0 && con) {
            con = false;
            int temp = a % 10;
            int other = b;

            while(other != 0) {
                if(temp == other % 10) {
                    con = true;
                    break;
                } else {
                    other /= 10;
                }
            }

          a/=10;
        }

        return (con);
    }

    public static void main(String[] args) {
	int rec[] = {5, 7, 6, 9, 2};
        System.out.println(solution(rec));

        System.out.println(getCoun(100));

        System.out.println(areSameDigits(134, 331));
    }
}
