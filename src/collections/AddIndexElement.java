package collections;

import java.util.ArrayList;
import java.util.List;

public class AddIndexElement {
    public static boolean addNewElement(List<String> list, int index, String str) {
        List<String> temp = new ArrayList<>(list);
        if (!list.contains(str)) {
            list.add(index, str);
        }
        return list.size() != temp.size();
    }
}