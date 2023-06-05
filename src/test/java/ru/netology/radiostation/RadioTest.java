package ru.netology.radiostation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetRadiostation() {
        Radio cond = new Radio();
        cond.currentRadiostation = 9;
        int expected = 9;
        int actual = cond.currentRadiostation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio cond = new Radio();
        cond.currentVolume = 50;
        int expected = 50;
        int actual = cond.currentVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPlusOneVolume() {
        Radio cond = new Radio();
        cond.currentVolume = 2;
        int expected = 3;
        int actual = cond.increaseVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeNotMoreThenOneHundred() {
        Radio cond = new Radio();
        cond.currentVolume = 100;
        int expected = 100;
        int actual = cond.increaseVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinusOneVolume() {
        Radio cond = new Radio();
        cond.currentVolume = 1;
        int expected = 0;
        int actual = cond.decreseVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeNotLessThenZero() {
        Radio cond = new Radio();
        cond.currentVolume = 0;
        int expected = 0;
        int actual = cond.decreseVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPlusOneRadiostation() {
        Radio cond = new Radio();
        cond.currentRadiostation = 7;
        int expected = 8;
        int actual = cond.nextRadiostation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radiostationNotMoreThenNine() {
        Radio cond = new Radio();
        cond.currentRadiostation = 9;
        int expected = 0;
        int actual = cond.nextRadiostation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinusOneRadiostation() {
        Radio cond = new Radio();
        cond.currentRadiostation = 9;
        int expected = 8;
        int actual = cond.prevRadiostation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radiostationNotLessThenZero() {
        Radio cond = new Radio();
        cond.currentRadiostation = 0;
        int expected = 9;
        int actual = cond.prevRadiostation();
        Assertions.assertEquals(expected, actual);
    }
}

