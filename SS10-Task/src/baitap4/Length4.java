package baitap4;

import java.util.ArrayList;
import java.util.List;

public class Length4 {
    public static void main(String[] args) {
        String text = "Rikkei Acade mye a aa adw";
        List<String> listString = new ArrayList<>();
        String[] list = text.split(" ");
        for (String lists : list) {
            listString.add(lists);
        }
        List<String> newArr = new ArrayList<>();
        for (int i = 0; i < listString.size(); i++) {
            if(listString.get(i).length()>=3){
            newArr.add(listString.get(i));};
        }
        System.out.println(newArr);
        }

}
