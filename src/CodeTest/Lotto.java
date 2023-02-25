package CodeTest;

import java.util.Arrays;

public class Lotto {
    public int[] solution(int[] lottos, int[] win_nums) {
        int a = 0;
        int p = (int)Arrays.stream(lottos).filter(fl -> fl == 0).count();
        System.out.println(p);
        for(int i = 0; i < lottos.length; i++){
            for(int j = 0; j < win_nums.length; j++){
                if(lottos[i]==win_nums[j]) a++;
            }
        }
        int[] answer = new int[2];
        int[] rank = {6,5,4,3,2};
        for(int i=0; i < rank.length; i++){
            if(a+p == rank[i]) answer[0] = i+1;
            if(a == rank[i]) answer[1] = i+1;
            if(a+p < 2) answer[0] = 6;
            if(a < 2) answer[1] = 6;
        }
        return answer;
    }
}
