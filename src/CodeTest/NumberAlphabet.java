package CodeTest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NumberAlphabet {
    public int solution(String s) {
        // 문자열을 앞에서부터 스캔 > 숫자라면 answer 배열에 해당 char을 입력/ 문자라면 startwith 으로 해당 문자열이 해당하는 num을 찾아 answer 배열에 숫자를 입력하고 substring으로 제거
        String[] num = {"0","1","2","3","4","5","6","7","8","9"};
        String[] alpha = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        List<String> list = new ArrayList<>();
        while(s.length() > 0){
            for (int i = 0; i < alpha.length; i++) {
                if(s.startsWith(num[i])){
                    list.add(num[i]);
                    s = s.substring(num[i].length());
                    continue;
                }
                if (s.startsWith(alpha[i])) {
                    list.add(num[i]);
                    s = s.substring(alpha[i].length());
                    System.out.println(list);
                }
            }
        }
        return Integer.parseInt(list.stream().map(String::valueOf).collect(Collectors.joining()));
    }
}
