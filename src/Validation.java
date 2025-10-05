public class Validation {

    // Проверка для имени
    public static String getNameErrorMessage(String name) {
        if (name == null || name.isEmpty()) {
            return "Имя не может быть пустым";
        }
        if (name.length() < 2) {
            return "Имя должно содержать минимум 2 символа";
        }
        if (name.length() > 20) {
            return "Имя не может превышать 20 символов";
        }
        return null;
    }

    // Проверка для имен
    public static String getNamesErrorMessage(String lastName, String firstName, String patronymic) {
        if ((lastName == null || lastName.isEmpty()) &&
                (firstName == null || firstName.isEmpty()) &&
                (patronymic == null || patronymic.isEmpty())) {
            return "Хотя бы одно имя должно быть задано";
        }
        return null;
    }

    // Проверка для роста
    public static String getHeightErrorMessage(int height) {
        if (height < 100) {
            return "Рост не может быть меньше 100 см";
        }
        if (height > 210) {
            return "Рост не может быть больше 210 см";
        }
        return null;
    }

    // Проверка для патрон
    public static String getBulletCountErrorMessage(int bullets) {
        if (bullets < 0) {
            return "Количество патронов не может быть отрицательным";
        }
        return null;
    }


    // Проверка для создания имен
    public static String getCreatingNameErrorMessage(String firstName) {
        if (firstName == null || firstName.isEmpty()) {
            return "Личное имя не может быть пустым";
        }
        return null;
    }
}