package Person;

import Person.Customer.Customer;
import Person.Employee.Employee;
import Person.Employee.Leader;
import Person.Employee.Manager;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonList {
    private ArrayList<Person> persons;
    public PersonList() {
        persons = new ArrayList<Person>();
    }

    public void inputArrayPerson() {
        Scanner sc = new Scanner(System.in);
        char index;
        do {
            System.out.println("Người bạn muốn nhập là: ");
            System.out.println("1.Khách hàng.");
            System.out.println("2.Nhân viên.");
            int type;
            do {
                type = Integer.parseInt(sc.nextLine());
                if (type < 0 || type > 2) {
                    System.out.println("Hãy nhập thông tin hợp lệ!");
                }
            } while (type < 0 || type > 2);
            Person person = null;
            if (type == 1) {
                System.out.println("Loại nhân viên: ");
                System.out.println("1.Nhân viên thông thường.");
                System.out.println("2.Leader.");
                System.out.println("3.Manager.");
                int choice;
                do {
                    choice = Integer.parseInt(sc.nextLine());
                    if (choice < 0 || choice > 3) {
                        System.out.println("Hãy nhập thông tin hợp lệ!");
                    }
                } while (choice < 0 || choice > 3);
                String typeOfEmployee = "";
                person = switch (choice) {
                    case 1 -> {
                        typeOfEmployee = "Nhân viên.";
                        yield new Employee();
                    }
                    case 2 -> {
                        typeOfEmployee = "Leader.";
                        yield new Leader();
                    }
                    case 3 -> {
                        typeOfEmployee = "Manager.";
                        yield new Manager();
                    }
                    default -> person;
                };
                if (person != null) {
                    if (person instanceof Leader man) {
                        man.setTypeOfEmployee(typeOfEmployee);
                        man.input();
                        persons.add(man);
                    } else if (person instanceof Manager man) {
                        man.setTypeOfEmployee(typeOfEmployee);
                        man.input();
                        persons.add(man);
                    } else {
                        Employee man = (Employee) person;
                        man.setTypeOfEmployee(typeOfEmployee);
                        man.input();
                        persons.add(man);
                    }
                }

            } else if (type == 2) {
                person = new Customer();
                Customer man = (Customer) person;
                man.input();
                persons.add(man);
            }
            System.out.println("Nhập 1 để tiếp tục. Nhập bất kỳ để kết thúc!");
            index = sc.next().charAt(0);
        } while (index == '1');
    }
}
