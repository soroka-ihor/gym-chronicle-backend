package gym.chronicle.test;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class CompanyService {
    private final CompanyRepository repository;

    @Transactional(rollbackFor = Exception.class)
    public void increaseDecrease(Long id) {
        for (Company c : repository.findAll()) {
            c.employees_count = 2;
            repository.save(c);
        }
    }
}
