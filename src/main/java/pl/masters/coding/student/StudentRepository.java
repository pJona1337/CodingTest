package pl.masters.coding.student;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;
import pl.masters.coding.common.Language;
import pl.masters.coding.student.model.Student;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {

    private static final List<Student> studentDb = new ArrayList<>();

    public List<Student> findAll() {
        return studentDb;
    }

    @PostConstruct
    private static void init() {
        Student student1 = Student.builder()
                .id(1)
                .firstName("Jack")
                .lastName("Sparrow")
                .language(Language.ENGLISH)
                .build();

        Student student2 = Student.builder()
                .id(2)
                .firstName("Conrado")
                .lastName("De Komareno")
                .language(Language.ITALIAN)
                .build();
        Student student3 = Student.builder()
                        .id(3)
                .firstName("Hector")
                .lastName("Barbossa")
                .language(Language.CHINESE)
                .build();

        studentDb.add(student1);
        studentDb.add(student2);
        studentDb.add(student3);
    }
}
