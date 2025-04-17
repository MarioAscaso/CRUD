package student;

public class Student {

    private String ID;
    private FullName fullName;
    private String birthday;
    private MarkQualification[] markQualification;

    public Student(String ID, FullName fullName, String birthday, MarkQualification[] markQualification) {
        this.ID = ID;
        this.fullName = fullName;
        this.birthday = birthday;
        markQualification = new MarkQualification[4];
    }

    public String getID() {
        return ID;
    }

    public FullName getFullName() {
        return fullName;
    }

    public String getBirthday() {
        return birthday;
    }

    public MarkQualification[] getMarkQualification() {
        return markQualification;
    }

    public void setMarkQualification(MarkQualification[] markQualification) {
        this.markQualification = markQualification;
    }
}
