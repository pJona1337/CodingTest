package pl.masters.coding.lesson;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;
import pl.masters.coding.common.Language;
import pl.masters.coding.lesson.model.Lesson;
import pl.masters.coding.student.StudentRepository;
import pl.masters.coding.student.model.Student;
import pl.masters.coding.teacher.model.Teacher;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Repository
public class LessonRepository {

    private static final List<Lesson> lessonDb = new ArrayList<>();

    public List<Lesson> findAll() {
        return lessonDb;
    }


    // musze zmienic te zaciaganie studentow i nauczycieli
    @PostConstruct
    private static void init() {
        Lesson lesson1 = Lesson.builder()
                .id(1)
                .student(Student.builder().id(1).firstName("1").lastName("1").language(Language.ENGLISH).build())
                .teacher(Teacher.builder().id(1).firstName("1t").lastName("1t").languageList(List.of(Language.ENGLISH)).build())
                .date(LocalDate.now())
                .build();

        Lesson lesson2 = Lesson.builder()
                .id(2)
                .student(Student.builder().id(1).firstName("1").lastName("1").language(Language.ENGLISH).build())
                .teacher(Teacher.builder().id(1).firstName("1t").lastName("1t").languageList(List.of(Language.ENGLISH)).build())
                .date(LocalDate.now())
                .build();

        Lesson lesson3 = Lesson.builder()
                .id(3)
                .student(Student.builder().id(1).firstName("1").lastName("1").language(Language.ENGLISH).build())
                .teacher(Teacher.builder().id(1).firstName("1t").lastName("1t").languageList(List.of(Language.ENGLISH)).build())
                .date(LocalDate.now())
                .build();

        Lesson lesson4 = Lesson.builder()
                .id(4)
                .student(Student.builder().id(1).firstName("1").lastName("1").language(Language.ENGLISH).build())
                .teacher(Teacher.builder().id(1).firstName("1t").lastName("1t").languageList(List.of(Language.ENGLISH)).build())
                .date(LocalDate.now())
                .build();

        lessonDb.add(lesson1);
        lessonDb.add(lesson2);
        lessonDb.add(lesson3);
        lessonDb.add(lesson4);
    }
}
