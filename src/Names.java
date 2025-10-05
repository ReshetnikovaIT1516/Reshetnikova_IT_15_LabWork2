public class Names {
    private String lastName;
    private String firstName;
    private String patronymic;

    public Names(String lastName, String firstName, String patronymic) {
        String error = Validation.getNamesErrorMessage(lastName, firstName, patronymic);
        if (error != null) {
            System.out.println("Ошибка: " + error);
            this.lastName = "Иванов";
            this.firstName = "Иван";
            this.patronymic = "Иванович";
        } else {
            this.lastName = lastName;
            this.firstName = firstName;
            this.patronymic = patronymic;
        }
    }

    public Names(String firstName) {
        this(null, firstName, null);
    }

    public Names(String lastName, String firstName) {
        this(lastName, firstName, null);
    }



    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        String error = Validation.getNameErrorMessage(firstName);
        if (error != null) {
            System.out.println("Ошибка имени: " + error);
            this.firstName = "Иван";
        } else {
            this.firstName = firstName;
        }
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }


    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        // Добавляем фамилию, если она есть
        if (lastName != null && !lastName.isEmpty()) {
            result.append(lastName);
        }

        // Добавляем имя, если оно есть
        if (firstName != null && !firstName.isEmpty()) {
            if (result.length() > 0) {
                result.append(" ");
            }
            result.append(firstName);
        }

        // Добавляем отчество, если оно есть
        if (patronymic != null && !patronymic.isEmpty()) {
            if (result.length() > 0) {
                result.append(" ");
            }
            result.append(patronymic);
        }

        // Если все поля пустые, возвращаем пустую строку
        return result.toString();
    }

}