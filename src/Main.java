import CodeTest.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //bab();
        //mode();
        //rev();
        //hash();
        //revod();
        //twonum();
        //collatz();
        //pnum();
        //divA();
        //delM();
        //SRO();
        //FCS();
        //CSS();
        //bud();
        //Xi();
        //Rec();
        //SecM();
        //WS();
        //NA();
        //Com();
        //PN();
        //PCM();
        //PE();
        //MCS();
        //dart();
        //FS();
        //OC();
        //lotto();
        GymS();


    }

    static void bab(){
        Babbling sn = new Babbling();

        String babbling[][] = {{"aya", "yee", "u", "maa", "wyeoo"},{"ayaye", "uuuma", "ye", "yemawoo", "ayaa"}};

        for (int i = 0; i < babbling.length; i++) {
            System.out.println(sn.solution(babbling[i]));
        }
    }
    static void mode(){
        Mode sn = new Mode();

        int mode[] = {1, 2, 3, 3, 3, 5};

        System.out.println(sn.solution(mode));
    }
    static void rev(){
        ReverseNumber sn = new ReverseNumber();

        long n = 123456;

        System.out.println(Arrays.toString(sn.solution(n)));
    }
    static void hash(){
        hashade sn = new hashade();

        int x = 11;

        System.out.println(sn.solution(x));
    }
    static void revod(){
        ReverseOrder sn = new ReverseOrder();

        int n = 118372;

        System.out.println(sn.solution(n));
    }
    static void twonum() {
        sum_of_number sn = new sum_of_number();

        int a = 3;
        int b = 5;

        System.out.println(sn.solution(a, b));
    }
    static void collatz(){
        Collatz sn = new Collatz();

        int num = 626331;

        System.out.println(sn.solution(num));
    }
    static void pnum(){
        Phonenum sn = new Phonenum();

        String phone_number = "01033334444";

        System.out.println(sn.solution(phone_number));
    }
    static void divA(){
        DivisorArray sn = new DivisorArray();

        int[] arr = {5, 9, 7, 10};
        int divisor = 5;

        System.out.println(Arrays.toString(sn.solution(arr, divisor)));
    }
    static void delM(){
        DeleteMin sn = new DeleteMin();

        int[] arr = {4,3,2,1};

        System.out.println(Arrays.toString(sn.solution(arr)));
    }
    static void SRO(){
        StringReverseOrder sn = new StringReverseOrder();

        String s = "Zbcdefg";

        System.out.println(sn.solution(s));
    }
    static void FCS(){
        FactorCountSum sn = new FactorCountSum();

        int left = 13;
        int right = 17;

        System.out.println(sn.solution(left, right));
    }
    static void CSS(){
        CreateStrangeString sn = new CreateStrangeString();

        String s = "   try hello   world   ";

        System.out.println(sn.solution(s));
    }
    static void bud(){
        budget sn = new budget();

        int[] d = {1,3,2,5,4};
        int budget = 9;

        System.out.println(sn.solution(d, budget));
    }
    static void Xi(){
        XizerCode sn = new XizerCode();

        String s = "a B z";
        int n = 4;

        System.out.println(sn.solution(s,n));
    }
    static void Rec(){
        Rectangle sn = new Rectangle();

        int[][] sizes = {{60, 50}, {30, 70}, {60, 30},{80, 40}};

        System.out.println(sn.solution(sizes));
    }
    static void SecM(){
        SecretMap sn = new SecretMap();

        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};

        System.out.println(Arrays.toString(sn.solution(n, arr1, arr2)));
    }
    static void WS(){
        WantSort sn = new WantSort();

        String[] strings = {"cdx", "abce", "abcd", "cax"};
        int n = 1;

        System.out.println(Arrays.toString(sn.solution(strings, n)));
    }
    static void NA(){
        NumberAlphabet sn = new NumberAlphabet();

        String s = "one4seveneight";

        System.out.println(sn.solution(s));
    }
    static void Com(){
        Combination sn = new Combination();

        int[] numbers = {2,1,3,4,1};

        System.out.println(Arrays.toString(sn.solution(numbers)));
    }
    static void PN(){
        PartNumber sn = new PartNumber();

        String t = "3141592";
        String p = "271";


        System.out.println(sn.solution(t,p));
    }
    static void PCM(){
        PhoneCatMon sn = new PhoneCatMon();

        int[] nums = {3,1,2,3};

        System.out.println(sn.solution(nums));
    }
    static void PE(){
        PractiseExam sn = new PractiseExam();

        int[] answers = {1,2,3,4,5};

        System.out.println(Arrays.toString(sn.solution(answers)));
    }
    static void MCS(){
        MostCloseStr sn = new MostCloseStr();

        String s = "banana";

        System.out.println(Arrays.toString(sn.solution(s)));
    }
    static void dart(){
        Dart sn = new Dart();

        String dartResult = "1S2D*3T";

        System.out.println(sn.solution(dartResult));
    }
    static void FS(){
        FruitSell sn = new FruitSell();

        int k = 3;
        int m = 4;
        int[] score = {1, 2, 3, 1, 2, 3, 1};

        System.out.println(sn.solution(3,4,score));
    }
    static void OC(){
        OwnersClub sn = new OwnersClub();

        int k = 3;
        int[] score = {10, 100, 20, 150, 1, 100, 200};

        System.out.println(Arrays.toString(sn.solution(3, score)));
    }
    static void lotto(){
        Lotto sn = new Lotto();

        int[] lottos = {44, 1, 0, 0, 31, 2};
        int[] win_nums = {31, 10, 45, 1, 6, 19};

        System.out.println(Arrays.toString(sn.solution(lottos,win_nums)));
    }
    static void GymS(){
        Gymsuit sn = new Gymsuit();

        int n = 5;
        int[] lost = {2,4};
        int[] reserve = {1,3,5};

        System.out.println(sn.solution(n,lost,reserve));
    }
}
