public class Dean {
    private String nameFaculty;  // Название факультета
    private String room;         // Аудитория
    private String corps;        // Корпус
    private String telephone;    // Контактный телефон
    private String nameDean;     // Фамилия декана

    // Конструктор
    public Dean(String nameFaculty, String room, String corps, String telephone, String nameDean) {
        this.nameFaculty = nameFaculty;
        this.room = room;
        this.corps = corps;
        this.telephone = telephone;
        this.nameDean = nameDean;
    }

    // Геттеры и сеттеры
    public String getNameFaculty() { return nameFaculty; }
    public void setNameFaculty(String nameFaculty) { this.nameFaculty = nameFaculty; }

    public String getRoom() { return room; }
    public void setRoom(String room) { this.room = room; }

    public String getCorps() { return corps; }
    public void setCorps(String corps) { this.corps = corps; }

    public String getTelephone() { return telephone; }
    public void setTelephone(String telephone) { this.telephone = telephone; }

    public String getNameDean() { return nameDean; }
    public void setNameDean(String nameDean) { this.nameDean = nameDean; }

    // Переопределение метода toString() для форматированного вывода
    @Override
    public String toString() {
        return "Факультет: " + nameFaculty + "\n" +
                "Аудитория: " + room + "\n" +
                "Корпус: " + corps + "\n" +
                "Контактный телефон: " + telephone + "\n" +
                "Фамилия декана: " + nameDean;
    }
}
