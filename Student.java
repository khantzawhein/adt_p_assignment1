public class Student {
    private String studentNumber;
    private String firstName, secondName;

    Student(String studentNumber, String firstName, String secondName) {
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getStudentNumber() {
        return studentNumber;
    }



}
