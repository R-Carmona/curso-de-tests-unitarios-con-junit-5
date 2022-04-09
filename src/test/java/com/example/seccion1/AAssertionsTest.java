package com.example.seccion1;

import com.example.demo.service.SmartPhoneServiceImpl;

import lombok.extern.java.Log;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@Log
class AAssertionsTest {

    @Test
    void count() {
        SmartPhoneServiceImpl smartPhoneService = new SmartPhoneServiceImpl();

        Integer count = smartPhoneService.count();
        //Assertions
        assertNotNull(count);
        assertTrue(count >0);
        assertEquals(3,count);
        assertEquals(3,count,"Mensaje de Error, número de elementos esperado es 3.");
        log.info(String.format("Test con JUnit 5 Jupiter. El número de elementos es: %o",count));
    }





}
