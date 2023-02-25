package CodeTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class budget {
    public int solution(int[] d, int budget) {
        int[] sort = Arrays.stream(d).sorted().toArray();
        List<Integer> list = new ArrayList<>();
        int a = 0;
        for(int i = 0; i < d.length; i++){
            a += sort[i];
            if(a>budget) break;
            list.add(sort[i]);
        }
        return list.size();
    }
}
