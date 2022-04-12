package com.example.seccion2;

import com.example.demo.service.SmartPhoneServiceImpl;
import lombok.extern.java.Log;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@Log
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CClassTest {

    //Inicializamos antes de los test los datos.
    @BeforeAll
    static void setUp() {
        log.info("Incio test con BeforeAll");
        SmartPhoneServiceImpl smartPhoneService;
        smartPhoneService = new SmartPhoneServiceImpl();
    }

    //Ejecutamos a la finalización de los test.
    @AfterAll
    static void tearDown() {
        log.info("Fin del test con AfterAll. Limpiamos entorno.");
    }

    @Test
    @Order(2)
    void aTest() {
        assertNotNull(1L);
        log.info("aTest");
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
