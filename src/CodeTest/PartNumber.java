package CodeTest;

import java.util.Arrays;

public class PartNumber {
    public int solution(String t, String p) {
        int a = 0;
        for (long i = 0; i < t.length()-p.length()+1; i++) {
            if(Long.parseLong(t.substring((int)i,(int)i+p.length())) <= Long.parseLong(p)) a++;
        }
        return a;
    }
}
