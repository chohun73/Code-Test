package CodeTest;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CreateStrangeString {
    public String solution(String s) {
        String[] a = s.split(" ",-1);
        System.out.println(Arrays.toString(a));
        for(int i = 0; i < a.length; i++){
            a[i] = change(a[i]) + " ";
        }

        return Arrays.stream(a)
                .collect(Collectors.joining())
                .substring(0,Arrays.stream(a)
                        .collect(Collectors.joining())
                        .length()-1);
    }
    public String change(String n){
        String[] k = n.split("");
        for(int i = 0; i < k.length; i += 2){
            k[i] = k[i].toUpperCase();
        }
        for(int i = 1; i < k.length; i += 2){
            k[i] = k[i].toLowerCase();
        }
        return Arrays.stream(k).collect(Collectors.joining());
    }
}
