package learn.programs;

public class StudentResume implements Resume {
    private String name;
    private String result;
    private String discipline;

    public StudentResume(String name, String result, String discipline) {
        this.name = name;
        this.result = result;
        this.discipline = discipline;
    }

    @Override
    public void biodata() {
        System.out.println("Name : " + name);
        System.out.println("Result : " + result);
        System.out.println("Discipline : " + discipline);
    }
}
