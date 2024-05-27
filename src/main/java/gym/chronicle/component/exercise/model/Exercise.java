package gym.chronicle.component.exercise.model;

import gym.chronicle.component.approach.model.Set;
import gym.chronicle.component.entity.BaseEntity;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.List;
import static lombok.AccessLevel.PRIVATE;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = PRIVATE)
@Entity
@Table(name = Exercise.TABLE)
public class Exercise extends BaseEntity {

    public static final String TABLE = "exercises";

    @Column(name = "name", unique = true)
    String name;

    @OneToMany(mappedBy = "exercise", fetch = FetchType.LAZY)
    List<Set> sets;

}
