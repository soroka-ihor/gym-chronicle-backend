package gym.chronicle.component.approach.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SetRepo extends JpaRepository<Set, Long> {

}
