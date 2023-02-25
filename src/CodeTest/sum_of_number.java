package CodeTest;

import java.util.Arrays;

public class sum_of_number {
    public long solution(int a, int b) {
        if(a==b) return a;
        long[] k = {(long)a,(long)b};
        Arrays.sort(k);
        long[] array = new long[(int) (k[1]-k[0]+1)];
        for(long i = 0; i <= k[1]-k[0]; i++){
            array[(int) i] = k[0] + i;
        }
        return Arrays.stream(array).sum();
    }
}
