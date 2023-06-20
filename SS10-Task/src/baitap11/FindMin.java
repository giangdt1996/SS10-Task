package baitap11;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMin {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,4,5,666,7,8,4,0,-2);
        System.out.println(Collections.min(numbers));
    }
}
