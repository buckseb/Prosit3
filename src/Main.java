
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Student[] l = new Student[]{new Student(3, "3", 3), new Student(1, "1", 1), new Student(2, "2", 2)};
        List<Student> list = Arrays.asList(l);
        StudentManagement sm = new StudentManagement();
        System.out.println("Liste des etudiants :");
    }
}