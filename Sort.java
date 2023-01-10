import java.util.ArrayList;

public class Sort {
    public ArrayList<Student> sortByStudentId(ArrayList<Student> students) {
        students.sort((s1, s2) -> s1.getStudentNumber().compareTo(s2.getStudentNumber()));
        return students;
    }

    public ArrayList<Student> sortByFirstName(ArrayList<Student> students) {
        students.sort((s1, s2) -> s1.getFirstName().compareTo(s2.getFirstName()));
        return students;
    }

    public ArrayList<Student> sortByLastName(ArrayList<Student> students) {
        students.sort((s1, s2) -> s1.getSecondName().compareTo(s2.getSecondName()));
        return students;
    }
}
