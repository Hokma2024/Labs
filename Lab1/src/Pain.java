import java.util.Scanner;
import static java.lang.Math.*;
public class Pain
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значения a, b и x:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double x = sc.nextDouble();
        double Y, F;
        // Вычисляем Y
        if (x <= 0)
        {
            Y = a - pow(b, x + 1);
        }
        else if (x > 0 && x <= 3)
        {
            Y = (1 + 3 * pow(x, a));
        }
        else
        {
            Y = 1 / tan(a * x + 1);
        }
        // Вычисляем F
        if (x <= 0)
        {
            F = pow(E, tan(a * x + 1));
        }
        else if (x > 0 && x <= 3)
        {
            F = pow(x, a) - pow(sin(x), b);
        }
        else
        {
            F = pow(x, 0.4);
        }
        // Выводим результаты
        System.out.println("Y = " + Y);
        System.out.println("F = " + F);
    }
}
