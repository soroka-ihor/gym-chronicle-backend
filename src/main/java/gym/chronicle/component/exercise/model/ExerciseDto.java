package gym.chronicle.component.exercise.model;

import gym.chronicle.component.approach.model.SetDto;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level =  AccessLevel.PRIVATE)
public class ExerciseDto {
    String name;
    List<SetDto> sets;
}
