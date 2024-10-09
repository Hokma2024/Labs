import java.util.ArrayList;
import java.util.Comparator;

public class GroupDean {
    private int uniqueNumber;            // Уникальный номер группы
    private ArrayList<Dean> deanArray;   // Массив объектов класса Dean

    // Конструктор по умолчанию
    public GroupDean() {
        this.deanArray = new ArrayList<>();
    }

    // Конструктор с параметром
    public GroupDean(int uniqueNumber, ArrayList<Dean> deanArray) {
        this.uniqueNumber = uniqueNumber;
        this.deanArray = deanArray;
    }

    // Геттеры и сеттеры
    public int getUniqueNumber() { return uniqueNumber; }
    public void setUniqueNumber(int uniqueNumber) { this.uniqueNumber = uniqueNumber; }

    public ArrayList<Dean> getDeanArray() { return deanArray; }
    public void setDeanArray(ArrayList<Dean> deanArray) { this.deanArray = deanArray; }

    // Метод для добавления объекта в массив
    public void addDean(Dean dean) {
        deanArray.add(dean);
    }

    // Метод для удаления объекта из массива по фамилии декана
    public void removeDeanByName(String nameDean) {
        deanArray.removeIf(dean -> dean.getNameDean().equals(nameDean));
    }

    // Метод для получения объекта по индексу
    public Dean getDean(int index) {
        if (index >= 0 && index < deanArray.size()) {
            return deanArray.get(index);
        }
        return null;
    }

    // Метод сортировки массива по названию факультета
    public void sortByNameFaculty() {
        deanArray.sort(Comparator.comparing(Dean::getNameFaculty));
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("GroupDean #" + uniqueNumber + ":\n");
        for (Dean dean : deanArray) {
            result.append(dean.toString()).append("\n---\n");
        }
        return result.toString();
    }
}
