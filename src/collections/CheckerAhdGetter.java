package collections;

import java.util.List;

public class CheckerAhdGetter {

    /**
     * Метод возвращает первый элемент из коллекции
     * @param list - коллекция 
     * @return первый элемент
     */
    public static String getElement(List<String> list) {
        return list.isEmpty() ? "" : list.get(0);
    }
}
