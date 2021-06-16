package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
    @Test
    public void setRadiostation() {
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


    @Test
    public void setVolume() {
        Radio radio = new Radio();
        radio.setMinVolume(0);
        radio.setMaxVolume(10);
        radio.setCurrentVolume(6);

        int expected = 6;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        Radio radio = new Radio();
        radio.setMinVolume(0);
        radio.setMaxVolume(10);

        radio.setCurrentVolume(11);
        radio.increaseVolume(10);

        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume1() {
        Radio radio = new Radio();
        radio.setMinVolume(0);
        radio.setMaxVolume(10);

        radio.setCurrentVolume(7);
        radio.increaseVolume(8);

        int expected = 8;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume() {
        Radio radio = new Radio();
        radio.setMinVolume(0);
        radio.setMaxVolume(10);

        radio.setCurrentVolume(-1);
        radio.decreaseVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume1() {
        Radio radio = new Radio();
        radio.setMinVolume(0);
        radio.setMaxVolume(10);

        radio.setCurrentVolume(5);
        radio.decreaseVolume(4);

        int expected = 4;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void getMaxVolume() {
        Radio radio = new Radio();
        radio.setMinVolume(0);
        radio.setMaxVolume(10);
        radio.setCurrentVolume(3);

        radio.getMaxVolume();
        int expected = 10;
        int actual = radio.getMaxVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void getMinVolume() {
        Radio radio = new Radio();
        radio.setMinVolume(0);
        radio.setMaxVolume(10);
        radio.setCurrentVolume(9);

        radio.getMinVolume();
        int expected = 0;
        int actual = radio.getMinVolume();
        assertEquals(expected, actual);
    }


}
