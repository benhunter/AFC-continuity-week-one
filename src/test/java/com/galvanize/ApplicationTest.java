package com.galvanize;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ApplicationTest {

    @Test
    public void aTest() {
        assertEquals(true, true, "Has student unit tests");
    }

    @Test
    public void anotherTest() {
        assertEquals("true", true);
    }
}
