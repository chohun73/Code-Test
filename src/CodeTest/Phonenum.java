package CodeTest;

public class Phonenum {
    public String solution(String phone_number) {
        String answer = "";
        String a = "*".repeat(phone_number.length()-4);

        String b = "";
        for(int i = phone_number.length()-4; i<phone_number.length(); i++){
            b += String.valueOf(phone_number.charAt(i));
        }
        return a+b;
    }
}
