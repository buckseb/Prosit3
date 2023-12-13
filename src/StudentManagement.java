import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StudentManagement implements Management {
    public StudentManagement() {
    }

    public void displayStudents(List<Student> students, Consumer<Student> con) {
        students.forEach(con);
    }

    public void displayStudentsByFilter(List<Student> students, Predicate<Student> pre, Consumer<Student> con) {
        students.stream().filter(pre).forEach(con);
    }

    public String returnStudentsNames(List<Student> students, Function<Student, String> fun) {
        String names = "|";

        Student s;
        for(Iterator var4 = students.iterator(); var4.hasNext(); names = names + (String)fun.apply(s) + "|") {
            s = (Student)var4.next();
        }

        return names;
    }

    public Student createStudent(Supplier<Student> sup) {
        return (Student)sup.get();
    }

    public List<Student> sortStudentsById(List<Student> students, Comparator<Student> com) {
        students.sort(com);
        return students;
    }

    public Stream<Student> convertToStream(List<Student> students) {
        return students.stream();
    }
}

