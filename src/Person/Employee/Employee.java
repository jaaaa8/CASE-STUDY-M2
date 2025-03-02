package Person.Employee;

import Person.Person;

import java.util.Scanner;

public class Employee extends Person {
    private int yearOfJoining;
    private String typeOfEmployee;
    private int salary;

    public Employee(String name, String phoneNumber, String emailAddress, int indexProject, int yearOfJoining, String typeOfEmployee, int salary) {
        super(name, phoneNumber, emailAddress, indexProject);
        this.yearOfJoining = yearOfJoining;
        this.typeOfEmployee = typeOfEmployee;
        this.salary = salary;
    }
    public Employee() {}

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getTypeOfEmployee() {
        return typeOfEmployee;
    }

    public void setTypeOfEmployee(String typeOfEmployee) {
        this.typeOfEmployee = typeOfEmployee;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        this.indexProject = sc.nextInt();
        System.out.println("Năm vào làm: ");
        this.yearOfJoining = sc.nextInt();
    }

    public void reportDaily(){
        System.out.println("Report daily");
    }
    public void checkSalary(){
        System.out.println(getSalary());
    }

    @Override
    public void contactWithProject(){
        System.out.println("employee");
    }
}
