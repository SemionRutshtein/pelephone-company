package il.pelephone.application.service.impl;
import il.pelephone.application.model.db.Employee;
import il.pelephone.application.model.Audition;
import il.pelephone.application.model.Meet;
import il.pelephone.application.repository.EmployeeRepository;
import il.pelephone.application.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @author Semion Rutshtein
 */

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public List<Meet> meetingsScheduler() {
        List<Employee> allEmployees = getAllEmployees();
        List<Meet> meets = new ArrayList<>();
        int weekNumber = 1;

        while (true) {
            List<Audition> pairs = new ArrayList<>();
            Meet meet = new Meet(weekNumber, pairs);
            Set<Employee> busyEmploeys = new HashSet<>();

            for (Employee initialEmp : allEmployees) {
                if (busyEmploeys.stream().anyMatch((e) -> e.getId().equals(initialEmp.getId()))) {
                    continue;
                }
                for (Employee secondaryEmp : allEmployees) {
                    if  ((busyEmploeys.stream().anyMatch((e -> e.getId().equals(initialEmp.getId())))) ||
                            (busyEmploeys.stream().anyMatch((e -> e.getId().equals(secondaryEmp.getId()))))  ||
                            (initialEmp.getId().equals(secondaryEmp.getId()))) {
                        continue;
                    }

                    boolean found = false;
                    for (Meet m : meets) {
                        for (Audition a : m.getPair()) {
                            if (a.getEmployeeFirst().getId().equals(initialEmp.getId()) && a.getEmployeeSecond().getId().equals(secondaryEmp.getId())) {
                                found = true;
                                break;
                            }
                        }
                        if (found) break;
                    }

                    if (found) continue;

                    Audition newAudition = new Audition(initialEmp, secondaryEmp);
                    pairs.add(newAudition);

                    busyEmploeys.add(initialEmp);
                    busyEmploeys.add(secondaryEmp);
                }
                busyEmploeys.add(initialEmp);
            }

            if (meet.getPair().size() == 0) {
                break;
            }
            meets.add(meet);
            weekNumber += 1;
        }

        return meets;
    }


}
