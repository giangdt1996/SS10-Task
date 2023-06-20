import java.util.ArrayList;
import java.util.List;

public class SortList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(1);
        numbers.add(4);
        numbers.add(2);

        System.out.println("List trước khi sắp xếp: " + numbers);

        // Sắp xếp danh sách theo thứ tự tăng dần bằng thuật toán sắp xếp nổi bọt
        bubbleSort(numbers);

        System.out.println("List sau khi sắp xếp: " + numbers);
    }

    public static void bubbleSort(List<Integer> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    // Hoán đổi vị trí của hai phần tử
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }
}
