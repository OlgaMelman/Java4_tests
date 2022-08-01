package ru.netology.bonus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

//import static org.junit.jupiter.api.Assertions.*;

public class BonusServiceTest {

    @ParameterizedTest
//    @CsvSource({
//            "30,1000,true",
//            "500,1000000,true",
//            "0,-200,true",
//            "10,1000,false",
//            "500,1000000,false",
//            "0,-200,false"
//    })
    @CsvFileSource(resources = "/data.csv")
    public void shouldCalculateForRegisteredAndUnderLimit(int expected, int amount, boolean registered) {
        BonusService service = new BonusService();

        // подготавливаем данные:
        //int amount = 1000;
        //boolean registered = true;

        //int expected = 30;

        // вызываем целевой метод:
        int actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    //    @org.junit.jupiter.api.Test
//    void shouldCalculateForRegisteredAndOverLimit() {
//        BonusService service = new BonusService();
//
//        // подготавливаем данные:
//        int amount = 1_000_000;
//        boolean registered = true;
//        int expected = 500;
//
//        // вызываем целевой метод:
//        int actual = service.calculate(amount, registered);
//
//        // производим проверку (сравниваем ожидаемый и фактический):
//        assertEquals(expected, actual);
//    }
//
//    @org.junit.jupiter.api.Test
//    void shouldCalculateForRegisteredAndNegativeAmount() {
//        BonusService service = new BonusService();
//
//        // подготавливаем данные:
//        int amount = -200;
//        boolean registered = true;
//        int expected = 0;
//
//        // вызываем целевой метод:
//        int actual = service.calculate(amount, registered);
//
//        // производим проверку (сравниваем ожидаемый и фактический):
//        assertEquals(expected, actual);
//    }
//
//    @org.junit.jupiter.api.Test
//    void shouldCalculateForUnregisteredAndUnderLimit() {
//        BonusService service = new BonusService();
//
//        // подготавливаем данные:
//        int amount = 1000;
//        boolean registered = false;
//        int expected = 10;
//
//        // вызываем целевой метод:
//        int actual = service.calculate(amount, registered);
//
//        // производим проверку (сравниваем ожидаемый и фактический):
//        assertEquals(expected, actual);
//    }
//
//    @org.junit.jupiter.api.Test
//    void shouldCalculateForUnregisteredAndOverLimit() {
//        BonusService service = new BonusService();
//
//        // подготавливаем данные:
//        int amount = 1_000_000;
//        boolean registered = false;
//        int expected = 500;
//
//        // вызываем целевой метод:
//        int actual = service.calculate(amount, registered);
//
//        // производим проверку (сравниваем ожидаемый и фактический):
//        assertEquals(expected, actual);
//    }
//
//    @org.junit.jupiter.api.Test
//    void shouldCalculateForUnregisteredAndNegativeAmount() {
//        BonusService service = new BonusService();
//
//        // подготавливаем данные:
//        int amount = -200;
//        boolean registered = false;
//        int expected = 0;
//        // вызываем целевой метод:
//        int actual = service.calculate(amount, registered);
//
//        // производим проверку (сравниваем ожидаемый и фактический):
//        assertEquals(expected, actual);
//    }
}