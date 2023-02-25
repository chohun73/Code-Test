package CodeTest;

import java.util.Arrays;

public class WantSort {
    public String[] solution(String[] strings, int n) {
        String[] k = strings.clone();
        for(int i = 0; i < strings.length; i++){
            strings[i] = strings[i].substring(n,n+1) + strings[i];
        }
        Arrays.sort(strings);
        String[] answer = new String[strings.length];
        for(int i = 0; i < strings.length; i++){
            answer[i] = strings[i].substring(1);
        }
        return answer;
    }
}
