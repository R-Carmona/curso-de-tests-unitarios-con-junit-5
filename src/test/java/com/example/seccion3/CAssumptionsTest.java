package com.example.seccion3;

import lombok.extern.java.Log;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assumptions.*;
@Log
class CAssumptionsTest {

    @BeforeAll
    static void beforeAll() {
        System.getenv().forEach((key,value) -> log.info(key + " - " + value));
        log.info("-------------------------------------------------------------------------------------");
        System.getProperties().forEach((key, value)->log.info(key + " - " + value));
    }

    @Test
    @Disabled("Temporal disabled.")
    void name() {
        log.info("test assumeTrue");
        String languageSystem = System.getProperty("user.language");
        assumeTrue(languageSystem.contains("es"));
        assumeTrue(System.getProperties().getProperty("user.language").equals("es"));
    }

    @Test
    void name2() {
        log.info("test assumeTrue Two");
        String languageSystem = System.getProperty("user.language");
        assumeTrue(languageSystem.contains("en"));
    }

    @Test
    void name3() {
        //Deberemos de ponerle una condición y luego una lambda con el código a ejecutar.
        assumingThat(System.getProperties().getProperty("user.language").equals("es"), ()->{
            log.info("Dentro de la lambda.");
        });
    }
}
