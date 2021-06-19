package il.pelephone.application.model;

import il.pelephone.application.model.db.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Semion Rutshtein
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Audition {
    private Employee employeeFirst;
    private Employee employeeSecond;

    @Override
    public String toString() {
        return
                "{" + employeeFirst.getId() + " : "+ employeeSecond.getId() + "}";
    }
}
