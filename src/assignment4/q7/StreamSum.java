package assignment4.q7;

import java.util.Arrays;
import java.util.List;

public class StreamSum {
    public static void main(String[] args) {
        List<Integer> list =Arrays.asList(2,4,6,8,3,10,5,7);
        int sum=list.stream().filter(n->n>5).mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
