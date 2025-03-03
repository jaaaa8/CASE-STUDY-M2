package Person;

import Manage.ProjectAccess;

import java.util.Scanner;

public abstract class Person implements ProjectAccess {
    protected int id;
    protected String name;
    protected String phoneNumber;
    protected String emailAddress;
    protected int indexProject;

    public Person(int id, String name, String phoneNumber, String emailAddress, int indexProject) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.indexProject = indexProject;
    }
    public Person(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getIndexProject() {
        return indexProject;
    }

    public void setIndexProject(int indexProject) {
        this.indexProject = indexProject;
    }

    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Tên: ");
        this.name = sc.nextLine();
        System.out.println("SDT: ");
        this.phoneNumber = sc.nextLine();
        System.out.println("Email: ");
        this.emailAddress = sc.nextLine();
        System.out.println("STT của dự án góp mặt: ");
        this.indexProject = sc.nextInt();
    }
}
