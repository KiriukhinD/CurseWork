package ProSky;

public class Main {
  static Employee[] employees = new Employee[10];

    static void calculateSum( Employee[] salary)  {
        double sum = 0;
        for (int i = 0; i <= salary.length-1; i++) {
            if (salary[i] == null){
                continue;
            }
            sum = sum + salary[i].getSalary();
        }
        System.out.println(" сумма всех зарплат : " + sum);
    }
    static void listSotrudnik( Employee[] salary) {
        for (int i = 0; i <= salary.length-1; i++) {
            if (salary[i] == null){
                continue;
            }
            System.out.println(salary[i]);
        }

    }
    static void minSum( Employee[] salary) {
        double min = salary[0].getSalary();
        for (int i = 0; i <= salary.length-1; i++) {
            if (salary[i] == null){
                continue;
            }
            if(min > salary[i].getSalary()) {
                min = salary[i].getSalary();
            }
        }
        System.out.println(" минимальная  зарплата : " + min);
    }
    static void maxSum( Employee[] salary) {
        double max = salary[0].getSalary();
        for (int i = 0; i <= salary.length-1; i++) {
            if (salary[i] == null){
                continue;
            }
            if(max < salary[i].getSalary()) {
                max = salary[i].getSalary();
            }
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
            sum = sum + salary[i].getSalary();
        }
        sum = sum/namber;
        System.out.println(" средняя сумма всех зарплат : " + sum+"\n");
    }
    static void listFio( Employee[] salary) {
        for (int i = 0; i <= salary.length-1; i++) {
            if (salary[i] == null){
                continue;
            }
            System.out.println(" имя : "+salary[i].getName()+" : фамилия  " +salary[i].getFamily() +" : отчество " +salary[i].getPatronymic());
        }

    }



      public static void main(String[] args) {
      employees[0] = new Employee("Игорь","Лесной","Сергеевич",1,52.34);
      employees[1] = new Employee("Андрей","Резин","Алексеевич",2,20.38);
      employees[2] = new Employee("Артём","Колесников","Анатольевич",1,52.34);
      employees[3] = new Employee("Ольга","Пагубная","Валерьевна",3,15.0);
      employees[4] = new Employee("Василий","Попросили","Владимирович",1,60.32);
      listSotrudnik(employees);
      calculateSum(employees);
      minSum(employees);
      maxSum(employees);
      averageSum(employees);
      listFio(employees);

    }
}