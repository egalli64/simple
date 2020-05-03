package simple;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    void getLoggerClassName() {
        String actual = Main.getLoggerClassName();
        assertThat(actual, is("ch.qos.logback.classic.Logger"));
    }
}
