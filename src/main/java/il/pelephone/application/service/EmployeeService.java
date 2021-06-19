package il.pelephone.application.service;

import il.pelephone.application.model.db.Employee;
import il.pelephone.application.model.Meet;

import java.util.List;

/**
 * @author Semion Rutshtein
 */
public interface EmployeeService {
    List<Employee> getAllEmployees ();
    List<Meet> meetingsScheduler();

}
