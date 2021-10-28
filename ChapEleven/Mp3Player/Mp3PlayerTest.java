package Mp3Player;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.Time;

import static Mp3Player.MusicState.*;
import static org.junit.jupiter.api.Assertions.*;


class Mp3PlayerTest {
    Mp3Player sony;


    @BeforeEach
    void setUp() {
        sony = new Mp3Player();
    }

    @Test
    @DisplayName("Mp3 player is switched off by default")
    void testThatMp3IsOffByDefault(){
        assertFalse(sony.getOn());
    }

    @Test
    @DisplayName("Mp3 player has been turned on")
    void testThatMp3CanBeTurnedOn(){
        sony.isOn();
        assertTrue(sony.getOn());
    }

    @Test
    @DisplayName("Mp3 player has been turned off")
    void testThatMp3CanBeTurnedOff(){
        sony.isOn();
        assertTrue(sony.getOn());
        sony.isOn();
        assertFalse(sony.getOn());
    }

    @Test
    @DisplayName("Mp3 player is not playing music by default")
    void testThatMusicIsStoppedByDefault(){
        sony.isOn();
        assertEquals(STOPPED, sony.getMusicPlayingState());
    }

    @Test
    @DisplayName("Mp3 player can play music")
    void testThatMp3CanPlayMusic(){
        sony.isOn();
        assertEquals(STOPPED, sony.getMusicPlayingState());
        sony.playMusic();
        assertEquals(PLAYING, sony.getMusicPlayingState());
    }

    @Test
    @DisplayName("Mp3 player has default volume")
    void testThatMp3PlayerHasVolumeButton(){
        assertEquals(25, sony.getVolumeLevel());
    }

    @Test
    @DisplayName("Mp3 player can increase volume")
    void testThatMp3PlayerCanIncreaseVolume(){
        sony.increaseVolume();
        assertEquals(30, sony.getVolumeLevel());
    }

    @Test
    @DisplayName("Mp3 player cannot increase volume beyond 100")
    void testThatMp3PlayerCanIncreaseVolumeBeyond100(){
        for(int i = 0; i < 30; i++) {
            sony.increaseVolume();
        }
        assertEquals(100, sony.getVolumeLevel());
    }

    @Test
    @DisplayName("Mp3 player can decrease volume")
    void testThatMp3PlayerCanDecreaseVolume(){
        sony.decreaseVolume();
        assertEquals(20, sony.getVolumeLevel());
    }

    @Test
    @DisplayName("Mp3 player cannot decrease volume below 0")
    void testThatMp3PlayerCanDecreaseVolumeBelow0(){
        for(int i = 0; i < 30; i++) {
            sony.decreaseVolume();
        }
        assertEquals(0, sony.getVolumeLevel());
    }

    @Test
    @DisplayName("Mp3 player can play music")
    void testThatMp3CanPauseMusic(){
        sony.isOn();
        assertEquals(STOPPED, sony.getMusicPlayingState());
        sony.playMusic();
        assertEquals(PLAYING, sony.getMusicPlayingState());
        sony.pauseMusic();
        assertEquals(PAUSED, sony.getMusicPlayingState());
    }

    @Test
    @DisplayName("Mp3 player has a default playlist")
    void testThatMp3HasADefaultPlaylist(){
        assertNotNull(sony.getDefaultPlaylist());
    }

    @Test
    @DisplayName("Mp3 can add music to playlist")
    void testThatMp3CanAddMusicToPlaylist(){
        sony.isOn();
        Music song1 = new Music("song1", 1, new Time(120));
        sony.getDefaultPlaylist().addMusic(song1);
        Music song2 = new Music("song2", 2, new Time(200));
        sony.getDefaultPlaylist().addMusic(song2);
        assertEquals(2, (sony.getDefaultPlaylist()).getNumberOfSongsInPlaylist());
    }

//    @Test
//    @DisplayName("Mp3 player can play next music")
//    void testThatMusicCanPlayNextMusic(){
//        sony.isOn();
//        sony.playMusic();
//        sony.
//        assertEquals(NEXT, sony.playNextMusic());
//    }
}
