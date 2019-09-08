package Config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerBase {

    private static final Logger LOGGER = LogManager.getLogger(LoggerBase.class.getName());

    protected static void info(Object obj) {
        LOGGER.info(obj);
    }

    protected static void debug(Object obj) {
        LOGGER.debug(obj);
    }

    protected static void error(Object obj) {
        LOGGER.error(obj);
    }

}
