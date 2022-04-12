package com.example.seccion3;

import com.example.demo.domain.SmartPhone;
import com.example.demo.service.SmartPhoneServiceImpl;
import lombok.extern.java.Log;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
@Log
@Disabled("Causa de la deshabilitación.")
class ADisabledTest {

    @Test
    @DisplayName("SmartPhoneService finOnePhone OK.")
    void test01(){

        log.info("enter the test01");
        SmartPhoneServiceImpl smartPhoneService = new SmartPhoneServiceImpl();

        SmartPhone result = smartPhoneService.findOne(1L);
        assertNotNull(result);
        assertEquals(1L, result.getId());

    }

    @Test
    @Disabled("Deshabilitado temporalmente por fallo en los entornos")
    @DisplayName("SmartPhoneService finOnePhone Ilegal Exception")
     void tetst02(){

        log.info("Enter thet test02");
        SmartPhoneServiceImpl smartPhoneService = new SmartPhoneServiceImpl();

        assertThrows(IllegalArgumentException.class, ()->smartPhoneService.findOne(null));


    }
}
