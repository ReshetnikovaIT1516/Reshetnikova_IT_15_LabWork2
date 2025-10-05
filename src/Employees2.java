public class Employees2 {
    private String name;
    private Department2 department;
    Employees2 nextEmployee;
    private boolean isManager;

    public Employees2(String name, Department2 department) {
        this.name = name;
        this.department = department;
        this.isManager = false;
    }

    public Employees2(String name, Department2 department, boolean isManager) {
        this.name = name;
        this.department = department;
        this.isManager = isManager;
    }

    public String getName() {
        return name;
    }

    public Department2 getDepartment() {
        return department;
    }

    public boolean isManager() {
        return isManager;
    }

    public void setManager(boolean manager) {
        isManager = manager;
    }

    // Вывод всех сотрудников отдела (начальник первым)
    public void printDepartmentEmployees() {
        System.out.println("Все сотрудники отдела " + department.getTitle() + ":");

        // Выводим начальника
        Employees2 manager = findDepartmentManager();
        if (manager != null) {
            System.out.println(" - " + manager.getName() + " (начальник)");
        }

        // Выводим остальных сотрудников (без начальника)
        Employees2 current = department.getFirstEmployee();
        while (current != null) {
            if (!current.isManager()) { // Выводим только не-начальников
                System.out.println(" - " + current.getName());
            }
            current = current.nextEmployee;
        }
    }

    @Override
    public String toString() {
        if (isManager) {
            return name + " начальник отдела " + department.getTitle();
        } else {
            Employees2 manager = findDepartmentManager();
            if (manager != null) {
                return name + " работает в отделе " + department.getTitle() +
                        ", начальник которого " + manager.getName();
            } else {
                return name + " работает в отделе " + department.getTitle() +
                        ", начальник не назначен";
            }
        }
    }

    // Вспомогательный метод для поиска менеджера в отделе
    private Employees2 findDepartmentManager() {
        Employees2 current = department.getFirstEmployee();
        while (current != null) {
            if (current.isManager()) {
                return current;
            }
            current = current.nextEmployee;
        }
        return null;
    }
}