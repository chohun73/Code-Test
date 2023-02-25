package CodeTest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Rectangle {
    /*public int solution(int[][] sizes) {
        int answer = 0;
        int[] a = new int[sizes.length];
        int[] b = new int[sizes.length];
        for(int i = 0; i< sizes.length; i++){
            if (sizes[i][0] > sizes[i][1]){
                a[i] = sizes[i][0];
                b[i] = sizes[i][1];
            }
            if (sizes[i][0] < sizes[i][1]){
                a[i] = sizes[i][1];
                b[i] = sizes[i][0];
            }
            if (sizes[i][0] == sizes[i][1]){
                a[i] = sizes[i][0];
                b[i] = sizes[i][0];
            }
        }
        return Arrays.stream(a).max().getAsInt() * Arrays.stream(b).max().getAsInt();
    }*/
    public int solution(int[][] sizes) {
        int length = 0, height = 0;
        for (int[] card : sizes) {
            length = Math.max(length, Math.max(card[0], card[1]));
            height = Math.max(height, Math.min(card[0], card[1]));
        }
        return length * height;
    }
}
