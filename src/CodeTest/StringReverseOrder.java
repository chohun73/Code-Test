package CodeTest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class StringReverseOrder {
    public String solution(String s) {
        String answer = "";
        String[] a = s.split("");
        var b = Arrays.stream(a).filter(fl -> fl.matches("^[a-z]*$")).sorted(Comparator.reverseOrder()).collect(Collectors.joining());
        var c = Arrays.stream(a).filter(fl -> fl.matches("^[A-Z]*$")).sorted(Comparator.reverseOrder()).collect(Collectors.joining());
        return b+c;
    }
}
