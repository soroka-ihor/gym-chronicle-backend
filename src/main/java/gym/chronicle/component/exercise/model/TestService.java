package gym.chronicle.component.exercise.model;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class TestService {

    private final TestRepository repo;
    private final Supplier<TestEntity> generateEntity;

    public TestService(TestRepository repo) {
        this.repo = repo;
        generateEntity = () -> {
            TestEntity entity = new TestEntity();
            entity.setName(UUID.randomUUID().toString());
            entity.setCreated(LocalDateTime.now());
            entity.setChanged(LocalDateTime.now());
            entity.setValidUntil(LocalDateTime.now());
            return entity;
        };
    }

    @Transactional
    public void generateAndSaveTestEntities(int count) {
        List<TestEntity> entities = Stream.generate(generateEntity)
                .limit(count)
                .toList();
        entities.forEach(
                e -> repo.save(e)
        );
        generateAnotherEntities(count);
        System.out.println("some funny stuff");
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void generateAnotherEntities(int count) {
        List<TestEntity> entities = Stream.generate(generateEntity)
                .limit(count)
                .toList();
        entities.forEach(
                e -> repo.save(e)
        );
    }

}
