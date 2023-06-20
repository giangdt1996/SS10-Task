package baitap7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SoLe {
    public static void main(String[] args) {
        List<Integer> listNumbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11);
        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < listNumbers.size(); i++){
            if(listNumbers.get(i)%2!=0){
                numbers.add(listNumbers.get(i));
            }
        }
        System.out.println(numbers);
    }
}
