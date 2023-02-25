package CodeTest;

import java.util.Arrays;

public class XizerCode {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        String[] big = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String[] small = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String[] sl = s.split("");
        System.out.println(Arrays.toString(sl));
        for(int i = 0; i < sl.length; i++){
            if (sl[i].equals(" ")) {
                answer.append(" ");
                continue;
            }
            for(int j = 0; j < 26; j++) {
                if (sl[i].contains(big[j])) {
                    answer.append(big[j + n]);
                    continue;
                }
                if (sl[i].contains(small[j])) {
                    answer.append(small[j + n]);
                }
            }
        }
        return answer.toString();
    }
}
