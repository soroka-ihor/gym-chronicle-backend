package gym.chronicle.component.workout.service.impl;

import gym.chronicle.component.user.model.User;
import gym.chronicle.component.workout.model.Workout;
import gym.chronicle.component.workout.service.WorkoutService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class WorkoutServiceImpl implements WorkoutService {

    @Override
    public Workout start(String workoutName, LocalDateTime started, User user) {
        return null;
    }

    @Override
    public boolean stop(Workout workout) {
        return false;
    }

    @Override
    public List<Workout> getAllActiveWorkouts() {
        return null;
    }

    @Override
    public List<Workout> getAllWorkouts() {
        return null;
    }

    @Override
    public List<Workout> getActiveWorkouts(LocalDate date) {
        return null;
    }

    @Override
    public List<Workout> getAllWorkout(LocalDate date) {
        return null;
    }
}
