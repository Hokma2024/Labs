import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Quest1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод массива с консоли
        System.out.println("Введите количество элементов в массиве x:");
        int n = scanner.nextInt();

        int[] x = new int[n];

        System.out.println("Введите элементы массива x:");
        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextInt();
        }

        // Создаем массив y (в виде ArrayList для удобства сжатия)
        ArrayList<Double> y = new ArrayList<>();

        // Переписываем отрицательные элементы массива x в массив y, деленные на 2
        for (int i = 0; i < n; i++) {
            if (x[i] < 0) {
                y.add(x[i] / 2.0); // делим на 2
            }
        }

        // Преобразуем ArrayList обратно в массив
        Double[] yArray = y.toArray(new Double[0]);

        // Сортируем массив y по возрастанию
        Arrays.sort(yArray);

        // Выводим отсортированный массив y
        System.out.println("Отсортированный массив y: " + Arrays.toString(yArray));
    }
}
