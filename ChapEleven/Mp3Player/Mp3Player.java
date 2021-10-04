package Mp3Player;

import static Mp3Player.MusicState.*;

public class Mp3Player {
    private boolean isOn;
    private MusicState musicState = STOPPED;
    private Volume volume = new Volume();
    private DefaultPlaylist defaultPlaylist = new DefaultPlaylist();

    public void isOn() {
        isOn = !isOn;
    }

    public boolean getOn() {
        return isOn;
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

    public void increaseVolume() {
        volume.increaseVolume();
    }

    public void decreaseVolume() {
        volume.decreaseVolume();
    }

    public void pauseMusic() {
        musicState = PAUSED;
    }

    public DefaultPlaylist getDefaultPlaylist() {
        return defaultPlaylist;
    }
}
