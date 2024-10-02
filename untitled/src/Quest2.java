import java.util.Random;
import java.util.Scanner;

public class Quest2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Ввод количества строк и столбцов
        System.out.println("Введите количество строк матрицы:");
        int rows = scanner.nextInt();
        System.out.println("Введите количество столбцов матрицы:");
        int cols = scanner.nextInt();

        // Создаем двумерный массив (матрицу)
        int[][] matrix = new int[rows][cols];

        // Заполняем матрицу случайными значениями
        System.out.println("Матрица:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(100); // случайные значения от 0 до 99
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Ввод порогового значения
        System.out.println("Введите пороговое значение:");
        int threshold = scanner.nextInt();

        // Подсчет количества элементов каждой строки, меньших порогового значения
        for (int i = 0; i < rows; i++) {
            int count = 0;
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] < threshold) {
                    count++;
                }
            }
            System.out.println("Количество элементов в строке " + (i + 1) + ", меньших " + threshold + ": " + count);
        }
    }
}
