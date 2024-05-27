package gym.chronicle.aop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PrintResultWasCalledAspect {
    private final static Logger logger = LogManager.getLogger(PrintResultWasCalledAspect.class);

    public void printResultWasCalled() {
        logger.info("print result was called");
    }
}
