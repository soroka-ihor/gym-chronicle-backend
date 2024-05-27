package gym.chronicle.component.exercise.service;

import gym.chronicle.component.exercise.model.Exercise;

public interface ExerciseService {

    Exercise createNew(String name);

    Exercise fetchByName(String name);

}
