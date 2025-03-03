package Person.Employee;

import Manage.EmployeeManage;

public class Manager extends Employee implements EmployeeManage {
    public Manager() {
    }

    public Manager(int id, String name, String phoneNumber, String emailAddress, int indexProject, int yearOfJoining, String typeOfEmployee, int salary) {
        super(id, name, phoneNumber, emailAddress, indexProject, yearOfJoining, typeOfEmployee, salary);
    }



    @Override
    public void contactWithProject(){
        System.out.println("manager");
    }
}
