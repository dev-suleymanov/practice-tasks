package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PutContainsKey {

    public static Map<Integer, User> addNewElementWithoutCheck(List<User> list) {
        Map<Integer, User> rsl = new HashMap<>();
        list.stream()
                .forEach(el -> rsl.put(el.id, el));
        return rsl;
    }

    public static Map<Integer, User> addNewElementWithCheck(List<User> list) {
        Map<Integer, User> rsl = new HashMap<>();
        list.stream()
                .filter(el -> !rsl.containsKey(el.id))
                .forEach(el -> rsl.put(el.id, el));
        return rsl;
    }

    public record User(int id, String name) {
    }

    public static void main(String[] args) {
        User one = new User(1, "Name1");
        User two = new User(2, "Name2");
        User three = new User(1, "Name3");
        List<User> list = List.of(one, two, three);
        Map<Integer, User> firstMap = PutContainsKey.addNewElementWithoutCheck(list);
        Map<Integer, User> secondMap = PutContainsKey.addNewElementWithCheck(list);
        for (Integer el : firstMap.keySet()) {
            System.out.println("key: " + el + "value: " + firstMap.get(el));
        }
        System.out.println();
        for (Integer el : secondMap.keySet()) {
            System.out.println("key: " + el + "value: " + secondMap.get(el));
        }
    }
}