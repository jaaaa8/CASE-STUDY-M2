package Project;

import java.util.ArrayList;
import java.util.Scanner;

public class ProjectList {
    private ArrayList<Project> pj;

    public ProjectList() {
        pj = new ArrayList<Project>();
    }

    public void showProjects() {
        for (Project p : pj) {
            System.out.println(p);
        }
    }

    public void addProject() {
        Scanner sc = new Scanner(System.in);
    }

}
