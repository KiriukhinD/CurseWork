package ProSky;

public class Main {
 private static Employee[] employees = new Employee[10];

   private static void calculateSum( )  {

        double sum = 0;
        for (int i = 0; i <= employees.length - 1; i++) {
            if (employees[i] == null){
                continue;
            }
            sum = sum + employees[i].getSalary();
        }
        System.out.println(" сумма всех зарплат : " + sum);
    }
   private static void listSotrudnik() {
        for (int i = 0; i <= employees.length-1; i++) {
            if (employees[i] == null){
                continue;
            }
            System.out.println(employees[i]);
        }

    }
   private static void minSum() {
        double min = employees[0].getSalary();
        for (int i = 0; i <=employees.length-1; i++) {
            if (employees[i] == null){
                continue;
            }
            if(min > employees[i].getSalary()) {
                min = employees[i].getSalary();
            }
        }
        System.out.println(" минимальная  зарплата : " + min);
    }
   private static void maxSum( ) {
        double max = employees[0].getSalary();
        for (int i = 0; i <= employees.length-1; i++) {
            if (employees[i] == null){
                continue;
            }
            if(max < employees[i].getSalary()) {
                max = employees[i].getSalary();
            }
        }
        System.out.println(" максимальная  зарплат : " + max);
    }
   private static void averageSum( ) {
        double sum = 0f;
        int namber = 0 ;
        for (int i = 0; i <= employees.length-1; i++) {
            if (employees[i] == null){
                continue;
            }
            namber++;
            sum = sum + employees[i].getSalary();
        }
        sum = sum/namber;
        System.out.println(" средняя сумма всех зарплат : " + sum+"\n");
    }
   private static void listFio( ) {
        for (int i = 0; i <= employees.length-1; i++) {
            if (employees[i] == null){
                continue;
            }
            System.out.println(" имя : "+employees[i].getName()+" : фамилия  " +employees[i].getFamily() +" : отчество " +employees[i].getPatronymic());
        }

    }



      public static void main(String[] args) {
      employees[0] = new Employee("Игорь","Лесной","Сергеевич",1,52.34);
      employees[1] = new Employee("Андрей","Резин","Алексеевич",2,20.38);
      employees[2] = new Employee("Артём","Колесников","Анатольевич",1,52.34);
      employees[3] = new Employee("Ольга","Пагубная","Валерьевна",3,15.0);
      employees[4] = new Employee("Василий","Попросили","Владимирович",1,60.32);

      averageSum();
      calculateSum();
      listSotrudnik();
      minSum();
      maxSum();
      listFio();

    }
}