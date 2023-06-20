package baitap9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Duplicate {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,1,1,3,2,4,5,6,7,6,5,4);

        List<Integer> newNumbers = new ArrayList<>();
        System.out.println(newNumbers);
        for (int i = 0; i < numbers.size(); i++) {
            if (!newNumbers.contains(numbers.get(i))) {
                newNumbers.add(numbers.get(i));
            }
        }

        System.out.println("Chuoi cu: " + numbers);
        System.out.println("Chuoi ko co phan tu trung lap: " + newNumbers);
    }
}
