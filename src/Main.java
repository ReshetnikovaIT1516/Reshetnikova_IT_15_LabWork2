import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1) Задача 1.2: Человек. ");
            System.out.println("2) Задача 1.3: Имена. ");
            System.out.println("3) Задача 2.4: Сотрудники и отделы.");
            System.out.println("4) Задача 3.4: Сотрудники и отделы. (c дополнением)");
            System.out.println("5) Задача 4.5: Создаем Имена.");
            System.out.println("6) Задача 5.1: Пистолет стреляет.");
            System.out.println("0 - Выход");
            System.out.print("Выберите задачу: ");

            String choice = scanner.next();

            switch (choice) {
                case "1":
                    scanner.nextLine();
                    System.out.println("Задача 1.2: Человек.");
                    Person cleopatra = new Person("Клеопатра", 152);
                    Person pushkin = new Person();
                    pushkin.setName("Пушкин");
                    pushkin.setHeight(167);
                    Person mayakovskiy = new Person(cleopatra);
                    mayakovskiy.setName("Владимир");
                    mayakovskiy.setHeight(189);
                    System.out.println(cleopatra);
                    System.out.println(pushkin);
                    System.out.println(mayakovskiy);
                    break;

                case "2":
                    scanner.nextLine();
                    System.out.println("Задача 1.3: Имена.");
                    Names cleopatra2 = new Names("Клеопатра");
                    Names pushkin2 = new Names("Пушкин", "Александр", "Сергеевич");
                    Names mayakovskiy2 = new Names("Маяковский", "Владимир");
                    System.out.println(cleopatra2);
                    System.out.println(pushkin2);
                    System.out.println(mayakovskiy2);
                    break;

                case "3":
                    scanner.nextLine();
                    // Создаем отдел
                    Department itDepartment = new Department("IT");

                    // Создаем сотрудников
                    Employees petrov = new Employees("Петров", itDepartment);
                    Employees kozlov = new Employees("Козлов", itDepartment, true);
                    Employees sidorov = new Employees("Сидоров", itDepartment);

                    // Выводим информацию
                    System.out.println(petrov);
                    System.out.println(kozlov);
                    System.out.println(sidorov);
                    break;

                case "4":
                    scanner.nextLine();
                    System.out.println("Задача 3.4: Сотрудники и отделы. (c дополнением)");

                    // отдел
                    Department2 itDepartment2 = new Department2("IT");
                    // сотрудники
                    Employees2 petrov2 = new Employees2("Петров", itDepartment2);
                    Employees2 kozlov2 = new Employees2("Козлов", itDepartment2, true); // начальник
                    Employees2 sidorov2 = new Employees2("Сидоров", itDepartment2);

                    // Связываем сотрудников в список
                    itDepartment2.setFirstEmployee(petrov2);
                    petrov2.nextEmployee = kozlov2;
                    kozlov2.nextEmployee = sidorov2;

                    System.out.println("Представление сотрудников:");
                    System.out.println(petrov2);
                    System.out.println(kozlov2);
                    System.out.println(sidorov2);

                    System.out.println("\nСписок сотрудников через Петрова");
                    petrov2.printDepartmentEmployees();
                    System.out.println("\nСписок сотрудников через Козлова");
                    kozlov2.printDepartmentEmployees();
                    System.out.println("\nСписок сотрудников через Сидорова");
                    sidorov2.printDepartmentEmployees();
                    break;

                case "5":
                    scanner.nextLine();
                    System.out.println("Задача 4.5: Создаем Имена.");
                    CreatingName cleopatra3 = new CreatingName("Клеопатра");
                    CreatingName pushkin3 = new CreatingName("Александр", "Пушкин", "Сергеевич");
                    CreatingName mayakovskiy3 = new CreatingName("Владимир", "Маяковский");
                    CreatingName hristofor3 = new CreatingName("Христофор", "Бонифатьевич");

                    System.out.println(cleopatra3);
                    System.out.println(pushkin3);
                    System.out.println(mayakovskiy3);
                    System.out.println(hristofor3);
                    break;

                case "6":
                    // Создаем пистолет с тремя патронами
                    Gun gun = new Gun(3);
                    System.out.println("Создан " + gun);

                    // Стреляем 5 раз
                    System.out.println("\nСтреляем 5 раз:");
                    for (int i = 1; i <= 5; i++) {
                        System.out.print("Выстрел " + i + ": ");
                        gun.shoot();
                    }

                    System.out.println("\nПосле стрельбы: " + gun);

                    // по умолчанию
                    Gun defaultGun = new Gun();
                    System.out.println("Создан " + defaultGun);

                    System.out.println("\nСтреляем 7 раз:");
                    for (int i = 1; i <= 7; i++) {
                        System.out.print("Выстрел " + i + ": ");
                        defaultGun.shoot();
                    }

                    System.out.println("\nПосле стрельбы: " + defaultGun);
                    break;


                case "0":
                    System.out.println("Выход из программы");
                    scanner.close();
                    return;

                default:
                    System.out.println("Неверный выбор! Попробуйте снова.");
            }

            System.out.println("\nНажмите 'Enter' чтобы снова выбрать номер задачи");
            scanner.nextLine();

        }
    }
}