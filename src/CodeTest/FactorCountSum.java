package CodeTest;

import java.util.Arrays;
public class FactorCountSum {
    public int solution(int left, int right) {
        int answer = 0;
        int[] size = new int[right-left+1];
        for(int i = 0; i<size.length; i++){
            size[i] = left+i;
        }

        var d = Arrays.stream(size).filter(fl -> factor(fl) % 2 == 0).sum();
        var e = Arrays.stream(size).filter(fl -> factor(fl) % 2 == 1).sum();
        return d-e;
    }
    public int factor(int k){
        int a =0;
        for(int i = 1; i<=k; i++){
            if(k%i==0){
                a++;
            }
        }
        return a;
    }
}
