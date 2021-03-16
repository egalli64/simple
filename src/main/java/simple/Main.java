package simple;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        System.out.println("Hello " + getLoggerClassName());
        log.info("Hello");
    }
    
    public static String getLoggerClassName() {
        return log.getClass().getName();
    }

    public static void anUnimplementedMethod() {
        throw new UnsupportedOperationException(); 
    }
}
