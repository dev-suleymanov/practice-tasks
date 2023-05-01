package collections;

import java.util.List;

public class ArProgression {
    public static int checkData(List<Integer> data) {
        boolean isProgression = true;
        for (int i = 0; i < data.size() - 2; i++) {
            if (data.get(i + 1) != (data.get(i + 2) + data.get(i)) / 2) {
                isProgression = false;
                break;
            }
        }
        return isProgression ? data.stream()
                .mapToInt(Integer::intValue).sum() : 0;
    }

    public static void main(String[] args) {
        List<Integer> data = List.of(
                1, 6, 11, 16, 21,
                26, 31, 36, 41, 46
        );
        System.out.println(checkData(data));
    }
}