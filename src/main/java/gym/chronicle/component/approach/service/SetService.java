package gym.chronicle.component.approach.service;

import gym.chronicle.component.approach.model.Set;
import gym.chronicle.component.exercise.model.Exercise;

public interface SetService {

    Set create(Integer repeats,
                Set.Unit unit,
                Integer amount,
                Exercise exercise
    );

}
