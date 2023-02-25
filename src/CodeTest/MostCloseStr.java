package CodeTest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MostCloseStr {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        for(int i = 0; i < s.length(); i++){
            answer[i] = s.substring(0,i).contains(String.valueOf(s.charAt(i))) ? find(s.substring(0,i),s.charAt(i)) : -1 ;
        }
        return answer;
    }
    public int find(String s, char m){
        for(int i = s.length()-1; i >= 0; i--){
            if(String.valueOf(m).equals(String.valueOf(s.charAt(i)))){
                return s.length()-i;
            }
        }
        List<Integer> list = new ArrayList<>();
        var d = list.stream().distinct().collect(Collectors.toList());
        return 0;
    }
}
