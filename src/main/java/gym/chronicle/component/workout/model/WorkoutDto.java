package gym.chronicle.component.workout.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class WorkoutDto {
    Long id;
    String name;
    String startedAt;
    String finishedAt;
}
