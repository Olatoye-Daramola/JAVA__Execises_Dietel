package TryOuts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelevisionTest {
    Television hisense = new Television();

    @Test
    public void televisionCanBeTurnedOnTest() {
        hisense.setOn(true);

//        assertEquals(25, hisense.getChannelNumber());
//        assertEquals(2, hisense.getVolumeLevel());
        assertTrue(hisense.isOn());
    }

    @Test
    public void televisionCanBeTurnedOffTest() {
        hisense.setOn(false);

        assertFalse(hisense.isOn());
    }

    @Test
    public void televisionCanChangeToNextChannelTest(){
        hisense.nextChannel();
        hisense.nextChannel();
        hisense.nextChannel();
        hisense.nextChannel();

        assertEquals(29, hisense.getChannelNumber());
    }

    @Test
    public void televisionCanChangeToPreviousChannelTest(){
        hisense.previousChannel();
        hisense.previousChannel();
        hisense.previousChannel();
        hisense.previousChannel();

        assertEquals(21, hisense.getChannelNumber());
    }

    @Test
    public void televisionChannelCanBeSetManuallyTest(){
        hisense.setChannelNumber(30);

        assertEquals(30, hisense.getChannelNumber());
    }

    @Test
    public void volumeCanBeIncreased(){
        hisense.volumeUp();
        hisense.volumeUp();
        hisense.volumeUp();
        hisense.volumeUp();
        hisense.volumeUp();
        hisense.volumeUp();
        hisense.volumeUp();
        hisense.volumeUp();
        hisense.volumeUp();
        hisense.volumeUp();

        assertEquals(12, hisense.getVolumeLevel());
    }

    @Test
    public void volumeCanBeDecreased(){
        hisense.volumeDown();
        hisense.volumeDown();
        hisense.volumeDown();
        hisense.volumeDown();

        assertEquals(0, hisense.getVolumeLevel());
    }

    @Test
    public void volumeCanBeMuted(){
        hisense.volumeUp();
        hisense.volumeUp();
        hisense.volumeUp();
        hisense.volumeUp();
        hisense.volumeUp();
        hisense.volumeUp();
        hisense.volumeUp();
        hisense.volumeUp();
        hisense.volumeUp();
        hisense.volumeUp();

        hisense.setMute(true);

        assertEquals(0, hisense.getVolumeLevel());
    }
}