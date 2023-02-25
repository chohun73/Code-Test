package CodeTest;

import java.util.ArrayList;
import java.util.List;

public class Dart {
    public int solution(String dartResult) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        double a = 0;
        for(int i = 0; i < dartResult.length(); i++){
            if (i != dartResult.length()-1 && dartResult.substring(i, i + 2).equals("10")){
                list.add((int) a);
                a = 10;
                i++;
            }
            else if(String.valueOf(dartResult.charAt(i)).matches("^[0-9]$")){
                list.add((int)a);
                a = Double.parseDouble(String.valueOf(dartResult.charAt(i)));
            }
            else if(String.valueOf(dartResult.charAt(i)).equals("S")){
                a = Math.pow(a,1);
            }
            else if(String.valueOf(dartResult.charAt(i)).equals("D")){
                a = Math.pow(a,2);
            }
            else if(String.valueOf(dartResult.charAt(i)).equals("T")){
                a = Math.pow(a,3);
            }
            else if(String.valueOf(dartResult.charAt(i)).equals("*")){
                list.set(list.size()-1, list.get(list.size()-1)*2);
                a *= 2;
            }
            else if(String.valueOf(dartResult.charAt(i)).equals("#")){
                a = -a;
            }
            if(i == dartResult.length()-1){
                list.add((int)a);
            }
        }
        for(int i = 0; i < list.size(); i++){
            answer += list.get(i);
        }
        return answer;
    }
}
