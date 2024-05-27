package gym.chronicle.component.exercise.service.impl;

import gym.chronicle.component.exercise.model.Exercise;
import gym.chronicle.component.exercise.model.ExerciseRepo;
import gym.chronicle.component.exercise.service.ExerciseService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class ExerciseServiceImpl implements ExerciseService {

    ExerciseRepo repo;

    @Override
    public Exercise createNew(String name) {
        Exercise exercise = new Exercise();
        exercise.setCreated(LocalDateTime.now());
        exercise.setName(name);
        exercise.setChanged(LocalDateTime.now());
        exercise.setValidUntil(LocalDateTime.now().plusYears(100));
        return repo.save(exercise);
    }

    @Override
    @Transactional
    public Exercise fetchByName(String name) {
        return repo.findByName(name).get();
    }
}
