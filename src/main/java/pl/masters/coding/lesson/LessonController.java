package pl.masters.coding.lesson;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/lesson")
public class LessonController {

    private LessonService lessonService;

    @GetMapping
    public String getLessonList(Model model) {
        model.addAttribute("Lessons", lessonService.findAll());
        return "lesson/list";
    }

    @GetMapping("/create")
    public String showCreateForm(){
        return "student/form";
    }

    @PostMapping("/create")
    public String createStudent(){

        return getLessonList();
    }
}
