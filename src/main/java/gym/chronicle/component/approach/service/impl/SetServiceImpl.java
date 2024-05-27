package gym.chronicle.component.approach.service.impl;

import gym.chronicle.component.approach.model.Set;
import gym.chronicle.component.approach.model.SetRepo;
import gym.chronicle.component.approach.service.SetService;
import gym.chronicle.component.exercise.model.Exercise;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class SetServiceImpl implements SetService {

    SetRepo repo;

    @Override
    public Set create(Integer repeats, Set.Unit unit, Integer amount, Exercise exercise) {
        var approach = new Set();
        approach.setCreated(LocalDateTime.now());
        approach.setChanged(LocalDateTime.now());
        approach.setValidUntil(LocalDateTime.now().plusYears(100));
        approach.setRepeats(repeats);
        approach.setUnit(unit);
        approach.setAmount(amount);
        approach.setExercise(exercise);
        return repo.save(approach);
    }
}
