package collections;

import java.util.ArrayList;
import java.util.List;

public class SubList {
    public static List<String> getElementsBetweenIndexes(List<String> list, String el) {
        List<String> result = new ArrayList<>();
        if (list.contains(el)) {
            int firstIndex = list.indexOf(el), lastIndex = list.lastIndexOf(el);
            if (firstIndex != lastIndex) {
                for (int i = firstIndex; i < lastIndex; i++) {
                    result.add(list.get(i));
                }
            }

        }
        return result;
    }

    public static void main(String[] args) {
        List<String> list = List.of("zero", "one", "two", "three", "four", "five", "one");
        List<String> result = getElementsBetweenIndexes(list, "one");
        result.stream()
                .forEach(System.out::println);
    }
}
