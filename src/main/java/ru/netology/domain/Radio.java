package ru.netology.domain;

public class Radio {

    private int currentStation = 1;
    private int minStationNum = 0;
    private int maxStationNum = 9;
    private int currentLevelVol = 5;
    private int minLevelVol = 0;
    private int maxLevelVol = 10;


    public int getCurrentStation() {
        return currentStation;
    }

    public int stationForward() {
        if (currentStation < maxStationNum) {
            currentStation = currentStation + 1;
        }
        return currentStation;
    }

    public int stationReverse() {
        if (currentStation > minStationNum) {
            currentStation = currentStation - 1;
        }
        return currentStation;
    }

    public int switchStationReverse() {
        if (currentStation == minStationNum) {
            this.currentStation = maxStationNum;
        }
        return maxStationNum;
    }

    public void setStation(int currentStation) {
        if (currentStation > maxStationNum) {
            return;
        }
        if (currentStation < minStationNum) {
            return;
        }
        this.currentStation = currentStation;
    }


    // Громкость

    public int getCurrentLevelVol() {
        return currentLevelVol;
    }

    public int setLevelVolHigher() {
        if (currentLevelVol < maxLevelVol) {
            currentLevelVol = currentLevelVol + 1;
        }
        return currentLevelVol;
    }

    public int setLevelVolLow() {
        if (currentLevelVol > minLevelVol) {
            currentLevelVol = currentLevelVol - 1;
        }
        return currentLevelVol;
    }

    public int levelVolMax() {
        if (currentLevelVol == maxLevelVol) {
        }
        return currentLevelVol;
    }


    public int levelVolMin() {
        if (currentLevelVol == minLevelVol) {
        }
        return currentLevelVol;
    }

    public void setLevelVol(int currentLevelVol) {
        if (currentLevelVol > maxLevelVol) {
            return;
        }
        if (currentLevelVol < minLevelVol) {
            return;
        }
        this.currentLevelVol = currentLevelVol;
    }


}



