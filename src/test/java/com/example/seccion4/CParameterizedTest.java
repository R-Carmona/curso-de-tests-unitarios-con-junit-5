package com.example.seccion4;

import lombok.extern.java.Log;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

@Log
class CParameterizedTest {

    @ParameterizedTest
    @CsvSource({
            "1, Empleado 1, 30000",
            "2, Empleado 2, 40000",
            "3, Empleado 3, 50000",
            "4, Empleado 4, 60000",})
    @DisplayName("ParameterizedTest")
    void test1(Integer id, String name, Integer salary) {
        log.info("Id:" + id.toString() + " - " + "Name:" + name + " - " + "Salary:" + salary.toString());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/users-data.csv", numLinesToSkip = 1)
    @DisplayName("ParameterizedTest File Source")
    void test2(Integer id, String name, Integer salary) {
        log.info("Id:" + id.toString() + " - " + "Name:" + name + " - " + "Salary:" + salary.toString());
    }

    //Se repetirán el número de veces que tengamos en cada enum.
    enum Role{
        ADMIN,AUTHOR, ANONYMOUS
    }

    @ParameterizedTest
    @EnumSource(Role.class)
    @DisplayName("ParameterizedTest Enum Source")
    void test3(Role role) {
        log.info("Role:" + role);
    }

    static Stream<String> namesProvider(){
        return Stream.of("Name1", "Name2","Name3");
    };

    @ParameterizedTest
    @MethodSource("namesProvider")
    @DisplayName("ParameterizedTest Method Source")
    void test(String name) {
        log.info("Name: " + name);
    }




}
