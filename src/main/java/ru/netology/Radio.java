package ru.netology;

public class Radio {
    private int currentStationNumber;
    private int currentVolume;
    private int numberOfStations = 10;
    private int maxVolume = 100;

    public Radio() {
    }

    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations;
    }

    public void setCurrentStationNumber(int newCurrentStationNumber) {

        if (newCurrentStationNumber < 0) {
            return;
        }
        if (newCurrentStationNumber >= numberOfStations) {
            return;
        }
        this.currentStationNumber = newCurrentStationNumber;
    }


    public void increaseStationNumber() {
        if (currentStationNumber < numberOfStations) {
            this.currentStationNumber = currentStationNumber + 1;
        } else {
            currentStationNumber = 1;
        }
    }


    public void decreaseStationNumber() {
        if (currentStationNumber > 0) {
            this.currentStationNumber = currentStationNumber - 1;
        } else {
            currentStationNumber = numberOfStations;
        }

    }

    public int getNumberOfStations() {
        return numberOfStations - 1;
    }


    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public void setVolumeToMaximum() {
        this.currentVolume = maxVolume;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        this.currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            this.currentVolume = currentVolume + 1;
        } else {
            currentVolume = maxVolume;
        }
    }


    public void decreaseVolume() {
        if (currentVolume > 0) {
            this.currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }

    }

}

