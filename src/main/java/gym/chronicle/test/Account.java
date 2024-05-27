package gym.chronicle.test;

import javax.persistence.*;

@Entity
@Table(name = "account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String iban;
    String owner;
    double balance;
}
