package learn.programs;

public class TechnicalStaff extends Staff {
    protected String skills;

    public void read() {
        super.read();
        System.out.println("Enter skills");
        skills = sc.next();
    }

    public void display() {
        super.display();
        System.out.println("Skills : " + skills);
    }
}
