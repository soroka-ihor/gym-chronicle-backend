package gym.chronicle.component.exercise.controller;

import gym.chronicle.component.exercise.model.AddExerciseRequest;
import gym.chronicle.component.exercise.model.Exercise;
import gym.chronicle.component.exercise.model.ExerciseDto;
import gym.chronicle.component.exercise.model.ExerciseToDto;
import gym.chronicle.component.exercise.service.ExerciseService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/exercise")
@AllArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class ExerciseController {

    ExerciseService service;

    @PostMapping("/add")
    public ResponseEntity<ExerciseDto> add(
            @RequestBody(required = true) AddExerciseRequest request
    ) {
        return ResponseEntity.ok(
                ExerciseToDto.map(service.createNew(request.getName()))
        );
    }

    @GetMapping
    public ResponseEntity<Exercise> get(@RequestParam String name) {
        ExerciseType type = ExerciseType.CARDIO;
        Something something = Something.SOME;
        
        return ResponseEntity.ok(service.fetchByName(name));
    }

    public enum ExerciseType {
        CARDIO
    }

    public enum Something {
        SOME
    }

}
