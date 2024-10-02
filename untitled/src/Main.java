import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Ввод количества элементов массива
        System.out.print("Введите количество элементов в массиве: ");
        int n = scanner.nextInt();

        // Создание и заполнение массива
        int[] array = new int[n];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++)
        {
            array[i] = scanner.nextInt();
        }

        // Выводим оригинальный массив
        System.out.println("Оригинальный массив: " + Arrays.toString(array));

        // Переворачиваем массив
        reverseArray(array);

        // Выводим измененный массив
        System.out.println("Перевернутый массив: " + Arrays.toString(array));
    }

    // Метод для переворота массива
    public static void reverseArray(int[] array)
    {
        int left = 0;
        int right = array.length - 1;

        while (left < right)
        {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }
    }
}
