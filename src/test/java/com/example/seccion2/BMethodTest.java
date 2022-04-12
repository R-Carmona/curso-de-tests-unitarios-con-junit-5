package com.example.seccion2;
import com.example.demo.domain.SmartPhone;
import com.example.demo.service.SmartPhoneServiceImpl;
import lombok.extern.java.Log;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@Log
class BMethodTest {

    SmartPhoneServiceImpl smartPhoneService;

    //Inicializamos antes de los test los datos.
    @BeforeEach
    void setUp() {
        log.info("Incio test con BeforeEach");
        smartPhoneService = new SmartPhoneServiceImpl();
    }

    //Ejecutamos a la finalización de los test.
    @AfterEach
    void tearDown() {
        log.info("Fin del test con tearDown. Limpiamos entorno.");
    }

    @Test
    void test01() {
        assertNotNull(true);
        log.info("test01");
    }

    @Test
    void test02() {
        assertNotNull(true);
        log.info("test01");
    }

    @Test
    void test03() {
        assertNotNull(true);
        log.info("test01");
    }

}
