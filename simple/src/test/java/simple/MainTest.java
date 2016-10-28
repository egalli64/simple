package simple;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {
    @Test
    public void testGetLoggerClassName() {
        assertEquals("ch.qos.logback.classic.Logger", Main.getLoggerClassName());
    }
}
