package baitap1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RandomListNumber {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        int count = (int) (Math.random() * 10) + 1;

        for (int i = 0; i < count; i++) {
            int randomNumber = (int) (Math.random() * 100);
            numbers.add(randomNumber);
        }

        // In ra List số nguyên
        System.out.println("List số nguyên: " + numbers);

        // Tìm phần tử lớn nhất trong List
        int maxNumber = Collections.max(numbers);

        // In ra phần tử lớn nhất
        System.out.println("Phần tử lớn nhất: " + maxNumber);
    }
}
