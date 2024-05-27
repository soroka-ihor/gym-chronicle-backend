package gym.chronicle.component.workout;

import gym.chronicle.component.workout.model.Workout;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/workout")
@AllArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class WorkoutController {

    @GetMapping
    public List<Workout> get() {
        // TODO: Implement fetching logic here
        return null;
    }
}
