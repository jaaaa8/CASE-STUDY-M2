package Project;

import Person.Person;

import java.util.ArrayList;
import java.util.Scanner;

public class Project {
    private String projectName;
    private String startDate;
    private String expectedEndDate;
    private ArrayList<Person> person;
    private String typeOfProject;
    private long expense;
    private long revenue;
    private boolean isPaid;
    private String actionHistory;

    public Project(){}

    public Project(String projectName, String startDate, String expectedEndDate, ArrayList<Person> person, String typeOfProject, long expense, long revenue, boolean isPaid, String actionHistory) {
        this.projectName = projectName;
        this.startDate = startDate;
        this.expectedEndDate = expectedEndDate;
        this.person = person;
        this.typeOfProject = typeOfProject;
        this.expense = expense;
        this.revenue = revenue;
        this.isPaid = isPaid;
        this.actionHistory = actionHistory;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getExpectedEndDate() {
        return expectedEndDate;
    }

    public void setExpectedEndDate(String expectedEndDate) {
        this.expectedEndDate = expectedEndDate;
    }

    public String getTypeOfProject() {
        return typeOfProject;
    }

    public void setTypeOfProject(String typeOfProject) {
        this.typeOfProject = typeOfProject;
    }

    public long getExpense() {
        return expense;
    }

    public void setExpense(long expense) {
        this.expense = expense;
    }

    public long getRevenue() {
        return revenue;
    }

    public void setRevenue(long revenue) {
        this.revenue = revenue;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public String getActionHistory() {
        return actionHistory;
    }

    public void setActionHistory(String actionHistory) {
        this.actionHistory = actionHistory;
    }

    public void inputProject(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Tên dự án: ");
        this.projectName = sc.nextLine();
        System.out.println("Ngày khởi công: ");
        this.startDate = sc.nextLine();
        System.out.println("Ngày ước tính hoàn thành: ");
        this.expectedEndDate = sc.nextLine();

    }

    public void countProfitPercent(){
        long profit = revenue-expense;
        double percentProfit = profit / 100.0;
        System.out.print("Lợi nhuận dự án là: "+(profit)+"\n" +
                "Phần trăm lợi nhuận là "+(percentProfit)+"\n" +
                "Dự án "+projectName+((percentProfit> 1.4) ? " đạt chỉ tiêu." : " không đạt chỉ tiêu."));
    }
}
