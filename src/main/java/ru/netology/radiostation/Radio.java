package ru.netology.radiostation;

public class Radio {

    public int currentRadiostation;

    public int currentVolume;


    public int increaseVolume() {

        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
        return currentVolume;
    }

    public int decreseVolume() {

        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        return currentVolume;
    }

    public int nextRadiostation() {

        if (currentRadiostation < 9) {
            currentRadiostation = currentRadiostation + 1;
        } else {
            currentRadiostation = 0;
        }
        return currentRadiostation;
    }

    public int prevRadiostation() {

        if (currentRadiostation > 0) {
            currentRadiostation = currentRadiostation - 1;
        } else {
            currentRadiostation = 9;
        }
        return currentRadiostation;
    }
}
