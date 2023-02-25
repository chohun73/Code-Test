package CodeTest;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Mode {
    public int solution(int[] array) {
        var a =Arrays.stream(array).distinct().sorted().toArray();
        // a = {1 ,2 ,3, 5}

        //최빈값의 원래원소로 mapping
        var b = Arrays.stream(a).map(mp->dis(array, mp)).toArray();
        // b = {1, 1, 3, 1}

        if(Arrays.stream(b).filter(fl->fl==Arrays.stream(b).max().getAsInt()).count()>1) return -1;

        return a[IntStream.range(0,b.length).filter(fl -> b[fl] == Arrays.stream(b).max().getAsInt()).sum()];

    }

    public int dis(int[] array, int a){
        return (int)Arrays.stream(array).filter(fl -> fl==a).count();
    }
}
