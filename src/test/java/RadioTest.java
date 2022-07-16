import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
//Station
    @Test
    public void currentStationInRange() {
        Radio radio = new Radio();
        radio.setCurrentStation(4);
        int expected = 4;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void currentStationNotRangeMoreMaxRange() {
        Radio radio = new Radio();
        radio.setCurrentStation(12);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void currentStationNotRangeMoreMinRange() {
        Radio radio = new Radio();
        radio.setCurrentStation(-2);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void currentVolumeInRange() {
        Radio radio = new Radio();
        radio.setCurrentVolume(4);
        int expected = 4;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void currentVolumeMoreMaxRange() {
        Radio radio = new Radio();
        radio.setCurrentVolume(15);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void currentVolumeMoreMinRange() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-5);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
