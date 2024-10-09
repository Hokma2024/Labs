import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

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

        // Создаем вектор B для хранения количества элементов, меньших порогового значения в каждой строке
        Vector<Integer> B = new Vector<>();

        // Подсчет количества элементов каждой строки, меньших порогового значения, и заполнение вектора B
        for (int i = 0; i < rows; i++) {
            int count = 0;
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] < threshold) {
                    count++;
                }
            }
            B.add(count); // Добавляем значение в вектор B
        }

        // Вывод вектора B
        System.out.println("Вектор B (количество элементов в каждой строке, меньших " + threshold + "):");
        for (int i = 0; i < B.size(); i++) {
            System.out.println("B[" + i + "] = " + B.get(i));
        }
    }
}
