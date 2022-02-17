package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void getCurrentStationNumber() {
        Radio rad = new Radio();

        int expected = 0;
        int actual = rad.getCurrentStationNumber();

        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationNumber() {
        Radio rad = new Radio();

        rad.setCurrentStationNumber(8);

        int expected = 8;
        int actual = rad.getCurrentStationNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationNumberUnderLimit() {
        Radio rad = new Radio();

        rad.setCurrentStationNumber(-1);

        int expected = 0;
        int actual = rad.getCurrentStationNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationNumberOverLimit() {
        Radio rad = new Radio();

        rad.setCurrentStationNumber(10);

        int expected = 0;
        int actual = rad.getCurrentStationNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void getCurrentVolume() {
        Radio rad = new Radio();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(7);

        int expected = 7;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolumeUnderLimit() {
        Radio rad = new Radio();

        rad.setCurrentVolume(-1);

        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolumeOverLimit() {
        Radio rad = new Radio();

        rad.setCurrentVolume(11);

        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void setVolumeToMaximum() {
        Radio rad = new Radio();
        rad.setVolumeToMaximum();

        int expected = 10;
        int actual = rad.getCurrentVolume();
    }

    @Test
    void increaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(7);

        rad.increaseVolume();

        int expected = 8;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);

    }

    @Test
    void increaseVolumeToMaximum() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);
        rad.increaseVolume();

        int expected = 10;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);

    }


    @Test
    void decreaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(7);
        rad.decreaseVolume();

        int expected = 6;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);

    }

    @Test
    void decreaseVolumeToMinimum() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);

    }


    @Test
    void increaseStationNumber() {
        Radio rad = new Radio();
        rad.setCurrentStationNumber(7);
        rad.increaseStationNumber();

        int expected = 8;
        int actual = rad.getCurrentStationNumber();

        assertEquals(expected, actual);

    }


    @Test
    void increaseStationNumberToMaximum() {
        Radio rad = new Radio();
        rad.setCurrentStationNumber(9);
        rad.increaseStationNumber();

        int expected = 0;
        int actual = rad.getCurrentStationNumber();

        assertEquals(expected, actual);

    }



    @Test
    void decreaseStationNumber() {
        Radio rad = new Radio();
        rad.setCurrentStationNumber(7);
        rad.decreaseStationNumber();

        int expected = 6;
        int actual = rad.getCurrentStationNumber();

        assertEquals(expected, actual);

    }

    @Test
    void decreaseStationNumberToMinimum() {
        Radio rad = new Radio();
        rad.setCurrentStationNumber(0);
        rad.decreaseStationNumber();

        int expected = 9;
        int actual = rad.getCurrentStationNumber();

        assertEquals(expected, actual);

    }

}
