package gym.chronicle.component.user.model;

import gym.chronicle.component.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import static lombok.AccessLevel.PRIVATE;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = PRIVATE)
@Entity
@Table(name = User.TABLE_NAME)
public class User extends BaseEntity implements Serializable {

    public static final String TABLE_NAME = "users";

    @Column(name = "username")
    String username;

    @Column(name = "password")
    String password;

    @Column(name = "client")
    String client;
}
