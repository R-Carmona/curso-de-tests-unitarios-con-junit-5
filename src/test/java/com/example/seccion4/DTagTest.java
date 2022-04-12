package com.example.seccion4;

import lombok.extern.java.Log;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Log
//@Tag("Persistencia")
class DTagTest {

    @Tag("dataBase")
    @Test
    void test1() {
        log.info("Test1 DTagTest dataBase");
    }

    @Tag("dataBase")
    @Test
    void test2() {
        log.info("Test2 DTagTest dataBase");
    }

    @Tag("controller")
    @Test
    void test3() {
        log.info("Test3 DTagTest controller");
    }

    @Tag("controller")
    @Test
    void test4() {
        log.info("Test4 DTagTest controller");
    }
}
