package CodeTest;

import java.util.ArrayList;
import java.util.List;

public class Combination {
    public int[] solution(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < numbers.length-1; i++){
            for(int j = i+1; j < numbers.length; j++){
                list.add(numbers[i] + numbers[j]);
            }
        }
        return list.stream().distinct().sorted().mapToInt(mp->mp).toArray();
    }
}
