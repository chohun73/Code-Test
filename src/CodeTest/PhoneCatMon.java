package CodeTest;

import java.util.Arrays;

public class PhoneCatMon {
    public int solution(int[] nums) {
        var dd = Arrays.stream(nums).distinct().count();
        int c = nums.length/2;
        int answer = 0;
        answer = c > dd ? (int)dd : c ;
        return answer;
    }
}
