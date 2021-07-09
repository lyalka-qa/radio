package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    private int currentNumberOfRadiostation;
    private int minNumberOfRadiostation = 0;
    private int maxNumberOfRadiostation = 9;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;

    public void setCurrentNumberOfRadiostation(int currentNumberOfRadiostation) {
        if (currentNumberOfRadiostation > maxNumberOfRadiostation) {
            return;
        }
        if (currentNumberOfRadiostation < minNumberOfRadiostation) {
            return;
        }
        this.currentNumberOfRadiostation = currentNumberOfRadiostation;
    }

    public void nextRadiostation() {
        if (currentNumberOfRadiostation < maxNumberOfRadiostation) {
            currentNumberOfRadiostation = currentNumberOfRadiostation + 1;
        } else {
            currentNumberOfRadiostation = minNumberOfRadiostation;
        }
    }

    public void prevRadiostation() {
        if (currentNumberOfRadiostation > minNumberOfRadiostation) {
            currentNumberOfRadiostation = currentNumberOfRadiostation - 1;
        } else {
            currentNumberOfRadiostation = maxNumberOfRadiostation;
        }
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = minVolume;
        }
    }


}