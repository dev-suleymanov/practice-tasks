package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GetOrDefault {
    private Map<Integer, List<String>> store = new HashMap<>();

    public void addValue(int index, List<String> list) {
        if (store.get(index) == null) {
            store.put(index, list);
        }
    }

    public List<String> getValue(int index) {
        return store.getOrDefault(index, new ArrayList<>());
    }

    public static void main(String[] args) {
        List<String> list = List.of("one", "two", "three");
        List<String> second = List.of("four", "five", "six");
        GetOrDefault getOrDefault = new GetOrDefault();
        getOrDefault.addValue(1, list);
        getOrDefault.addValue(2, second);
        List<String> result = getOrDefault.getValue(1);
        result.stream()
                .forEach(System.out::println);
    }
}
