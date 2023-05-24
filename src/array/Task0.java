package array;

public class Task0 {
    public static void main(String[] args) {
        double[] array = new double[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }
        double max = array[0], min = array[0], ave = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
            if (min > array[i]) {
                min = array[i];
            }
            ave += array[i];
        }
        System.out.println("max number = " + max);
        System.out.println("min number = " + min);
        System.out.println("ave number = " + ave / array.length);
    }
}
