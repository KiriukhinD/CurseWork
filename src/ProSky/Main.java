package ProSky;

public class Main {
    public static void main(String[] args) {
        Employee [] sotrudnic = new Employee[10];
        Employee empl1 = new Employee("Ivan","Ivanov","Ivanovich",1,15.78);
        Employee empl2 = new Employee("Sergei","Gorlov","Mihailovich",2,27.70);
        Employee empl3 = new Employee("Jon","Silver","Silverich",3,54.98);
        Employee empl4 = new Employee("Lis","Kopova","Aleksandrovna",4,34.45);
        Employee empl5 = new Employee("Serg","Gorelii","Nikolaevich",5,47.30);
        Employee empl6 =new Employee("Judi","Erovski","Georgievna",3,56.78);
        sotrudnic[0] = empl1;
        sotrudnic[1] = empl2;
        sotrudnic[2] = empl3;
        sotrudnic[3] = empl4;
        sotrudnic[4] = empl5;
        sotrudnic[5] = empl6;
        Employee.listSotrudnik(sotrudnic);
        Employee.calculateSum(sotrudnic);
        Employee.minSum(sotrudnic);
        Employee.maxSum(sotrudnic);
        Employee.averageSum(sotrudnic);
        Employee.indexSalary(sotrudnic);
        Employee.listSotrudnik(sotrudnic);


    }
}