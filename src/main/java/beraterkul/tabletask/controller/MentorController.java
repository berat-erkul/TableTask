package beraterkul.tabletask.controller;

import beraterkul.tabletask.enums.Gender;
import beraterkul.tabletask.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class MentorController {

    @GetMapping("/list")
    public String getMentors(Model model) {
        List<Mentor> listOfMentors = Arrays.asList(
                new Mentor("Mike", "Smith", 25, Gender.MALE),
                new Mentor("Tom", "Hanks", 65, Gender.MALE),
                new Mentor("Ammy", "Bryan", 25, Gender.FEMALE)
        );

        model.addAttribute("listOfMentors", listOfMentors);
        return "show-list";
    }
}