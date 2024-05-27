package gym.chronicle.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.concurrent.CountDownLatch;

@Slf4j
@Service
public class TransferServiceLogic implements TransferService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public boolean transfer(String fromIban, String toIban, long cents) {

        boolean status = true;
        long fromBalance = accountRepository.getBalance(fromIban);

        if(fromBalance >= cents) {
            status &= accountRepository.addBalance(
                    fromIban, (-1) * cents
            ) > 0;

            status &= accountRepository.addBalance(
                    toIban, cents
            ) > 0;
        }

        return status;
    }

    @PostConstruct
    public void testParallelExecution() throws InterruptedException {

        int threadCount = 1;
        CountDownLatch startLatch = new CountDownLatch(1);
        CountDownLatch endLatch = new CountDownLatch(threadCount);

        for (int i = 0; i < threadCount; i++) {
            new Thread(() -> {
                try {
                    startLatch.await();
                    transfer("Alice-123", "Bob-456", 5L);
                } catch (Exception e) {
                    log.error("Transfer failed", e);
                } finally {
                    endLatch.countDown();
                }
            }).start();
        }
        startLatch.countDown();
        endLatch.await();

        log.info(
                "Alice's balance {}",
                accountRepository.getBalance("Alice-123")
        );
        log.info(
                "Bob's balance {}",
                accountRepository.getBalance("Bob-456")
        );
    }
}
