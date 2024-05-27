package gym.chronicle.component.workout.service;

import gym.chronicle.component.user.model.User;
import gym.chronicle.component.workout.model.Workout;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface WorkoutService {

    Workout start(String workoutName, LocalDateTime started, User user);

    boolean stop(Workout workout);

    List<Workout> getAllActiveWorkouts();

    List<Workout> getAllWorkouts();

    List<Workout> getActiveWorkouts(LocalDate date);

    List<Workout> getAllWorkout(LocalDate date);


}
