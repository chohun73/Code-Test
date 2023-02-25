package CodeTest;

import java.util.Arrays;

public class Babbling {
    String[] bab = {"aya", "ye", "woo", "ma"};
    public int solution(String[] babbling) {
        int answer = 0;
        String[] pre = new String[babbling.length];

        for(int i=0; i<babbling.length; i++) {
            String str = babbling[i];
            pre[i] = dis(str);
        }
        System.out.println(Arrays.toString(pre));

        for(int i=0; i<pre.length; i++) {
            if (pre[i].equals("")) {
                answer++;
            }
        }

        return answer;
    }

    public String dis(String str){

        System.out.println(str);
        for(int j=0; j<4; j++) {
            for (int i = 0; i < bab.length; i++) {
                if (str.startsWith(bab[i])) {
                    str = str.substring(bab[i].length());
                    System.out.println(str);
                }
            }
        }
        return str;
    }
}
