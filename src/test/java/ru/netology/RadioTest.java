package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class RadioTest {

    @Test
    void shouldUseNumberOfStations() {
        Radio rad1 = new Radio(7);

        assertEquals(6, rad1.getNumberOfStations());
    }


    @Test
    public void setCurrentStationNumber() {
        Radio rad1 = new Radio(7);

        rad1.setCurrentStationNumber(5);

        assertEquals(5, rad1.getCurrentStationNumber());
    }

    @Test
    public void setCurrentStationNumberOverLimit() {
        Radio rad = new Radio(7);

        rad.setCurrentStationNumber(6);

        assertEquals(6, rad.getCurrentStationNumber());
    }

    @Test
    public void getCurrentStationNumber() {
        Radio rad = new Radio(7);

        assertEquals(0, rad.getCurrentStationNumber());
    }

    @Test
    public void setCurrentStationNumberUnderLimit() {
        Radio rad = new Radio(7);

        rad.setCurrentStationNumber(-1);

        assertEquals(0, rad.getCurrentStationNumber());
    }


    @Test
    public void getCurrentVolume() {
        Radio rad = new Radio(7);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolume() {
        Radio rad = new Radio(7);

        rad.setCurrentVolume(77);

        assertEquals(77, rad.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeUnderLimit() {
        Radio rad = new Radio(7);

        rad.setCurrentVolume(-1);

        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolumeOverLimit() {
        Radio rad = new Radio(7);

        rad.setCurrentVolume(110);

        assertEquals(0, rad.getCurrentVolume());
    }

    @Test
    void setVolumeToMaximum() {
        Radio rad = new Radio(7);
        rad.setVolumeToMaximum();

        assertEquals(100, rad.getCurrentVolume());
    }

    @Test
    void increaseVolume() {
        Radio rad = new Radio(7);
        rad.setCurrentVolume(100);

        rad.increaseVolume();

        assertEquals(100, rad.getCurrentVolume());

    }

    @Test
    void increaseVolumeToMaximum() {
        Radio rad = new Radio(7);
        rad.setVolumeToMaximum();


        assertEquals(100, rad.getCurrentVolume());

    }


    @Test
    void decreaseVolume() {
        Radio rad = new Radio(7);
        rad.setCurrentVolume(7);
        rad.decreaseVolume();

        assertEquals(6, rad.getCurrentVolume());

    }

    @Test
    void decreaseVolumeToMinimum() {
        Radio rad = new Radio(7);
        rad.setCurrentVolume(0);
        rad.decreaseVolume();

        assertEquals(0, rad.getCurrentVolume());

    }


    @Test
    void increaseStationNumber() {
        Radio rad = new Radio(7);
        rad.setCurrentStationNumber(5);
        rad.increaseStationNumber();

        assertEquals(6, rad.getCurrentStationNumber());

    }

    @Test
    void increaseStationNumberToMaximum() {
        Radio rad = new Radio(7);
        rad.setCurrentStationNumber(7);
        rad.increaseStationNumber();

        assertEquals(1, rad.getCurrentStationNumber());

    }


    @Test
    void decreaseStationNumber() {
        Radio rad = new Radio(7);
        rad.setCurrentStationNumber(4);
        rad.decreaseStationNumber();

        assertEquals(3, rad.getCurrentStationNumber());

    }

    @Test
    void decreaseStationNumberToMinimum() {
        Radio rad = new Radio(7);
        rad.setCurrentStationNumber(0);
        rad.decreaseStationNumber();

        assertEquals(7, rad.getCurrentStationNumber());

    }

}

