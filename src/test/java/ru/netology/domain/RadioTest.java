package ru.netology.domain;import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    public void testSwitchingTheRadioStationToTheNext(){
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);
        radio.switchingTheRadioStationToTheNext();
        radio.switchingTheRadioStationToTheNext();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected,actual);
    }

    @Test
    public void testSwitchingTheRadioStationToThePreviousOne(){
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);
        radio.switchingTheRadioStationToThePreviousOne();
        radio.switchingTheRadioStationToThePreviousOne();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected,actual);
    }

    @Test
    public void radioStationSelection(){
        Radio radio = new Radio();
        radio.setCurrentRadioStation(7);
        radio.setCurrentRadioStation(11);
        int expected = 7;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected,actual);
    }

    @Test
    public void radioStationSelection2() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.setCurrentRadioStation(-1);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void increaseSoundVolume() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(9);
        radio.increaseSoundVolume();
        radio.increaseSoundVolume();
        int expected = 10;
        int actual = radio.getCurrentSoundVolume();
        assertEquals(expected,actual);
    }

    @Test
    public void decreaseSoundVolume(){
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(1);
        radio.decreaseSoundVolume();
        radio.decreaseSoundVolume();
        int expected = 0;
        int actual = radio.getCurrentSoundVolume();
        assertEquals(expected,actual);
    }

    @Test
    public void soundVolumeSelection() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(7);
        radio.setCurrentSoundVolume(13);
        int expected = 7;
        int actual = radio.getCurrentSoundVolume();
        assertEquals(expected,actual);
    }

    @Test
    public void soundVolumeSelection2() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(4);
        radio.setCurrentSoundVolume(-12);
        int expected = 4;
        int actual = radio.getCurrentSoundVolume();
        assertEquals(expected,actual);
    }

}