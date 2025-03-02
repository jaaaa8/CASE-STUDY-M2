package Person.Employee;

import java.util.Scanner;

public class Leader extends Employee {
    private int groupIndex;

    public Leader(String name, String phoneNumber, String emailAddress, int indexProject, int yearOfJoining, String typeOfEmployee, int salary, int groupIndex) {
        super(name, phoneNumber, emailAddress, indexProject, yearOfJoining, typeOfEmployee, salary);
        this.groupIndex = groupIndex;
    }

    public Leader() {}

    @Override
    public void input(){
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Nhóm quản lí: ");
        this.groupIndex = sc.nextInt();
    }

    public int getGroupIndex() {
        return groupIndex;
    }

    public void setGroupIndex(int groupIndex) {
        this.groupIndex = groupIndex;
    }

    @Override
    public void checkSalary() {

    }

    @Override
    public void contactWithProject(){
        System.out.println("leader");
    }
}
