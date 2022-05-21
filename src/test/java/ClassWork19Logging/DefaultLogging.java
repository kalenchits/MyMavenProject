package ClassWork19Logging;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class DefaultLogging {
    private static final Logger LOGGER = Logger.getLogger(DefaultLogging.class.getName());

    public static void main(String[] args) throws IOException {
        FileInputStream configFile = new FileInputStream("src/test/resources/log.config");
        LogManager.getLogManager().readConfiguration(configFile);
        LOGGER.setLevel(Level.ALL);

        LOGGER.log(Level.SEVERE,"Message with level SEVERE");
        LOGGER.log(Level.WARNING,"Message with level WARNING");
        LOGGER.log(Level.INFO,"Message with level INFO");
        LOGGER.log(Level.CONFIG,"Message with level CONFIG");
        LOGGER.log(Level.FINE,"Message with level FINE");
        LOGGER.log(Level.FINER,"Message with level FINER");
        LOGGER.log(Level.FINEST,"Message with level FINEST");
        LOGGER.log(Level.ALL,"Message with level ALL");


    }
}
