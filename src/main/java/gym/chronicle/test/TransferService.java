package gym.chronicle.test;

public interface TransferService {
    boolean transfer(String fromIban, String toIban, long amout);
}
