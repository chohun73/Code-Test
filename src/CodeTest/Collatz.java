package CodeTest;

public class Collatz {
    public int solution(long num) {
        int a = 0;
        if(num==1) return 0;
        while (num!=1){
            if(num%2 == 0){
                num = num/2;
                a++;
            }
            else{
                num = num * 3 + 1;
                a++;
            }
            if(a>=500) return -1;
        }
        return a;
    }
}
