package learn.programs;

public class ContractStaff extends Staff {
    protected int contractDurationInMonths;

    public void read() {
        super.read();
        System.out.println("Enter contract duration in months");
        contractDurationInMonths = sc.nextInt();
    }

    public void display() {
        super.display();
        System.out.println("Contract duration in months : " + contractDurationInMonths);
    }
}
