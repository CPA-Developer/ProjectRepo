package handymanagement.jstudents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ManagementController {

    @GetMapping("/")
    public String getStarted() {
        return "index";
    }

    @GetMapping("/appointment")
    public String appointment() {
        return "appointment";
    }

    @GetMapping("/resume")
    public String resume() {
        return "resume";
    }

    @GetMapping("/worker")
    public String worker() {
        return "worker";
    }

}
