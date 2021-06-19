package il.pelephone.application.model.db;

import lombok.*;

import javax.persistence.*;

/**
 * @author Semion Rutshtein
 */
@Entity
@Table(name="employees")
@Data
@AllArgsConstructor
@ToString
public class Employee {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "NAME")
    private String name;

    public Employee() {
    }

}
