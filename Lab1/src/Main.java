import java.util.Scanner;
public class Main
{
    // Функция для обработки аргументов командной строки (первое задание)
    public static void function(String[] args)
    {
        if (args.length > 0)
        {
            System.out.println("Вы ввели " + args.length + " параметров");
        }
        else
        {
            System.out.println("Вы не передавали параметров");
        }
    }
    // Функция для сложения двух чисел (второе задание)
    public static void function1()
    {
        System.out.println("Введите два целочисленных числа:");
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt())
        {
            int i = sc.nextInt(); // Читаем первое число
            if (sc.hasNextInt())
            { // Проверяем наличие второго числа
                int a = sc.nextInt(); // Читаем второе число
                System.out.println(i + " + " + a + " = " + (i + a));
            }
            else
            {
                System.out.println("Неверное количество параметров");
            }
        }
        else
        {
            System.out.println("Неверное количество параметров");
        }
    }
    // Функция для проверки имени пользователя и пароля (третье задание)
    public static void function2(String[] args)
    {
        // Заранее определённые правильные логин и пароль
        String correctUsername = "admin";
        String correctPassword = "password123";
        if (args.length == 2)
        {
            String username = args[0];
            String password = args[1];

            // Проверка логина и пароля
            if (username.equals(correctUsername) && password.equals(correctPassword))
            {
                System.out.println("Вас узнали. Добро пожаловать");
            }
            else
            {
                System.out.println("Логин и пароль не распознаны. Доступ запрещен");
            }
        }
        else
        {
            System.out.println("Неверное количество параметров. Нужно передать 2 параметра: имя пользователя и пароль.");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); // создаём объект класса Scanner
        System.out.println("Введите имя:");

        if (sc.hasNextLine())
        {
            String s = sc.nextLine();
            System.out.println("Hello World " + s);
        }
        else
        {
            System.out.println("Hello World");
        }

        // Вызов функции для обработки аргументов командной строки(первое задание)
        function(args);
        //Вывод и сложение двух чисел(второе задание)
        function1();
        //Имя пользователя и пароль(третье задание)
        function2(args);
    }
}
