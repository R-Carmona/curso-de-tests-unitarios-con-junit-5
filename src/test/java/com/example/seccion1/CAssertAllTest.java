package com.example.seccion1;

import com.example.demo.service.SmartPhoneServiceImpl;
import lombok.extern.java.Log;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


@Log
public class CAssertAllTest {

    @Test
    void assertAllTest() {

        SmartPhoneServiceImpl smartPhoneService = new SmartPhoneServiceImpl();

        // Class Under Test
        // System Under Test (SUT)
        Integer count = smartPhoneService.count();

        assertAll("Probando AssertAll.",
                () -> assertNotNull(count),
                () -> assertEquals(3, count),
                () -> assertEquals(3, count + 1, "Mensaje del Assert de Error, número de elementos esperado es 3."),
                ()-> assertTrue(0 < count));
    }
}
