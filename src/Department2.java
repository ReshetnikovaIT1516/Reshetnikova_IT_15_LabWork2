public class Department2 {
    private String title;
    private Employees2 firstEmployee; // первый сотрудник в отделе

    public Department2(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public Employees2 getFirstEmployee() {
        return firstEmployee;
    }

    public void setFirstEmployee(Employees2 firstEmployee) {
        this.firstEmployee = firstEmployee;
    }
}