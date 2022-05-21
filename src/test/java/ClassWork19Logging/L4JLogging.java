package ClassWork19Logging;

import org.apache.log4j.Logger;

public class L4JLogging {

    private static final Logger LOGGER = Logger.getLogger(L4JLogging.class.getName());

    public static void main(String[] args) {

        LOGGER.fatal("Message with level FATAL");
        LOGGER.error("Message with level ERROR");
        LOGGER.warn("Message with level WARN");
        LOGGER.info("Message with level INFO");
        LOGGER.debug("Message with level DEBUG");
        LOGGER.trace("Message with level TRACE");
    }
}
