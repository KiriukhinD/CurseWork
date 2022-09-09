package ProSky;


public class Employee {
    private String name;
    private final String family;
    private String patronymic;
    private int department;
    private double salary;
    private int id;
    static int counter ;

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

    static void calculateSum( Employee[] salary) {
        double sum = 0;
        for (int i = 0; i <= salary.length-1; i++) {
            if (salary[i] == null){
                break;
            }
            sum = sum + salary[i].salary;
        }
        System.out.println(" сумма всех зарплат : " + sum);
    }

    static void listSotrudnik( Employee[] salary) {
        for (int i = 0; i <= salary.length-1; i++) {
            if (salary[i] == null){
                break;
            }
            System.out.println(salary[i]);
        }

    }
    static void minSum( Employee[] salary) {
        double min = salary[0].salary;
        for (int i = 0; i < salary.length-1; i++) {
            if (salary[i] == null){
                break;
            }
            if(min > salary[i].salary)
                min =  salary[i].salary;
        }
        System.out.println(" минимальная  зарплата : " + min);
    }
    static void maxSum( Employee[] salary) {
        double max = salary[0].salary;
        for (int i = 0; i <= salary.length-1; i++) {
            if (salary[i] == null){
                break;
            }
            if(max < salary[i].salary)
                max =  salary[i].salary;
        }
        System.out.println(" максимальная  зарплат : " + max);
    }
    static void averageSum( Employee[] salary) {
        double sum = 0f;
        int namber = 0 ;
        for (int i = 0; i <= salary.length-1; i++) {
            if (salary[i] == null){
                  break;
            }
            namber++;
            sum = sum + salary[i].salary;
        }
        sum = sum/namber;
        System.out.println(" средняя сумма всех зарплат : " + sum+"\n");
    }
    static void listFio( Employee[] salary) {
        for (int i = 0; i <= salary.length-1; i++) {
            if (salary[i] == null){
                break;
            }
            System.out.println(" имя : "+salary[i].name+" : фамилия  " +salary[i].family +" : отчество " +salary[i].patronymic);
        }

    }
    static void indexSalary(Employee[] arr) {
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == null) {
                break;
            }
            arr[i].salary = arr[i].salary + arr[i].salary * arr[i].salary / 100;

        }
    }


}




