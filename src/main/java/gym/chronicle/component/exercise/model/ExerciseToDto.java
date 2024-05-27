package gym.chronicle.component.exercise.model;

import gym.chronicle.component.approach.model.SetDto;

import java.util.stream.Collectors;

public interface ExerciseToDto {

    static ExerciseDto map(Exercise exercise) {
        return new ExerciseDto(
                exercise.getName(),
                exercise.getSets().stream()
                        .map(set -> new SetDto(set.getRepeats(), set.getUnit().toString(), set.getAmount()))
                        .collect(Collectors.toList())
        );
    }
}
