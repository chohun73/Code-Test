package CodeTest;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class ReverseNumber{
        public int[] solution(long n) {

            return new StringBuilder().append(n).reverse().toString().chars().map(mp -> mp-48).toArray();

        }
}
