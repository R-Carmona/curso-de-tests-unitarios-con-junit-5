package com.example.seccion4;

import lombok.extern.java.Log;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

@Log
class BRepeatedTest {

    @Test
    void test1() {
        log.info("Prueba concepto test1");
    }

    @RepeatedTest(value = 3,name = "{}")
    void test2() {
        log.info("RepeatedTest Prueba concepto test2");
    }

    @RepeatedTest(value = 3,name = RepeatedTest.SHORT_DISPLAY_NAME)
    void test3() {
        log.info("RepeatedTest Prueba concepto test3 - RepeatedTest.SHORT_DISPLAY_NAME");
    }

    @RepeatedTest(value = 3,name = RepeatedTest.LONG_DISPLAY_NAME)
    void test4() {
        log.info("RepeatedTest Prueba concepto test4 - LONG_DISPLAY_NAME");
    }

    @DisplayName("Caso de Test 5")
    @RepeatedTest(value = 3,name = RepeatedTest.LONG_DISPLAY_NAME)
    void test5() {
        log.info("RepeatedTest Prueba concepto test5 - LONG_DISPLAY_NAME");
    }

    @RepeatedTest(value = 3,name = "{displayName} - {currentRepetition} / {totalRepetitions}")
    void test6() {
        log.info("RepeatedTest Prueba concepto test6 - LONG_DISPLAY_NAME");
    }
}
