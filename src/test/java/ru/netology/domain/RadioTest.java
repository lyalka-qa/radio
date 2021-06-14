package ru.netology.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
    @Test
    public void shouldCreate() {
        Radio radio = new Radio();
        //radio.maxNumberOfRadiostation() = 9;
        //radio.minNumberOfRadiostation() = 0;
        //radio.on = true;

        radio.setMaxNumberOfRadiostation(9);
        radio.setMinNumberOfRadiostation(0);
        radio.setCurrentNumberOfRadiostation(5);

        //radio.setCurrentNumberOfRadiostation(11);

        int expected = 5;
        int actual = radio.getCurrentNumberOfRadiostation();
        assertEquals(expected, actual);
    }

    @Test
    public void nextRadiostation() {
        Radio radio = new Radio();
        radio.setMaxNumberOfRadiostation(9);
        radio.setMinNumberOfRadiostation(0);
        //radio.setCurrentNumberOfRadiostation(0);

        radio.setCurrentNumberOfRadiostation(10);
        radio.nextRadiostation(0);

        int expected = 0;
        int actual = radio.getCurrentNumberOfRadiostation();
        assertEquals(expected, actual);

    }

    @Test
    public void nextRadiostation1() {
        Radio radio = new Radio();
        radio.setMaxNumberOfRadiostation(9);
        radio.setMinNumberOfRadiostation(0);
        //radio.setCurrentNumberOfRadiostation(0);

        radio.setCurrentNumberOfRadiostation(8);
        radio.nextRadiostation(7);

        int expected = 8;
        int actual = radio.getCurrentNumberOfRadiostation();
        assertEquals(expected, actual);

    }

    @Test
    public void prevRadiostation() {
        Radio radio = new Radio();
        radio.setMaxNumberOfRadiostation(9);
        radio.setMinNumberOfRadiostation(0);
        //radio.setCurrentNumberOfRadiostation(0);

        radio.setCurrentNumberOfRadiostation(-1);
        radio.prevRadiostation(9);

        int expected = 9;
        int actual = radio.getCurrentNumberOfRadiostation();
        assertEquals(expected, actual);
    }

    @Test
    public void prevRadiostation1() {
        Radio radio = new Radio();
        radio.setMaxNumberOfRadiostation(9);
        radio.setMinNumberOfRadiostation(0);
        radio.setCurrentNumberOfRadiostation(0);

        radio.setCurrentNumberOfRadiostation(2);
        radio.prevRadiostation(3);
        int expected = 2;
        int actual = radio.getCurrentNumberOfRadiostation();
        assertEquals(expected, actual);
    }

    @Test
    public void getMaxRadiostation() {
        Radio radio = new Radio();
        radio.setMaxNumberOfRadiostation(9);
        radio.setMinNumberOfRadiostation(0);
        radio.setCurrentNumberOfRadiostation(4);

        radio.getMaxNumberOfRadiostation();
        int expected = 9;
        int actual = radio.getMaxNumberOfRadiostation();
        assertEquals(expected, actual);
    }

    @Test
    public void getMinRadiostation() {
        Radio radio = new Radio();
        radio.setMaxNumberOfRadiostation(9);
        radio.setMinNumberOfRadiostation(0);
        radio.setCurrentNumberOfRadiostation(7);

        radio.getMinNumberOfRadiostation();
        int expected = 0;
        int actual = radio.getMinNumberOfRadiostation();
        assertEquals(expected, actual);
    }
//    @Test
//    public void shouldInitFieldToZeroValues() {
//      Conditioner conditioner = new Conditioner();
//        assertNull(conditioner.name);
//        assertEquals(0, conditioner.maxTemperature);
//        assertEquals(0, conditioner.minTemperature);
//        assertEquals(0, conditioner.currentTemperature);
//        assertFalse(conditioner.on);
//    }



//    @Test
//    public void shouldChangeFields() {
//        Conditioner conditioner = new Conditioner();
//        assertEquals(0, conditioner.currentTemperature);
//        conditioner.currentTemperature = -100;
//        assertEquals(-100, conditioner.currentTemperature);
//    }
}
