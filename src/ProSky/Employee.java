package ProSky;


public class Employee {
private final String name;
    private final String family;
    private final String patronymic;
    private int department;
    private  double salary;
    private  final int id;
    private static int counter ;

    Employee(String name, String family, String patronymic, int department, double salary) {
        this.id = ++counter;
        this.name = name;
        this.family = family;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;

    }

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getId() {
        return id;
    }

    public int getDepartment() {
        return department;
    }
    public double getSalary(){
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "имя : " + name + "\nфамилия : " + family + "\nотчество : " + patronymic + "\nдепартамент : " + department + "\nзарплата : " + salary + "\nid : " + id + "\n";
    }


}




