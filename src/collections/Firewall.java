package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Firewall {
    public static String checkName(String s, Set<String> words) {
        String result = "Вы сделали правильный выбор!";
        String[] temp = s.split(" ");
        for (String el : temp) {
            if (words.contains(el)) {
                result = "Выберите другую статью...";
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Set<String> words = Set.of("instagram", "фото", "мем", "котик");
        String s = "Создание многомодульного Gradle проекта SpringBoot + Angular в IDEA";
        System.out.println(checkName(s, words));
    }
}
