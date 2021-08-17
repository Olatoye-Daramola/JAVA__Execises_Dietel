package TryOuts;

public class Mp3Player {
    private boolean isOn;
    private int songNumberOnPlaylist = 1;
    private int volume = 5;
    private boolean isPlaying;


    public void turnOn(){
        isOn = true;
    }

    public boolean isOn() {
        return isOn;
    }

    public void nextSong() {
        if (isOn) {
            songNumberOnPlaylist++;
        } else {songNumberOnPlaylist = 0;}
    }

    public void previousSong() {
        if(isOn) {
            if (songNumberOnPlaylist >= 1) {
                songNumberOnPlaylist--;
            } else {
                songNumberOnPlaylist = 1;
            }
        } else {songNumberOnPlaylist = 0;}
    }

    public void volumeUp() {
        if (isOn) {
            if (volume > 25) {
                volume = 25;
            }
            if (volume < 25) {
                volume++;
            }
        } else {volume = 0;}
    }

    public void volumeDown() {
        if (isOn) {
            if (volume < 0) {
                volume = 0;
            }
            if (volume > 0) {
                volume--;
            }
        } else {volume = 0;}
    }

    public int getVolumeLevel(){
        return volume;
    }

    public int getSong() {
        return songNumberOnPlaylist;
    }

    public void playSong() {
        if (isOn) {
            isPlaying = true;
        }
    }

    public boolean isPlaying(){
        return isPlaying;
    }
}