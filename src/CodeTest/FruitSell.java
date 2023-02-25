package CodeTest;

import java.util.Arrays;
import java.util.Collections;

public class FruitSell {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        String[] sc = Arrays.stream(score).boxed().map(String::valueOf).toArray(String[]::new);
        Arrays.sort(sc, Collections.reverseOrder());
        for(int i = m-1; i < sc.length; i += m){
            answer += Integer.parseInt(sc[i])*m;
        }
        return answer;
    }
}
