import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public interface Management {
    void displayStudents(List<Student> var1, Consumer<Student> var2);

    void displayStudentsByFilter(List<Student> var1, Predicate<Student> var2, Consumer<Student> var3);

    String returnStudentsNames(List<Student> var1, Function<Student, String> var2);

    Student createStudent(Supplier<Student> var1);

    List<Student> sortStudentsById(List<Student> var1, Comparator<Student> var2);

    Stream<Student> convertToStream(List<Student> var1);
}

