package gym.chronicle.component.approach.model;

import gym.chronicle.component.entity.BaseEntity;
import gym.chronicle.component.exercise.model.Exercise;
import gym.chronicle.component.workout.model.Workout;
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
@Table(name = Set.TABLE_NAME)
public class Set extends BaseEntity {

    public static final String TABLE_NAME = "sets";

    @Column(name = "repeats", nullable = false)
    Integer repeats;

    @Column(name = "measurement_unit", nullable = false)
    @Enumerated(EnumType.STRING)
    Unit unit;

    @Column(name = "amount", nullable = true)
    Integer amount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "exercise_id")
    Exercise exercise;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "workout_id")
    Workout workout;

    public enum Unit {
        HOURS, KG
    }

}
