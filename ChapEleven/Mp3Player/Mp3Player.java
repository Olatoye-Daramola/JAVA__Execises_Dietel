package Mp3Player;

import static Mp3Player.MusicState.*;
import static Mp3Player.PowerButtonPosition.*;

public class Mp3Player {
    private PowerButton powerButton = new PowerButton();
    private MusicState musicState = STOPPED;
    private Volume volume = new Volume();

    public PowerButton switchButton() {
        return powerButton;
    }

    public void switchMp3PlayerOn() {
        powerButton.switchMp3PowerTo(ON);
    }

    public void switchMp3PlayerOff() {
        powerButton.switchMp3PowerTo(OFF);
    }

    public MusicState getMusicPlayingState() {
        return musicState;
    }

    public void playMusic() {
        musicState = PLAYING;
    }

    public int getVolumeLevel() {
        return volume.getVolume();
    }
}
