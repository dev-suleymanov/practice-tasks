package collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Dictionary {
    public static Map<String, List<String>> collectData(String[] strings) {
        Map<String, List<String>> rsl = new HashMap<>();
        for (String el : strings) {
            rsl.put("" + el.charAt(0), Arrays.stream(strings)
                    .filter(e -> e.charAt(0) == el.charAt(0))
                    .collect(Collectors.toList()));
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] data = {"two", "three", "four", "five", "six", "seven"};
        Map<String, List<String>> result = collectData(data);
        System.out.println(result);
    }
}
