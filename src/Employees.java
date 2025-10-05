public class Employees {
    private String name;
    private Department department;
    private boolean isManager;

    public Employees(String name, Department department) {
        this.name = name;
        this.department = department;
        this.isManager = false;
    }

    public Employees(String name, Department department, boolean isManager) {
        this.name = name;
        this.department = department;
        this.isManager = isManager;
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }

    public boolean isManager() {
        return isManager;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setManager(boolean manager) {
        isManager = manager;
    }

    @Override
    public String toString() {
        if (isManager) {
            return name + " начальник отдела " + department.getTitle();
        } else {
            return name + " работает в отделе " + department.getTitle();
        }
    }
}