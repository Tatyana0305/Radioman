package ru.netology;

public class Radio {
        private int currentStationNumber;
        private int currentVolume;


        public int getCurrentStationNumber() {
            return currentStationNumber;
        }

        public void setVolumeToMaximum() {
            this.currentVolume = 10;
        }

        public void setCurrentStationNumber(int newCurrentStationNumber) {
            if (newCurrentStationNumber < 0) {
                return;
            }
            if (newCurrentStationNumber > 9) {
                return;
            }
            this.currentStationNumber = newCurrentStationNumber;
        }

        public int getCurrentVolume() {
            return currentVolume;
        }

        public void setCurrentVolume(int newCurrentVolume) {
            if (newCurrentVolume < 0) {
                return;
            }
            if (newCurrentVolume > 10) {
                return;
            }
            this.currentVolume = newCurrentVolume;
        }

        public void increaseVolume() {
            if (currentVolume < 10) {
                this.currentVolume = currentVolume + 1;
            }
        }


    public void decreaseVolume() {
        if (currentVolume > 0) {
            this.currentVolume = currentVolume - 1;
        }
    }


    public void increaseStationNumber() {
        if (currentStationNumber < 9) {
            this.currentStationNumber = currentStationNumber + 1;

        }
    }

    public void decreaseStationNumber() {
        if (currentStationNumber > 0) {
            this.currentStationNumber = currentStationNumber - 1;

    }
}
}
