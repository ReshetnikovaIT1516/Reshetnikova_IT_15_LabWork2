public class Person {
    private String name;
    private int height;

    public Person() {
        this.name = "Иван";
        this.height = 170;
    }

    public Person(Person person) {
        this.name = person.name;
        this.height = person.height;
    }

    public Person(String name, int height) {
        setName(name);
        setHeight(height);
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }


    public void setName(String name) {
        String error = Validation.getNameErrorMessage(name);
        if (error != null) {
            System.out.println("Ошибка имени: " + error);
            this.name = "Иван";
        } else {
            this.name = name;
        }
    }

    public void setHeight(int height) {
        String error = Validation.getHeightErrorMessage(height);
        if (error != null) {
            System.out.println("Ошибка роста: " + error);
            this.height = 170;
        } else {
            this.height = height;
        }
    }



    @Override
    public String toString() {
        return name + " рост: " + height + " см";
    }
}