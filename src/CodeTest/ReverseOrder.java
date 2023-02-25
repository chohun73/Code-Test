package CodeTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class ReverseOrder {
    public long solution(long n) {
        String h = n+"";
        String[] s = h.split("");
        Arrays.sort(s, Collections.reverseOrder());
        return Long.parseLong(String.join("", s));
    }
}
