package Person.Employee;

import Person.Person;

import java.util.Scanner;

public class Customer extends Person {
    private boolean isPaidProject = false;
    private String productReview;
    public Customer() {
    }

    public Customer(String name, String phoneNumber, String emailAddress, int indexProject, boolean isPaidProject) {
        super(name, phoneNumber, emailAddress, indexProject);
        this.isPaidProject = isPaidProject;
    }

    public boolean isPaidProject() {
        return isPaidProject;
    }

    public void setPaidProject(boolean paidProject) {
        isPaidProject = paidProject;
    }

    @Override
    public void input() {
        super.input();
        System.out.println("Thanh toán: ");
        if(isPaidProject){
            System.out.print("Đã thanh toán.");
        }else{
            System.out.println("Chưa thanh toán.");
        }
        System.out.println("Đánh giá sản phẩm: ");
        System.out.println(getProductReview());
    }
    
    public void setProductReview(){
        if(!this.isPaidProject){
            productReview = "Dự án chưa được thanh toán!";
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Đánh giá chất lượng sản phẩm: ");
        System.out.println("1.Tuyệt vời.");
        System.out.println("2.Tốt.");
        System.out.println("3.Trung bình.");
        System.out.println("4.Tệ.");
        System.out.println("5.Rất tệ.");
        int choice;
        do{
            choice = sc.nextInt();
            if(choice < 0 || choice > 5){
                System.out.println("Hãy nhập đúng lệnh!");
            }
        }while(choice < 0 || choice > 5);
        productReview = getProductReview(choice);
    }

    public String getProductReview(int i) {
        return switch (i) {
            case 1 -> "Tuyệt vời!";
            case 2 -> "Tốt!";
            case 3 -> "Trung bình!";
            case 4 -> "Tệ!";
            case 5 -> "Rất tệ!";
            default -> "";
        };
    }
    public String getProductReview() {
        if(productReview == null){
            setProductReview();
        }
        return this.productReview;
    }

    public void Pay(){
        isPaidProject = true;
    }

    @Override
    public void contactWithProject(){
        System.out.println("customer");
    }

}
