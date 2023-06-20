package baitap2;

import java.util.ArrayList;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        List<Integer> reverseList = new ArrayList<>();
        for(int i= numbers.size()-1; i>=0; i--) {
            reverseList.add(numbers.get(i));
        }
        System.out.println(reverseList);
    }
}
