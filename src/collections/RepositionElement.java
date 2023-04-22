package collections;

import java.util.ArrayList;
import java.util.List;

public class RepositionElement {
    public static List<String> changePosition(List<String> list, int index) {
        int size = list.size() - 1;
        String last = list.remove(size);
        if (index < size) {
            list.set(index, last);
        }
        return list;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        List<String> result = changePosition(list, 2);
        result.stream()
                .forEach(System.out::println);
    }
}