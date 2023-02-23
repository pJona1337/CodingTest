package pl.masters.coding.teacher;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;
import pl.masters.coding.common.Language;
import pl.masters.coding.teacher.model.Teacher;
import java.util.ArrayList;
import java.util.List;

@Repository //adnotacja do usunięcia w momencie przejścia na interface z JPA
public class TeacherRepository {

    private static final List<Teacher> teacherDb = new ArrayList<>();

    public List<Teacher> findAll() {
        return teacherDb;
    }

    @PostConstruct
    private static void init() {
        Teacher teacher1 = Teacher.builder()
                .id(1)
                .firstName("Jan")
                .lastName("Kowalski")
                .build();

        Teacher teacher2 = Teacher.builder()
                .id(2)
                .firstName("Ryszard")
                .lastName("Cebula")
                .languageList(List.of(Language.POLISH, Language.ENGLISH, Language.ARABIC))
                .build();

        Teacher teacher3 = Teacher.builder()
                .id(3)
                .firstName("Crag")
                .lastName("Hack")
                .languageList(List.of(Language.ITALIAN, Language.FRENCH))
                .build();

        Teacher teacher4 = Teacher.builder()
                .id(4)
                .firstName("Paweł")
                .lastName("Dzik")
                .languageList(List.of(Language.ITALIAN, Language.JAPANESE, Language.ENGLISH))
                .build();

        teacherDb.add(teacher1);
        teacherDb.add(teacher2);
        teacherDb.add(teacher3);
        teacherDb.add(teacher4);
    }
}
