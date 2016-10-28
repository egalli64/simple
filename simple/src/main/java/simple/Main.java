/**
 * Simple Java Maven project with dependencies
 * More info http://bitingcode.blogspot.com/2016/10/adding-logback-to-maven-project.html
 */
package simple;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        log.info("Hello");
    }
    
    public static String getLoggerClassName() {
        return log.getClass().getName();
    }
}
