package ru.netology.domain;

public class Radio {
    //private String name;
    private int currentNumberOfRadiostation;
    private int minNumberOfRadiostation = 0;
    private int maxNumberOfRadiostation = 9;
    //private int volume;
    //private boolean on;


    public int getCurrentNumberOfRadiostation() {
        return currentNumberOfRadiostation;
    }

    public void setCurrentNumberOfRadiostation(int currentNumberOfRadiostation) {
        //if (currentNumberOfRadiostation > maxNumberOfRadiostation) {
        //    return;
        //}
        //if (currentNumberOfRadiostation < minNumberOfRadiostation) {
        //    return;
        //}
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

    public void nextRadiostation(int nextRadiostation) {
        if (currentNumberOfRadiostation > 9) {
            currentNumberOfRadiostation = 0;
        }
    }

    public void prevRadiostation (int prevRadiostation) {
        if (currentNumberOfRadiostation < 0) {
            currentNumberOfRadiostation = 9;
        }
    }




    //public String getName() {
    //    return name;
    //}

    // public void setName(String name) {
    //    this.name = name;
    //}


    //public void setMaxTemperature(int maxTemperature) {
    //    this.maxTemperature = maxTemperature;
    //}

    //public void setMinTemperature(int minTemperature) {
    //    this.minTemperature = minTemperature;
    //}

    //public int getCurrentTemperature() {
    //    return currentTemperature;
    //}

    //public void setCurrentTemperature(int currentTemperature) {
    //    if (currentTemperature > maxTemperature) {
    //        return;
    //    }
    //    if (currentTemperature < minTemperature) {
    //        return;
    //    }
    //    // здесь уверены, что все проверки прошли
    //    this.currentTemperature = currentTemperature;
    //}

//    public void setCurrentTemperature(int currentTemperature) {
//        if (currentTemperature <= maxTemperature) {
//            if (currentTemperature >= minTemperature) {
//                this.currentTemperature = currentTemperature;
//            }
//        }
//    }

    //public boolean isOn() {
    //    return on;
    //}

    //public void setOn(boolean on) {
    //    this.on = on;
    //}
}
