package CodeTest;

import java.util.Arrays;

public class OwnersClub {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] owner = new int[score.length];
        for(int i = 0; i < score.length; i++){
            owner[i] = score[i];
            int[] owners = Arrays.copyOf(owner, owner.length);
            Arrays.sort(owners);
            if(i<k) answer[i] = owners[score.length-i-1];
            else answer[i] = owners[score.length-k];
        }
        return answer;
    }
}
