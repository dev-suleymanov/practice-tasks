package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Jackpot {
    public static boolean checkYourWin(String[] combination) {
        Set<String> set = new HashSet<>(Arrays.asList(combination));
        return set.size() == 1;
    }

    public static void main(String[] args) {
        String[] first = {"@", "@", "@", "@"};
        System.out.println(checkYourWin(first));
        String[] second = {"&&", "&", "&&&", "&&&&"};
        System.out.println(checkYourWin(second));

    }
}
