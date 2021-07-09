package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    public void setRadiostation() {
        Radio radio = new Radio();
        radio.setMaxNumberOfRadiostation(9);
        radio.setMinNumberOfRadiostation(0);

        radio.setCurrentNumberOfRadiostation(5);

        assertEquals(5, radio.getCurrentNumberOfRadiostation());
    }

    @Test
    public void setRadiostationOverMax() {
        Radio radio = new Radio();
        radio.setMaxNumberOfRadiostation(9);
        radio.setMinNumberOfRadiostation(0);

        radio.setCurrentNumberOfRadiostation(111);

        assertEquals(0, radio.getCurrentNumberOfRadiostation());
    }

    @Test
    public void setRadiostationLowerMin() {
        Radio radio = new Radio();
        radio.setMaxNumberOfRadiostation(9);
        radio.setMinNumberOfRadiostation(0);

        radio.setCurrentNumberOfRadiostation(-1);

        assertEquals(0, radio.getCurrentNumberOfRadiostation());
    }

    @Test
    public void nextRadiostation() {
        Radio radio = new Radio();
        radio.setCurrentNumberOfRadiostation(9);

        radio.nextRadiostation();

        assertEquals(0, radio.getCurrentNumberOfRadiostation());

    }

    @Test
    public void nextRadiostation1() {
        Radio radio = new Radio();
        radio.setCurrentNumberOfRadiostation(8);

        radio.nextRadiostation();

        assertEquals(9, radio.getCurrentNumberOfRadiostation());

    }

    @Test
    public void prevRadiostation() {
        Radio radio = new Radio();
        radio.setCurrentNumberOfRadiostation(0);

        radio.prevRadiostation();

        assertEquals(9, radio.getCurrentNumberOfRadiostation());
    }

    @Test
    public void prevRadiostation1() {
        Radio radio = new Radio();
        radio.setCurrentNumberOfRadiostation(1);

        radio.prevRadiostation();

        assertEquals(0, radio.getCurrentNumberOfRadiostation());
    }

    @Test
    public void getMaxRadiostation() {
        Radio radio = new Radio();
        radio.getMaxNumberOfRadiostation();

        assertEquals(9, radio.getMaxNumberOfRadiostation());
    }

    @Test
    public void getMinRadiostation() {
        Radio radio = new Radio();
        radio.getMinNumberOfRadiostation();

        assertEquals(0, radio.getMinNumberOfRadiostation());
    }


    @Test
    public void setVolume() {
        Radio radio = new Radio();
        radio.setMinVolume(0);
        radio.setMaxVolume(100);

        radio.setCurrentVolume(6);

        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    public void setVolumeOverMax() {
        Radio radio = new Radio();
        radio.setMinVolume(0);
        radio.setMaxVolume(100);

        radio.setCurrentVolume(115);

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void setVolumeLowerMin() {
        Radio radio = new Radio();
        radio.setMinVolume(0);
        radio.setMaxVolume(100);

        radio.setCurrentVolume(-20);

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void increaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(48);

        radio.increaseVolume();

        assertEquals(49, radio.getCurrentVolume());
    }

    @Test
    public void increaseVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.increaseVolume();

        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void decreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.decreaseVolume();

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void decreaseVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(37);

        radio.decreaseVolume();

        assertEquals(36, radio.getCurrentVolume());
    }


    @Test
    public void getMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(3);

        radio.getMaxVolume();

        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void getMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);

        radio.getMinVolume();

        assertEquals(0, radio.getMinVolume());
    }

    @Test
    public void setCurrentNumberOfRadiostationFlexible() {
        Radio radio = new Radio(101, 0, 1100);
        assertEquals(101, radio.getCurrentNumberOfRadiostation());
    }

    @Test
    public void NextRadiostationFlexible() {
        Radio radio = new Radio(110, 0, 110);
        radio.nextRadiostation();

        assertEquals(0, radio.getCurrentNumberOfRadiostation());
    }

    @Test
    public void PrevRadiostationFlexible() {
        Radio radio = new Radio(0, 0, 110);
        radio.prevRadiostation();

        assertEquals(110, radio.getCurrentNumberOfRadiostation());
    }


}
