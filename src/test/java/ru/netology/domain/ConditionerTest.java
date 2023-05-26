package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConditionerTest {

    @Test
    public void test() {
        Conditioner cond = new Conditioner();


        cond.setCurrentTemperature(28);

        cond.increase50p();

        int expected = 28;
        int actual = cond.getCurrentTemperature();

        assertEquals (expected, actual);
    }
}
