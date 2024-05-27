package gym.chronicle.component.exercise.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ExerciseRepo extends JpaRepository<Exercise, Long> {

    Optional<Exercise> findByName(String name);

}
