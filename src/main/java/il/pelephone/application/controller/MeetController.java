package il.pelephone.application.controller;

import il.pelephone.application.model.Meet;
import il.pelephone.application.service.impl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Semion Rutshtein
 */
@RestController
@RequestMapping("/api")
public class MeetController {

    @Autowired
    EmployeeServiceImpl employeeService;

    @GetMapping("/meets")
    public List<Meet> allMeets() {
        return employeeService.meetingsScheduler();
    }
}
