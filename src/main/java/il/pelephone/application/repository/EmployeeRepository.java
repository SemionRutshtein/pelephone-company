package il.pelephone.application.repository;

import il.pelephone.application.model.db.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Semion Rutshtein
 */

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
