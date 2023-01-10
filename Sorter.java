import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Sorter {

    private static final Set<String> options = Set.of("-n", "-f", "-l");
    public static void main(String[] args) {

        String usage = """
            usage: java Sorter <-f|-n|-l> <file_path>
            Sort the student by student number (with argument -n)
            Sort the student by first name (with argument -f)
            Sort the student by last name (with argument -l)
                """;

        if (args.length != 2 || !options.contains(args[0])) {
            System.out.println(usage);
            return;
        }

        String option = args[0];
        String filePath = args[1];

        File file = new File(filePath);

        try {
            Scanner scanner = new Scanner(file);
            
            ArrayList<Student> students = loadFile(scanner);
            ArrayList<Student> sortedStudent = new ArrayList<>();

            Sort sort = new Sort();

            if (option.equals("-n")) {
                sortedStudent = sort.sortByStudentId(students);
            } else if (option.equals("-f")) {
                sortedStudent = sort.sortByFirstName(students);
            } else if (option.equals("-l")) {
                sortedStudent = sort.sortByLastName(students);
            }

            for (Student student : sortedStudent) {
                System.out.println(student.getStudentNumber() + " " + student.getFirstName() + " " + student.getSecondName());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File cannot be located, may be invalid file path");
        }
    }

    private static ArrayList<Student> loadFile(Scanner scanner) {

        ArrayList<Student> students = new ArrayList<Student>();

        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();

            StringTokenizer tokenizer = new StringTokenizer(line, ",");

            String studentId = tokenizer.hasMoreElements() ? tokenizer.nextToken() : "";
            String firstName = tokenizer.hasMoreElements() ? tokenizer.nextToken() : "";
            String lastName = tokenizer.hasMoreElements() ? tokenizer.nextToken() : "";
            

            Student student = new Student(studentId, firstName, lastName);

            students.add(student);
        }

        return students;
    }


}