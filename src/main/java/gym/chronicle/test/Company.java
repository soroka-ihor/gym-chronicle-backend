package gym.chronicle.test;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "company")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String name;

    Integer employees_count;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "company")
    List<Employee> employees;
}
