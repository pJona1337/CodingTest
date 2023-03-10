package pl.masters.coding.teacher.model;

import lombok.*;
import pl.masters.coding.common.Language;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Teacher {

    private int id;
    private String firstName;
    private String lastName;
    private List<Language> languageList;
}
