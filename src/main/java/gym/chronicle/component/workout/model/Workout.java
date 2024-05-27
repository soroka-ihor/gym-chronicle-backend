package gym.chronicle.component.workout.model;

import gym.chronicle.component.entity.BaseEntity;
import gym.chronicle.component.exercise.model.Exercise;
import gym.chronicle.component.user.model.User;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = Workout.TABLE_NAME)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Workout extends BaseEntity  {

    public static final String TABLE_NAME = "workouts";

    @Column(name = "name")
    String name;

    @Column(name = "started_at")
    LocalDateTime started;

    @Column(name = "finished_at")
    LocalDateTime finished;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    User user;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "workout-to-exercise",
            joinColumns = {@JoinColumn(name = "workout_id")},
            inverseJoinColumns = {@JoinColumn(name = "exercise_id")}
    )
    List<Exercise> exercises;
}
