package baitap10;

import java.util.Arrays;
import java.util.List;

public class SumInteger {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,3,4,66,77,55,4,3);
        int sum = 0;
        for (Integer i : numbers)
              {sum += i;

        }
        System.out.println(sum);
    }
}
