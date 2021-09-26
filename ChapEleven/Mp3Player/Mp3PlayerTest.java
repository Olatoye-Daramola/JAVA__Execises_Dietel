package Mp3Player;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static Mp3Player.MusicState.*;


class Mp3PlayerTest {
    Mp3Player sony;


    @BeforeEach
    public void setUp() {
        sony = new Mp3Player();
    }

    @Test
    @DisplayName("Mp3 player is switched off by default")
    public void testThatMp3IsOffByDefault(){
        assertFalse(sony.getOn());
    }

    @Test
    @DisplayName("Mp3 player has been turned on")
    public void testThatMp3CanBeTurnedOn(){
        sony.isOn();
        assertTrue(sony.getOn());
    }

    @Test
    @DisplayName("Mp3 player has been turned off")
    public void testThatMp3CanBeTurnedOff(){
        sony.isOn();
        assertTrue(sony.getOn());
        sony.isOn();
        assertFalse(sony.getOn());
    }

    @Test
    @DisplayName("Mp3 player is not playing music by default")
    public void testThatMusicIsStoppedByDefault(){
        sony.isOn();
        assertEquals(STOPPED, sony.getMusicPlayingState());
    }

    @Test
    @DisplayName("Mp3 player can play music")
    public void testThatMp3CanPlayMusic(){
        sony.isOn();
        assertEquals(STOPPED, sony.getMusicPlayingState());
        sony.playMusic();
        assertEquals(PLAYING, sony.getMusicPlayingState());
    }

    @Test
    @DisplayName("Mp3 player has default volume")
    public void testThatMp3PlayerHasVolumeButton(){
        assertEquals(25, sony.getVolumeLevel());
    }

    @Test
    @DisplayName("Mp3 player can increase volume")
    public void testThatMp3PlayerCanIncreaseVolume(){
        sony.increaseVolume();
        assertEquals(30, sony.getVolumeLevel());
    }

    @Test
    @DisplayName("Mp3 player cannot increase volume beyond 100")
    public void testThatMp3PlayerCanIncreaseVolumeBeyond100(){
        for(int i = 0; i < 30; i++) {
            sony.increaseVolume();
        }
        assertEquals(100, sony.getVolumeLevel());
    }

    @Test
    @DisplayName("Mp3 player can decrease volume")
    public void testThatMp3PlayerCanDecreaseVolume(){
        sony.decreaseVolume();
        assertEquals(20, sony.getVolumeLevel());
    }

    @Test
    @DisplayName("Mp3 player cannot decrease volume below 0")
    public void testThatMp3PlayerCanDecreaseVolumeBelow0(){
        for(int i = 0; i < 30; i++) {
            sony.decreaseVolume();
        }
        assertEquals(0, sony.getVolumeLevel());
    }

    @Test
    @DisplayName("Mp3 player can pause music")
    public void testThatMp3CanPauseMusic(){
        sony.isOn();
        sony.playMusic();
        assertEquals(PLAYING, sony.getMusicPlayingState());

        sony.pauseMusic();
        assertEquals(PAUSED, sony.getMusicPlayingState());
    }
}