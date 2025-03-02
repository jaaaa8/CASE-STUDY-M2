package Person;

import Manage.ProjectAccess;

import java.util.Scanner;

public abstract class Person implements ProjectAccess {
    protected String name;
    protected String phoneNumber;
    protected String emailAddress;
    protected int indexProject;

    public Person(String name, String phoneNumber, String emailAddress, int indexProject) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.indexProject = indexProject;
    }
    public Person(){}

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
