package ru.netology.domain;

public class Radio {
    private int currentNumberOfRadiostation;
    private int minNumberOfRadiostation = 0;
    private int maxNumberOfRadiostation = 9;
    private int amountOfRadiostations = 10;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio(int currentNumberOfRadiostation, int minNumberOfRadiostation, int maxNumberOfRadiostation, int amountOfRadiostations) {
        this.currentNumberOfRadiostation = currentNumberOfRadiostation;
        this.minNumberOfRadiostation = minNumberOfRadiostation;
        this.maxNumberOfRadiostation = maxNumberOfRadiostation;
        this.amountOfRadiostations = amountOfRadiostations;
    }

    public Radio() {
    }

    public int getCurrentNumberOfRadiostation() {
        return currentNumberOfRadiostation;
    }

    public void setCurrentNumberOfRadiostation(int currentNumberOfRadiostation) {
        if (currentNumberOfRadiostation > maxNumberOfRadiostation) {
            return;
        }
        if (currentNumberOfRadiostation < minNumberOfRadiostation) {
            return;
        }
        this.currentNumberOfRadiostation = currentNumberOfRadiostation;
    }

    public void setMaxNumberOfRadiostation(int maxNumberOfRadiostation) {
        this.maxNumberOfRadiostation = maxNumberOfRadiostation;
    }

    public void setMinNumberOfRadiostation(int minNumberOfRadiostation) {
        this.minNumberOfRadiostation = minNumberOfRadiostation;
    }

    public int getMaxNumberOfRadiostation() {
        return maxNumberOfRadiostation;
    }

    public int getMinNumberOfRadiostation() {
        return minNumberOfRadiostation;
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


    public int getCurrentVolume() {
        return currentVolume;
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

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
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