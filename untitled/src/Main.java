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
        double[] array1 = new double[array.length];
        for (int i = 0; i < n; i++)
        {
            array[i] = (int) (Math.random() * (198)) - 99;
            System.out.println(array[i]);
        }

        // Выводим оригинальный массив
        System.out.println("Оригинальный массив: " + Arrays.toString(array));
        CreateReciprocalFraction(array,array1);
        //Вывод массива и обратными элементами
        System.out.println("Массив с обратными элементами: " + Arrays.toString(array1));
        // Переворачиваем массив
        reverseArray(array1);

        // Выводим измененный массив
        System.out.println("Перевернутый массив: " + Arrays.toString(array1));
    }


    public static void CreateReciprocalFraction(int[] array,double[] array1)
    {
        try {for (int i = 0; i < array.length; i++) {
            if (array[i] == 0)
            {
                throw new ArithmeticException("Error деление на 0");
            }
        }
            for (int i = 0; i < array1.length; i++) {

                array1[i] = 1 / (double) array[i];
            }
        }
        catch(Exception e) {
            System.out.println("Error деление на 0");
        }
    }
    // Метод для переворота массива
    public static void reverseArray(double[] array1)
    {
        int left = 0;
        int right = array1.length - 1;

        while (left < right)
        {
            double temp = array1[left];
            array1[left] = array1[right];
            array1[right] = temp;

            left++;
            right--;
        }
    }
}

