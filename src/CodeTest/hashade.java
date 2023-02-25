package CodeTest;

public class hashade {
    public boolean solution(int x) {
        boolean answer = true;
        answer = x % arr(x) == 0;
        return answer;
    }

    public int arr(int x) {
        int a = 0;
        int xa = String.valueOf(x).length();
        for (int i = xa - 1; i >= 0; i--) {
            a += x / Math.pow(10, i);
            x = (int) (x % Math.pow(10, i));
        }
        return a;
    }
}
