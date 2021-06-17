package ru.netology.domain;

public class Radio {
    private int currentNumberOfRadiostation;
    private int minNumberOfRadiostation = 0;
    private int maxNumberOfRadiostation = 9;
    private int currentVolume;
    private int maxVolume = 10;
    private int minVolume = 0;


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
        }
        if (currentNumberOfRadiostation >= maxNumberOfRadiostation) {
            currentNumberOfRadiostation = minNumberOfRadiostation;
        }
    }

    public void prevRadiostation() {
        if (currentNumberOfRadiostation > minNumberOfRadiostation) {
            currentNumberOfRadiostation = currentNumberOfRadiostation - 1;
        }
        if (currentNumberOfRadiostation <= minNumberOfRadiostation) {
            currentNumberOfRadiostation = maxNumberOfRadiostation;
        }
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        //if (currentVolume > maxVolume) {
        //    return;
        //}
        //if (currentVolume < minVolume) {
        //    return;
        //}
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
        }
        if (currentVolume >= maxVolume) {
            currentVolume = maxVolume;
        }

    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
            }
        if (currentVolume <= minVolume) {
            currentVolume = minVolume;
        }

        }



}