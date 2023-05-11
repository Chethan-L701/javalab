package learn.programs;

public class TeacherResume implements Resume {
    private String name;
    private String qualification;
    private String experience;
    private String achievements;

    public TeacherResume(String name, String qualification, String experience, String achievements) {
        this.name = name;
        this.qualification = qualification;
        this.experience = experience;
        this.achievements = achievements;
    }

    @Override
    public void biodata() {
        System.out.println("Name : " + name);
        System.out.println("Qualification : " + qualification);
        System.out.println("Experience : " + experience);
        System.out.println("Achievements : " + achievements);
    }
}
