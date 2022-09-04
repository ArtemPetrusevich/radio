import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.security.PublicKey;

public class RadioManagerTest {
    @Test
    public void setValidVolume() {
        RadioManager radio = new RadioManager(10);
        radio.setCurrentVolume(10);
        int actual = radio.getCurrentVolume();
        int expected = 10;
        Assertions.assertEquals(actual, expected);

    }


    public void setInvalidVolumeMax() {
        RadioManager radioManager = new RadioManager(10);
        radioManager.setCurrentVolume(20);
        int actual = radioManager.getCurrentVolume();
        int expected = 10;
        Assertions.assertEquals(actual, expected);


    }


    @Test
    public void setInvalidVolumeMin() {
        RadioManager radioManager = new RadioManager(10);
        radioManager.setCurrentVolume(-1);
        int actual = radioManager.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void plusVolumeOver() {
        RadioManager radio = new RadioManager(10);
        radio.setCurrentVolume(100);
        radio.plusVolume();
        int actual = radio.getCurrentVolume();
        int expected = 100;
        Assertions.assertEquals(actual, expected);


    }
    @Test
    public void plusVolume() {
        RadioManager radio = new RadioManager(10);
        radio.setCurrentVolume(5);
        radio.plusVolume();
        int actual = radio.getCurrentVolume();
        int expected = 6;
        Assertions.assertEquals(actual, expected);


    }
    @Test
    public void minusVolumeLessNull() {
        RadioManager radio = new RadioManager(10);
        radio.setCurrentVolume(0);
        radio.minusVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(actual, expected);


    }
    @Test
    public void minusVolume() {
        RadioManager radio = new RadioManager(10);
        radio.setCurrentVolume(2);
        radio.minusVolume();
        int actual = radio.getCurrentVolume();
        int expected = 1;
        Assertions.assertEquals(actual, expected);


    }
    @Test
    public void setCurrentStation(){
        RadioManager radio = new RadioManager(10);
        radio.setCurrentStation(9);
        int actual = radio.getCurrentStation();
        int expected = 9;
        Assertions.assertEquals(actual, expected);
    }
@Test
    public void setInvalidCurrentStationMax(){
    RadioManager radio = new RadioManager(10);
    radio.setCurrentStation(10);
    int actual = radio.getCurrentStation();
    int expected = 9;
    Assertions.assertEquals(actual, expected);

}
    @Test
    public void setInvalidCurrentStationMin(){
        RadioManager radio = new RadioManager(10);
        radio.setCurrentStation(-1);
        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void nextOverMax(){
        RadioManager radio = new RadioManager(10);
        radio.setCurrentStation(10);
        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void next(){
        RadioManager radio = new RadioManager(10);
        radio.setCurrentStation(8);
        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 9;
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void prevLessMin(){
        RadioManager radio = new RadioManager(10);
        radio.setCurrentStation(0);
        radio.prev();
        int actual = radio.getCurrentStation();
        int expected = radio.getCurrentMaxStation();
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void prev(){
        RadioManager radio = new RadioManager(10);
        radio.setCurrentStation(3);
        radio.prev();
        int actual = radio.getCurrentStation();
        int expected = 2;
        Assertions.assertEquals(actual, expected);
    }


}
