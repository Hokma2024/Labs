import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Размер массива
        int n = 80; // или задайте нужный размер массива
        int[] array = new int[n];

        // Заполнение массива случайными значениями от -99 до 99
        fillArrayWithRandomValues(array);

        // Выводим оригинальный массив
        System.out.println("Оригинальный массив: " + Arrays.toString(array));

        // Создание массива с обратными значениями
        double[] reciprocalArray = createReciprocalFraction(array);

        // Выводим массив с обратными значениями
        System.out.println("Массив с обратными значениями: " + Arrays.toString(reciprocalArray));

        // Переворачиваем исходный массив
        reverseArray(array);

        // Выводим перевернутый массив
        System.out.println("Перевернутый массив: " + Arrays.toString(array));
    }

    // Метод для заполнения массива случайными значениями от -99 до 99
    public static void fillArrayWithRandomValues(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(199) - 99; // Генерация чисел от -99 до 99
        }
    }

    // Метод для создания массива с обратными значениями
    public static double[] createReciprocalFraction(int[] array) {
        double[] reciprocalArray = new double[array.length];

        for (int i = 0; i < array.length; i++) {
            try {
                reciprocalArray[i] = 1.0 / array[i];
                if (Double.isInfinite(reciprocalArray[i])) { // Проверка на бесконечность
                    throw new ArithmeticException("Деление на ноль");
                }
            } catch (ArithmeticException e) {
                System.out.println("Ошибка: деление на ноль для элемента с индексом " + i);
                reciprocalArray[i] = 0; // Заменяем значение на 0 при делении на ноль
            }
        }

        return reciprocalArray;
    }

    // Метод для переворота массива на месте
    public static void reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }
    }
}
