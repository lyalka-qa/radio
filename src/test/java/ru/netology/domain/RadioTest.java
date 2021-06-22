package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
    Radio radio = new Radio();

    @Test
    public void setRadiostation() {
        radio.setMaxNumberOfRadiostation(9);
        radio.setMinNumberOfRadiostation(0);

        radio.setCurrentNumberOfRadiostation(5);

        assertEquals(5, radio.getCurrentNumberOfRadiostation());
    }

    @Test
    public void setRadiostationOverMax() {
        radio.setMaxNumberOfRadiostation(9);
        radio.setMinNumberOfRadiostation(0);

        radio.setCurrentNumberOfRadiostation(111);

        assertEquals(0, radio.getCurrentNumberOfRadiostation());
    }

    @Test
    public void setRadiostationLowerMin() {
        radio.setMaxNumberOfRadiostation(9);
        radio.setMinNumberOfRadiostation(0);

        radio.setCurrentNumberOfRadiostation(-1);

        assertEquals(0, radio.getCurrentNumberOfRadiostation());
    }

    @Test
    public void nextRadiostation() {
        radio.setMaxNumberOfRadiostation(9);
        radio.setMinNumberOfRadiostation(0);
        radio.setCurrentNumberOfRadiostation(9);

        radio.nextRadiostation();

        assertEquals(0, radio.getCurrentNumberOfRadiostation());

    }

    @Test
    public void nextRadiostation1() {
        radio.setMaxNumberOfRadiostation(9);
        radio.setMinNumberOfRadiostation(0);
        radio.setCurrentNumberOfRadiostation(8);

        radio.nextRadiostation();

        assertEquals(9, radio.getCurrentNumberOfRadiostation());

    }

    @Test
    public void prevRadiostation() {
        radio.setMaxNumberOfRadiostation(9);
        radio.setMinNumberOfRadiostation(0);
        radio.setCurrentNumberOfRadiostation(0);

        radio.prevRadiostation();

        assertEquals(9, radio.getCurrentNumberOfRadiostation());
    }

    @Test
    public void prevRadiostation1() {
        radio.setMaxNumberOfRadiostation(9);
        radio.setMinNumberOfRadiostation(0);
        radio.setCurrentNumberOfRadiostation(1);

        radio.prevRadiostation();

        assertEquals(0, radio.getCurrentNumberOfRadiostation());
    }

    @Test
    public void getMaxRadiostation() {
        radio.setMaxNumberOfRadiostation(9);
        radio.setMinNumberOfRadiostation(0);
        radio.setCurrentNumberOfRadiostation(4);

        radio.getMaxNumberOfRadiostation();

        assertEquals(9, radio.getMaxNumberOfRadiostation());
    }

    @Test
    public void getMinRadiostation() {
        radio.setMaxNumberOfRadiostation(9);
        radio.setMinNumberOfRadiostation(0);
        radio.setCurrentNumberOfRadiostation(7);

        radio.getMinNumberOfRadiostation();

        assertEquals(0, radio.getMinNumberOfRadiostation());
    }


    @Test
    public void setVolume() {
        radio.setMinVolume(0);
        radio.setMaxVolume(10);

        radio.setCurrentVolume(6);

        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    public void setVolumeOverMax() {
        radio.setMinVolume(0);
        radio.setMaxVolume(10);

        radio.setCurrentVolume(15);

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void setVolumeLowerMin() {
        radio.setMinVolume(0);
        radio.setMaxVolume(10);

        radio.setCurrentVolume(-20);

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void increaseVolume() {
        radio.setMinVolume(0);
        radio.setMaxVolume(10);
        radio.setCurrentVolume(10);

        radio.increaseVolume();

        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void increaseVolume1() {
        radio.setMinVolume(0);
        radio.setMaxVolume(10);
        radio.setCurrentVolume(8);

        radio.increaseVolume();

        assertEquals(9, radio.getCurrentVolume());
    }

    @Test
    public void decreaseVolume() {
        radio.setMinVolume(0);
        radio.setMaxVolume(10);
        radio.setCurrentVolume(0);

        radio.decreaseVolume();

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void decreaseVolume1() {
        radio.setMinVolume(0);
        radio.setMaxVolume(10);
        radio.setCurrentVolume(9);

        radio.decreaseVolume();

        assertEquals(8, radio.getCurrentVolume());
    }


    @Test
    public void getMaxVolume() {
        radio.setMinVolume(0);
        radio.setMaxVolume(10);
        radio.setCurrentVolume(3);

        radio.getMaxVolume();

        assertEquals(10, radio.getMaxVolume());
    }

    @Test
    public void getMinVolume() {
        radio.setMinVolume(0);
        radio.setMaxVolume(10);
        radio.setCurrentVolume(9);

        radio.getMinVolume();

        assertEquals(0, radio.getMinVolume());
    }


}
