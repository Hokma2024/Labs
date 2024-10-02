import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Scanner;
public class Nain
{
    /*
    . Написать программу, получающую на вход в качестве аргумента два параметра - числа x и y.
     Большее из них возвести в квадрат.
     Вывести результат на экран.
     */
    public static void main(String[] args)
    {
        double[] myArray=new double[2];
        System.out.println("Введите числа x и y.");
        Scanner sc=new Scanner(System.in);
        if(sc.hasNextInt())
        {
            myArray[0]=sc.nextDouble();
            if(sc.hasNextDouble())
            {
                myArray[1]=sc.nextDouble();
                OptionalDouble max= Arrays.stream(myArray).max();
                double maxValue = max.getAsDouble();
                maxValue=maxValue*maxValue;
                System.out.println(maxValue);
            }
            else
            {
                System.out.println("Неверное количество параметров.");
            }
        }
        else
        {
            System.out.println("Неверное количество параметров.");
        }
    }



}
