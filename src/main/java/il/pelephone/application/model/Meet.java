package il.pelephone.application.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Semion Rutshtein
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Meet {

    private int weekNumber;
    private List<Audition> pair;
    @Override
    public String toString() {
        return "Meets{" +
                "weekNumber=" + weekNumber + pair;
    }
}
