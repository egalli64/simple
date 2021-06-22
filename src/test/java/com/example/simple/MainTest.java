package com.example.simple;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    void getLoggerClassName() {
        String actual = Main.getLoggerClassName();
        assertThat(actual, is("org.apache.logging.log4j.core.Logger"));
    }

    @Test
    void anUnimplementedMethod() {
        var exc = assertThrows(UnsupportedOperationException.class, Main::anUnimplementedMethod);

        String expected = "Not yet implemented";
        assertThat(exc.getMessage(), is(expected));
    }
}
