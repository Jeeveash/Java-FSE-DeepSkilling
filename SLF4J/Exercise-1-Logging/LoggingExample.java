import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {

    private static final Logger logger = LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {

        logger.info("Application started");
        logger.warn("This is a warning message");
        logger.error("This is an error message");

        int a = 10;
        int b = 20;

        logger.info("Sum: {}", a + b);

        logger.info("Application finished");
    }
}
