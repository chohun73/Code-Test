package CodeTest;

import java.util.Arrays;

public class DivisorArray {
    public int[] solution(int[] arr, int divisor) {
        int[] p = {-1};
        int[] answer = Arrays.stream(arr).filter(fl -> fl % divisor == 0).sorted().toArray();
        if(answer.length == 0) return p;
        else return answer;
    }
}
