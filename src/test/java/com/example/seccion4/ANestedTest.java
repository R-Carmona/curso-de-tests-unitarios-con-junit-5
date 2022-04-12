package com.example.seccion4;

import lombok.extern.java.Log;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
@DisplayName("Test para servio de SmartPhone")
@Log
class ANestedTest {

   @Test
   @DisplayName("Test1")
    void test1(){
       log.info("Dentro de test1.");
       assertTrue(true);
   }

   @Nested
   @DisplayName("Operaciones recuperar datos.")
   class Grupo1{

       @Test
       @DisplayName("Test2")
       void test2(){
           log.info("Dentro de test2.");
           assertTrue(true);
       }

       @Test
       @DisplayName("Test3")
       void test3(){
           log.info("Dentro de test3.");
           assertTrue(true);
       }

   }

    @Nested
    @DisplayName("Operaciones insertar nuevos datos.")
    class Grupo2{

        @Test
        @DisplayName("Test4")
        void test4(){
            log.info("Dentro de test4.");
            assertTrue(true);
        }

    }

}
