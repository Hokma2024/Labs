import java.util.Random;
import java.util.Scanner;

public class Quest3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Ввод размера матрицы n
        System.out.println("Введите размер матрицы n (квадратная матрица n x n):");
        int n = scanner.nextInt();

        // Создаем двумерный массив (матрицу)
        int[][] A = new int[n][n];

        // Заполняем матрицу случайными значениями
        System.out.println("Матрица:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = random.nextInt(201) - 100; // случайные значения от -100 до 100
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }

        // Переменные для вычисления среднего геометрического
        double product = 1.0;
        int positiveCount = 0;

        // Поиск положительных элементов побочной диагонали
        for (int i = 0; i < n; i++) {
            int element = A[i][n - 1 - i]; // элемент побочной диагонали
            if (element > 0) {
                product *= element; // умножаем на элемент
                positiveCount++;
            }
        }

        // Вычисляем среднее геометрическое
        if (positiveCount > 0) {
            double geometricMean = Math.pow(product, 1.0 / positiveCount);
            System.out.println("Среднее геометрическое положительных элементов побочной диагонали: " + geometricMean);
        } else {
            System.out.println("На побочной диагонали нет положительных элементов.");
        }
    }
}
