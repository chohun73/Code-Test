package CodeTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PractiseExam {
    public int[] solution(int[] answers) {
        // 1번, 2번, 3번 수포자가 찍는 방식을 기반으로 answer의 길이만큼 늘리고
        // answer과 맞춰서 같은 답안 숫자를 count 한 후에
        // 비교하여 출력한다.
        int a = 0;
        int b = 0;
        int c = 0;
        int[] a1 = {1,2,3,4,5};
        int[] a2 = {2,1,2,3,2,4,2,5};
        int[] a3 = {3,3,1,1,2,2,4,4,5,5};
        for(int i = 0; i < answers.length; i++){
            if(a1[i%5]==answers[i]) a++;
            if(a2[i%8]==answers[i]) b++;
            if(a3[i%10]==answers[i]) c++;
        }
        int[] p = {a,b,c};
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 3; i++) {
            if(p[i] == Arrays.stream(p).max().getAsInt()){
                list.add(i+1);
            };
        }
        return list.stream().mapToInt(mp->mp).toArray();
    }
}
