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

    public void deletePerson() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào ID của người muốn xóa: ");
        int id = sc.nextInt();
        for(int i = 0 ; i < persons.size() ; i++) {
            if (persons.get(i).getId() == id) {
                persons.remove(id);
            }
        }
        System.out.println("Đã xóa thành công.");
    }

    public void updatePerson() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào ID của người muốn sửa: ");
        int id = sc.nextInt();
        int n;
        if(persons.get(id) instanceof Manager) {
            do{
                System.out.println("Bạn muốn sửa thông tin nào?");
                System.out.println("1.Tên.");
                System.out.println("2.Email.");
                System.out.println("3.SDT");
                System.out.println("4.Index Project.");
                System.out.println("5.Year Of Joining.");
                System.out.println("Nhập số 0 để dừng.");
                n = Integer.parseInt(sc.nextLine());
                if(n == 0) {
                    System.out.println("Dừng sửa.");
                    break;
                }
                switch (n) {
                    case 1:
                        System.out.println("Nhập tên bạn muốn thay thế: ");
                        String name = sc.nextLine();
                        persons.get(id).setName(name);
                        break;
                    case 2:
                        System.out.println("Nhập email bạn muốn thay thế: ");
                        String email = sc.nextLine();
                        persons.get(id).setEmailAddress(email);
                        break;
                    case 3:
                        System.out.println("Nhập SDT muốn thay thế: ");
                        String phoneNumber = sc.nextLine();
                        persons.get(id).setPhoneNumber(phoneNumber);
                        break;
                    case 4:
                        System.out.println("Nhập Index Project muốn thay thế: ");
                        int indexProject = Integer.parseInt(sc.nextLine());
                        persons.get(id).setIndexProject(indexProject);
                        break;
                    case 5:
                        System.out.println("Nhập ngày vào làm muốn thay thế: ");
                        int yearOfJoining = Integer.parseInt(sc.nextLine());
                        ((Manager) persons.get(id)).setYearOfJoining(yearOfJoining);
                }
            }while(true);

        } else if (persons.get(id) instanceof Leader) {
            do{
                System.out.println("Bạn muốn sửa thông tin nào?");
                System.out.println("1.Tên.");
                System.out.println("2.Email.");
                System.out.println("3.SDT");
                System.out.println("4.Index Project.");
                System.out.println("5.Year Of Joining.");
                System.out.println("6.Group Index.");
                System.out.println("Nhập số 0 để dừng.");
                n = Integer.parseInt(sc.nextLine());
                if(n == 0) {
                    System.out.println("Dừng sửa.");
                    break;
                }
                switch (n) {
                    case 1:
                        System.out.println("Nhập tên bạn muốn thay thế: ");
                        String name = sc.nextLine();
                        persons.get(id).setName(name);
                        break;
                    case 2:
                        System.out.println("Nhập email bạn muốn thay thế: ");
                        String email = sc.nextLine();
                        persons.get(id).setEmailAddress(email);
                        break;
                    case 3:
                        System.out.println("Nhập SDT muốn thay thế: ");
                        String phoneNumber = sc.nextLine();
                        persons.get(id).setPhoneNumber(phoneNumber);
                        break;
                    case 4:
                        System.out.println("Nhập Index Project muốn thay thế: ");
                        int indexProject = Integer.parseInt(sc.nextLine());
                        persons.get(id).setIndexProject(indexProject);
                        break;
                    case 5:
                        System.out.println("Nhập ngày vào làm muốn thay thế: ");
                        int yearOfJoining = Integer.parseInt(sc.nextLine());
                        ((Leader) persons.get(id)).setYearOfJoining(yearOfJoining);
                    case 6:
                        System.out.println("Nhập vào Index Group muốn thay thế: ");
                        int indexGroup = Integer.parseInt(sc.nextLine());
                        ((Leader) persons.get(id)).setGroupIndex(indexGroup);
                }
            }while(true);

        } else if (persons.get(id) instanceof Customer) {
            do{
                System.out.println("Bạn muốn sửa thông tin nào?");
                System.out.println("1.Tên.");
                System.out.println("2.Email.");
                System.out.println("3.SDT");
                System.out.println("4.Index Project.");
                System.out.println("5.Trạng thái thanh toán.");
                System.out.println("Nhập số 0 để dừng.");
                n = Integer.parseInt(sc.nextLine());
                if(n == 0) {
                    System.out.println("Dừng sửa.");
                    break;
                }
                switch (n) {
                    case 1:
                        System.out.println("Nhập tên bạn muốn thay thế: ");
                        String name = sc.nextLine();
                        persons.get(id).setName(name);
                        break;
                    case 2:
                        System.out.println("Nhập email bạn muốn thay thế: ");
                        String email = sc.nextLine();
                        persons.get(id).setEmailAddress(email);
                        break;
                    case 3:
                        System.out.println("Nhập SDT muốn thay thế: ");
                        String phoneNumber = sc.nextLine();
                        persons.get(id).setPhoneNumber(phoneNumber);
                        break;
                    case 4:
                        System.out.println("Nhập Index Project muốn thay thế: ");
                        int indexProject = Integer.parseInt(sc.nextLine());
                        persons.get(id).setIndexProject(indexProject);
                        break;
                    case 5:
                        System.out.println("Nhập trạng thái thanh toán muốn thay thế: ");
                        System.out.println("1.Đã thanh toán.");
                        System.out.println("2.Chưa thanh toán.");
                        System.out.println("Nhập lựa chọn: ");
                        int choice = Integer.parseInt(sc.nextLine());
                        if(choice == 1) {
                            ((Customer) persons.get(id)).Pay();
                        }else if(choice == 2) {
                            ((Customer) persons.get(id)).setPaidProject(false);
                        }
                        break;
                }
            }while(true);

        }else if (persons.get(id) instanceof Employee) {
            do{
                System.out.println("Bạn muốn sửa thông tin nào?");
                System.out.println("1.Tên.");
                System.out.println("2.Email.");
                System.out.println("3.SDT");
                System.out.println("4.Index Project.");
                System.out.println("5.Year Of Joining.");
                System.out.println("Nhập số 0 để dừng.");
                n = Integer.parseInt(sc.nextLine());
                if(n == 0) {
                    System.out.println("Dừng sửa.");
                    break;
                }
                switch (n) {
                    case 1:
                        System.out.println("Nhập tên bạn muốn thay thế: ");
                        String name = sc.nextLine();
                        persons.get(id).setName(name);
                        break;
                    case 2:
                        System.out.println("Nhập email bạn muốn thay thế: ");
                        String email = sc.nextLine();
                        persons.get(id).setEmailAddress(email);
                        break;
                    case 3:
                        System.out.println("Nhập SDT muốn thay thế: ");
                        String phoneNumber = sc.nextLine();
                        persons.get(id).setPhoneNumber(phoneNumber);
                        break;
                    case 4:
                        System.out.println("Nhập Index Project muốn thay thế: ");
                        int indexProject = Integer.parseInt(sc.nextLine());
                        persons.get(id).setIndexProject(indexProject);
                        break;
                    case 5:
                        System.out.println("Nhập ngày vào làm muốn thay thế: ");
                        int yearOfJoining = Integer.parseInt(sc.nextLine());
                        ((Employee) persons.get(id)).setYearOfJoining(yearOfJoining);
                }
            }while(true);
        }
    }
}
