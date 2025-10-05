public class CreatingName {
    private String firstName;
    private String lastName;
    private String patronymic;

    // Конструктор только с именем
    public CreatingName(String firstName) {
        String error = Validation.getCreatingNameErrorMessage(firstName);
        if (error != null) {
            System.out.println("Ошибка: " + error);
            this.firstName = "Иван";
        } else {
            this.firstName = firstName;
        }
    }

    // Конструктор с именем и фамилией
    public CreatingName(String firstName, String lastName) {
        this(firstName);
        if (lastName != null && !lastName.isEmpty()) {
            this.lastName = lastName;
        }
    }

    // Конструктор с полным ФИО
    public CreatingName(String firstName, String lastName, String patronymic) {
        this(firstName, lastName);
        if (patronymic != null && !patronymic.isEmpty()) {
            this.patronymic = patronymic;
        }
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        String error = Validation.getCreatingNameErrorMessage(firstName);
        if (error != null) {
            System.out.println("Ошибка: " + error);
            this.firstName = "Иван";
        } else {
            this.firstName = firstName;
        }
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    @Override
    public String toString() {
        String result = firstName;

        // Добавляем фамилию, если она есть
        if (lastName != null && !lastName.isEmpty()) {
            result = result + " " + lastName;
        }

        // Добавляем отчество, если оно есть
        if (patronymic != null && !patronymic.isEmpty()) {
            result = result + " " + patronymic;
        }

        return result;
    }
}