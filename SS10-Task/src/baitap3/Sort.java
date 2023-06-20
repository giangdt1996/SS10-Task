package baitap3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(1);
        numbers.add(4);
        numbers.add(2);

        System.out.println("List trước khi sắp xếp: " + numbers);

        // Sắp xếp danh sách theo thứ tự giảm dần bằng phương thức Collections.sort()
        Collections.sort(numbers, Collections.reverseOrder());

        System.out.println("List sau khi sắp xếp: " + numbers);
    }
}
