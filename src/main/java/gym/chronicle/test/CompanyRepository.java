package gym.chronicle.test;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface CompanyRepository extends JpaRepository<Company, Long> {

}
