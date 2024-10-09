import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Создание объектов Dean
        Dean dean1 = new Dean("Физико-математический", "216", "C", "123-4567", "Строганова");

        // Создание массива и добавление объектов Dean в ArrayList
        ArrayList<Dean> deans = new ArrayList<>();
        deans.add(dean1);

        // Создание объекта GroupDean с уникальным номером и массивом объектов Dean
        GroupDean groupDean = new GroupDean(1, deans);

        // Вывод информации о группе деканатов
        System.out.println("Исходная группа деканатов:");
        System.out.println(groupDean);

        // Добавление нового деканата
        Dean dean4 = new Dean("Филологический", "104", "C", "456-7890", "Вавилов");
        groupDean.addDean(dean4);

        // Вывод информации после добавления
        System.out.println("После добавления нового деканата:");
        System.out.println(groupDean);

        // Удаление деканата по фамилии декана
        groupDean.removeDeanByName("Строганова");

        // Вывод информации после удаления
        System.out.println("После удаления деканата с фамилией декана 'Строганова':");
        System.out.println(groupDean);

        // Сортировка массива по названию факультета
        groupDean.sortByNameFaculty();

        // Вывод информации после сортировки
        System.out.println("После сортировки по названию факультета:");
        System.out.println(groupDean);
    }
}
