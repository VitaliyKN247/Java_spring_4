package homework.Spring_java_4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalTime;

@Controller
public class TimeController {
    @GetMapping("/time")
    public String getHomePage(Model model) {
        model.addAttribute("message", "Добро пожаловать!");
        model.addAttribute("currentTime", LocalTime.now());
        return "time";
    }
}

