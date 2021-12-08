package handymanagement.jstudents.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import handymanagement.jstudents.entities.Worker;
import handymanagement.jstudents.services.workerService;

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
    public String getWorker(Model model) {

        List<Worker> workers = workerService.findWorkers();
        model.addAttribute("workers", workers);
        return "worker";
    }

}
