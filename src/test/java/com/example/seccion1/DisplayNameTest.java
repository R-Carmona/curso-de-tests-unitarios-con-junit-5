package com.example.seccion1;
import com.example.demo.domain.SmartPhone;
import com.example.demo.service.SmartPhoneServiceImpl;
import lombok.extern.java.Log;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
@Log
@DisplayName("Test del Servicio Phone.")
public class DisplayNameTest {

    @Test
    @DisplayName("SmartPhoneService finOnePhone OK.")
    void test01(){

        SmartPhoneServiceImpl smartPhoneService = new SmartPhoneServiceImpl();

        SmartPhone result = smartPhoneService.findOne(1L);
        assertNotNull(result);
        assertEquals(1L, result.getId());

    }

    @Test
    @DisplayName("SmartPhoneService finOnePhone Ilegal Exception")
    void tetst02(){

        SmartPhoneServiceImpl smartPhoneService = new SmartPhoneServiceImpl();

        assertThrows(IllegalArgumentException.class, ()->smartPhoneService.findOne(null));


    }
}
