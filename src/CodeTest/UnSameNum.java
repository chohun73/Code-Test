package CodeTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnSameNum {
    public int[] solution(int[] arr) {
        List<Integer> unsame = new ArrayList<>();
        unsame.add(arr[0]);

        for(int i = 1; i < arr.length; i++){
            if(arr[i] != unsame.get(unsame.size()-1)){
                unsame.add(arr[i]);
            }
        }
        return unsame.stream().mapToInt(mp -> mp).toArray();
    }
}
