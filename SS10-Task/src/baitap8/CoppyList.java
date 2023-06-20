package baitap8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CoppyList {
    public static void main(String[] args) {
        List<String> oldList = new ArrayList<String>();
        List<String> newList = new ArrayList<String>();
        oldList.add("abc");
        oldList.add("def");
        newList.addAll(oldList);

        System.out.println(newList);
    }
}
