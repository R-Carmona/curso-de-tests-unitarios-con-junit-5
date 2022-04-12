package com.example.seccion2;
import static org.junit.jupiter.api.Assertions.*;
import lombok.extern.java.Log;
import org.junit.jupiter.api.*;

@Log
@DisplayName("Ciclo de vida de los Test.")
class ALyfeCycleTest {


    @BeforeEach
    void setUp() {
    log.info("BeforeEach Method");
    }

    @AfterEach
     void tearDown() {
        log.info("AfterEach Method");
    }

    @BeforeAll
    static void beforeAll() {
        log.info("BeforeAll Method");
    }

    @AfterAll
    static void afterAll() {
        log.info("AfterAll Method");
    }

    @Test
    @Order(1)
    void bTest() {
        assertNotNull(1L);
        log.info("bTest");
    }

    @Test
    @Order(0)
    void cTest() {
        assertNotNull(1L);
        log.info("cTest");
    }


}