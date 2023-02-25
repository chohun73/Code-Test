package CodeTest;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Gymsuit {
    public int solution(int n, int[] lost, int[] reserve) {
        int a = 0;
        int answer = 0;
        for(int i = 0; i < lost.length; i++){
            for(int j = 0; j < reserve.length; j++){
                if(lost[i] == reserve[j] && lost[i] != 0 && reserve[j] != 0){
                    lost[i] = 0;
                    reserve[j] = 0;
                }
            }
        }
        var k = Arrays.stream(lost).filter(fl -> fl !=0).toArray();
        var l = Arrays.stream(reserve).filter(fl -> fl !=0).toArray();

        for(int i = 0; i < k.length; i++){
            for(int j = 0; j < l.length; j++) {
                if (k[i] - 1 == l[j]){
                    k[i] = 0;
                    continue;
                }
                if (k[i] + 1 == l[j]){
                    k[i] = 0;
                }
            }
        }
        for(int i = 0; i < k.length; i++) {
            if(k[i] != 0) a++;
        }
        answer = n-a;

        return answer;
    }
}
