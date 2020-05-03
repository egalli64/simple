package simple;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger LOG = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        System.out.println("Hello " + getLoggerClassName());
        LOG.info("Hello");
    }
    
    public static String getLoggerClassName() {
        return LOG.getClass().getName();
    }
}
