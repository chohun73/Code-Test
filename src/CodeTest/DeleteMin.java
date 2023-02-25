package CodeTest;

import java.util.Arrays;

public class DeleteMin {
    public int[] solution(int[] arr) {
        if(arr.length == 1) return new int[] {-1};
        return Arrays.stream(arr).filter(fl -> fl != Arrays.stream(arr).min().getAsInt()).toArray();
    }
}
