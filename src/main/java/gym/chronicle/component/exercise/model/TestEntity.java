package gym.chronicle.component.exercise.model;

import gym.chronicle.component.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import javax.persistence.*;
import static lombok.AccessLevel.PRIVATE;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = PRIVATE)
@Entity
@Table(name = TestEntity.TABLE)
public class TestEntity extends BaseEntity {

    public static final String TABLE = "test";

    @Column(name = "name", unique = true)
    String name;

}
