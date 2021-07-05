package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    public void stationForwardTestTrue() {
        Radio ma9k = new Radio();
        ma9k.setStation(1);
        int expected = 2;
        int actual = ma9k.stationForward();
        assertEquals(expected, actual);
    }

    @Test
    public void stationForwardTestFalse() {
        Radio ma9k = new Radio();
        ma9k.setStation(9);
        int expected = 9;
        int actual = ma9k.stationForward();
        assertEquals(expected, actual);
    }

    @Test
    public void stationReversTestTrue() {
        Radio ma9k = new Radio();
        ma9k.setStation(1);
        int expected = 0;
        int actual = ma9k.stationReverse();
        assertEquals(expected, actual);
    }

    @Test
    public void stationReversTestFalse() {
        Radio ma9k = new Radio();
        ma9k.setStation(0);
        int expected = 0;
        int actual = ma9k.stationReverse();
        assertEquals(expected, actual);
    }

    @Test
    public void switchStationForwardTestTrue() {
        Radio ma9k = new Radio();
        ma9k.setStation(9);
        int expected = 0;
        int actual = ma9k.switchStationForward();
        assertEquals(expected, actual);
    }

    @Test
    public void switchStationForwardTestFalse() {
        Radio ma9k = new Radio();
        ma9k.setStation(9);
        int expected = 9;
        int actual = ma9k.stationForward();
        assertEquals(expected, actual);
    }

    @Test
    public  void switchMaxStationForwardTest() {
        Radio ma9k = new Radio();
        int expected = 0;
        int actual = ma9k.switchStationForward();
        assertEquals(expected, actual);
    }

    @Test
    public void switchMinStationReversTest() {
        Radio ma9k = new Radio();
        int expected = 9;
        int actual = ma9k.switchStationReverse();
        assertEquals(expected, actual);
    }

    @Test
    public void switchStationReversTestTrue() {
        Radio ma9k = new Radio();
        ma9k.setStation(0);
        int expected = 9;
        int actual = ma9k.switchStationReverse();
        assertEquals(expected, actual);
    }

    @Test
    public void switchStationReversTestFalse() {
        Radio ma9k = new Radio();
        ma9k.setStation(9);
        int expected = 8;
        int actual = ma9k.stationReverse();
        assertEquals(expected, actual);
    }

    @Test
    public void setStationTest() {
        Radio ma9k = new Radio();
        ma9k.setStation(10);
        int expected = 1;
        int actual = ma9k.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void setStation1Test() {
        Radio ma9k = new Radio();
        ma9k.setStation(-1);
        int expected = 1;
        int actual = ma9k.getCurrentStation();
        assertEquals(expected, actual);
    }

    // Громкость

    @Test
    public void setLevelVolHigherTestTrue() {
        Radio ma9k = new Radio();
        ma9k.setLevelVol(7);
        int expected = 8;
        int actual = ma9k.setLevelVolHigher();
        assertEquals(expected, actual);
    }

    @Test
    public void setLevelVolHigherTestFalse() {
        Radio ma9k = new Radio();
        ma9k.setLevelVol(10);
        int expected = 10;
        int actual = ma9k.setLevelVolHigher();
        assertEquals(expected, actual);
    }

    @Test
    public void setLevelVolLowTestTrue() {
        Radio ma9k = new Radio();
        ma9k.setLevelVol(0);
        int expected = 0;
        int actual = ma9k.setLevelVolLow();
        assertEquals(expected, actual);
    }

    @Test
    public void setLevelVolLOwTestFalse() {
        Radio ma9k = new Radio();
        ma9k.setLevelVol(0);
        int expected = ma9k.setLevelVolLow();
        int actual = ma9k.levelVolMin();
        assertEquals(expected, actual);
    }

    @Test
    public void setLevelVolLowTest() {
        Radio ma9k = new Radio();
        int expected = 4;
        int actual = ma9k.setLevelVolLow();
        assertEquals(expected, actual);
    }

    @Test
    public void levelVolMaxTestT() {
        Radio ma9k = new Radio();
        ma9k.setLevelVol(10);
        int expected = ma9k.setLevelVolHigher();
        int actual = ma9k.levelVolMax();
        assertEquals(expected, actual);
    }

    @Test
    public void levelVolMinTest() {
        Radio ma9k = new Radio();
        ma9k.setLevelVol(3);
        int expected = ma9k.setLevelVolLow();
        int actual = ma9k.levelVolMin();
        assertEquals(expected, actual);
    }

    @Test
    public void LevelVolMaxTest() {
        Radio ma9k = new Radio();
        ma9k.setLevelVol(6);
        int expected = ma9k.setLevelVolHigher();
        int actual = ma9k.levelVolMax();
        assertEquals(expected, actual);
    }

    @Test
    public void setAboveMaxLevelVolTest() {
        Radio ma9k = new Radio();
        ma9k.setLevelVol(15);
        int expected = 5;
        int actual = ma9k.getCurrentLevelVol();
        assertEquals(expected, actual);
    }

    @Test
    public void setBelowMinLevelVoleTest() {
        Radio ma9k = new Radio();
        ma9k.setLevelVol(-2);
        int expected = 5;
        int actual = ma9k.getCurrentLevelVol();
        assertEquals(expected, actual);
    }


}

