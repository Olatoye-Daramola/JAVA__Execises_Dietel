package Mp3Player;

import java.util.ArrayList;

public class DefaultPlaylist {
    private ArrayList<Music> music = new ArrayList<>();

    public void addMusic(Music music) {
        this.music.add(music);
    }

    public void delete(Music music) {
        this.music.remove(music);
    }

    public int getNumberOfSongsInPlaylist() {
        return music.size();
    }
}
