package com.example.seccion1;

import com.example.demo.domain.SmartPhone;
import com.example.demo.service.SmartPhoneServiceImpl;
import lombok.extern.java.Log;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
@Log
class BExceptionTest {

    @Test
    void finOneIllegalArgumentExceptionTest(){

        log.info(" Inicio Test finOne Null");
        SmartPhoneServiceImpl smartPhoneService = new SmartPhoneServiceImpl();

        assertThrows(IllegalArgumentException.class, ()->{
            smartPhoneService.findOne(null);
        });



    }


}
