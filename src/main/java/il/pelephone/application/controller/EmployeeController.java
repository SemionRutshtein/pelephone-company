package il.pelephone.application.controller;

import il.pelephone.application.model.db.Employee;
import il.pelephone.application.service.impl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * @author Semion Rutshtein
 */
@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    EmployeeServiceImpl employeeService;

    @GetMapping("/employers")
    public List<Employee> getAllEmployee() {
        return employeeService.getAllEmployees();
    }

}
