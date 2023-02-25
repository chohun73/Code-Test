package CodeTest;

import java.util.Arrays;
import static java.lang.Integer.toBinaryString;

public class SecretMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] ar1 = new String[n];
        String[] ar2 = new String[n];
        for(int i = 0; i < n; i++){
            ar1[i] = toBinaryString(arr1[i]);
            ar2[i] = toBinaryString(arr2[i]);
        }

        for(int i = 0; i < n; i++){
            if (ar1[i].length() != n || ar2[i].length() != n){
                ar1[i] = "0".repeat(n-ar1[i].length()) + ar1[i];
                ar2[i] = "0".repeat(n-ar2[i].length()) + ar2[i];
            }
        }

        String[][] ar3 = new String[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++) {
                String a = String.valueOf(ar1[i].charAt(j));
                String b = String.valueOf(ar2[i].charAt(j));

                if(a.equals("0") && b.equals("0")){
                    ar3[i][j] = " ";
                }
                else ar3[i][j] = "#";
            }
        }
        System.out.println(Arrays.deepToString(ar3));
        String[] answer = new String[n];
        for(int i = 0; i < n; i++) {
            StringBuilder s = new StringBuilder();
            for(int j = 0; j < n; j++) {
                s.append(ar3[i][j]);
            }
            answer[i] = String.valueOf(s);
        }

        return answer;
    }
    /*public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String temp;

        for(int i = 0 ; i < n ; i++){
            temp = String.format("%16s", Integer.toBinaryString(arr1[i] | arr2[i]));
            temp = temp.substring(temp.length() - n);
            temp = temp.replaceAll("1", "#");
            temp = temp.replaceAll("0", " ");
            answer[i] = temp;
        }

        return answer;
    }*/
}
