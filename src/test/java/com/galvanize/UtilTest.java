package com.galvanize;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilTest {

    @Test
    void generateRandomAlphaString() {
        String randomAlpha = Util.generateRandomAlphaString(10);
        System.out.println(randomAlpha);
    }

    @Test
    void generateRandomAlphaNumericString() {
        String randomAlphaNum = Util.generateRandomAlphaNumericString(10);
        System.out.println(randomAlphaNum);
    }
}