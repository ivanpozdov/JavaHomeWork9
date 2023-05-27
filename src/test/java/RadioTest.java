import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void NegativeTestStations1() {
        Radio radio = new Radio();
        radio.setCurrentStation(-6);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NegativeTestStations2() {
        Radio radio = new Radio();
        radio.setCurrentStation(15);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void limitValuesStation1() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void limitValuesStation2() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void limitValuesStation3() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void limitValuesStation4() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void limitValuesStation5() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void limitValuesStation6() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SettingUpTheZeroStationTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.setCurrentStation(0);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NegativeTestVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-10);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NegativeTestVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(150);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void limitValuesVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void limitValuesVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void limitValuesVolume3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void limitValuesVolume4() {
        Radio radio = new Radio();
        radio.setCurrentVolume(98);
        int expected = 98;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void limitValuesVolume5() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void limitValuesVolume6() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NextlimitValuesStationTest1() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.NextCurrentStation();
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NextlimitValuesStationTest2() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.NextCurrentStation();
        int expected = 2;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NextlimitValuesStationTest3() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.NextCurrentStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NextlimitValuesStationTest4() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.NextCurrentStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void PrevlimitValuesStationTest1() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.PrevCurrentStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void PrevlimitValuesStationTest2() {
        Radio radio = new Radio();
        radio.setCurrentStation(2);
        radio.PrevCurrentStation();
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void PrevlimitValuesStationTest3() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.PrevCurrentStation();
        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void PrevlimitValuesStationTest4() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.PrevCurrentStation();
        int expected = 7;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void PrevlimitValuesStationTest5() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.setCurrentStation(0);
        radio.PrevCurrentStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NextlimitValuesVolumeTest1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.NextCurrentVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NextlimitValuesVolumeTest2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.NextCurrentVolume();
        int expected = 2;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NextlimitValuesVolumeTest3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(98);
        radio.NextCurrentVolume();
        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NextlimitValuesVolumeTest4() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.NextCurrentVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NextlimitValuesVolumeTest5() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.setCurrentVolume(100);
        radio.NextCurrentVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void PrevlimitValuesVolumeTest1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(25);
        radio.setCurrentVolume(0);
        radio.PrevCurrentVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void PrevlimitValuesVolumeTest2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);
        radio.PrevCurrentVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void PrevlimitValuesVolumeTest3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(98);
        radio.PrevCurrentVolume();
        int expected = 97;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void PrevlimitValuesVolumeTest4() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.PrevCurrentVolume();
        int expected = 98;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void PrevlimitValuesVolumeTest5() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.PrevCurrentVolume();
        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

}

