package learn.programs;

public class TeachingStaff extends Staff {
    protected String domain;
    protected String publication;

    public void read() {
        super.read();
        System.out.println("Enter domain");
        domain = sc.next();
        System.out.println("Enter publication");
        publication = sc.next();
    }

    public void display() {
        super.display();
        System.out.println("Domain : " + domain);
        System.out.println("Publication : " + publication);
    }
}
