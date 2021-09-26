package Mp3Player;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static Mp3Player.PowerButtonPosition.*;
import static Mp3Player.MusicState.*;


class Mp3PlayerTest {
    Mp3Player sony;
    PowerButton powerButton;

    @BeforeEach
    public void setUp() {
        sony = new Mp3Player();
        powerButton = sony.switchButton();
    }

    @Test
    @DisplayName("Mp3 player has power switch button")
    public void testThatMp3PlayerHasPowerSwitch(){
        assertNotNull(sony.switchButton());
    }

    @Test
    @DisplayName("Mp3 player is switched off by default")
    public void testThatMp3IsOffByDefault(){
        assertEquals(OFF, powerButton.getPowerState());
    }

    @Test
    @DisplayName("Mp3 player has been turned on")
    public void testThatMp3CanBeTurnedOn(){
        assertEquals(OFF, powerButton.getPowerState());
        sony.switchMp3PlayerOn();
        assertEquals(ON, sony.switchButton().getPowerState());
    }

    @Test
    @DisplayName("Mp3 player has been turned off")
    public void testThatMp3CanBeTurnedOff(){
        sony.switchMp3PlayerOn();
        sony.switchMp3PlayerOff();
        assertEquals(OFF, sony.switchButton().getPowerState());
    }

    @Test
    @DisplayName("Mp3 player is not playing music by default")
    public void testThatMusicIsStoppedByDefault(){
        sony.switchMp3PlayerOn();
        assertEquals(STOPPED, sony.getMusicPlayingState());
    }

    @Test
    @DisplayName("Mp3 player can play music")
    public void testThatMp3CanPlayMusic(){
        sony.switchMp3PlayerOn();
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

    }
}