package com.example.seccion3;

import lombok.extern.java.Log;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

@Log
class BConditionlTest {

    @Test
    @EnabledForJreRange(min = JRE.JAVA_8, max=JRE.JAVA_8)
    void tets1() {
     log.info("java 8");
    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_17)
    void tets2() {
        log.info("java 17");
    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_8, max = JRE.JAVA_17)
    void tets3() {
        log.info("java 8 al 17");
    }

    @Test
    @EnabledOnOs(OS.LINUX)
    void test4() {
        log.info("Os Linux");
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void test5() {
        log.info("Os Windows.");
    }

    @Test
    void test6() {
        log.info("java 8 al 17");
    }

    @Test
    void printEnv() {
        log.info("PrintEnv");
        System.getenv().forEach((key,value) -> log.info(key + " - " + value));
    }

    @Test
    void test8() {
        log.info("test 8.");
    }
}
