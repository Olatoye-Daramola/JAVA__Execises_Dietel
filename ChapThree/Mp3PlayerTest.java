package TryOuts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Mp3PlayerTest {
    Mp3Player sony = new Mp3Player();

    @Test
    public void mp3PlayerCanBeTurnedOnTest(){
        assertFalse(sony.isOn());

        sony.turnOn();

        assertTrue(sony.isOn());
    }

    @Test
    public void mp3PlayerCanBeTurnedOffTest(){
        assertFalse(sony.isOn());
    }

    @Test
    public void mp3PlayerCanGoToNextSongTest(){
        sony.turnOn();

        sony.nextSong();
        sony.nextSong();
        sony.nextSong();

        assertEquals(4, sony.getSong());
    }

    @Test
    public void mp3PlayerCanGoToPreviousSongTest(){
        sony.turnOn();

        sony.nextSong();
        sony.nextSong();
        sony.nextSong();
        sony.nextSong();
        sony.nextSong();

        sony.previousSong();
        sony.previousSong();
        sony.previousSong();

        assertEquals(3, sony.getSong());
    }

    @Test
    public void mp3PlayerCannotPlaySongOfSongNumberLessThan1Test(){
        sony.turnOn();

        sony.nextSong();

        sony.previousSong();
        sony.previousSong();
        sony.previousSong();

        assertEquals(1, sony.getSong());
    }

    @Test
    public void mp3PlayerCannotChangeSongWhileOffTest(){
        sony.nextSong();
        sony.nextSong();
        sony.nextSong();

        sony.previousSong();

        assertEquals(0, sony.getSong());
    }

    @Test
    public void mp3PlayerVolumeCanBeIncreasedTest(){
        sony.turnOn();

        sony.volumeUp();
        sony.volumeUp();
        sony.volumeUp();
        sony.volumeUp();
        sony.volumeUp();
        sony.volumeUp();
        sony.volumeUp();
        sony.volumeUp();
        sony.volumeUp();
        sony.volumeUp();

        assertEquals(15, sony.getVolumeLevel());
    }

    @Test
    public void mp3PlayerVolumeCanBeDecreasedTest(){
        sony.turnOn();

        sony.volumeUp();
        sony.volumeUp();
        sony.volumeUp();
        sony.volumeUp();

        sony.volumeDown();
        sony.volumeDown();

        assertEquals(7, sony.getVolumeLevel());
    }

    @Test
    public void mp3PlayerVolumeCannotBeChangedWhileOffTest(){

        sony.volumeUp();
        sony.volumeUp();
        sony.volumeUp();

        sony.volumeDown();

        assertEquals(0, sony.getVolumeLevel());
    }

    @Test
    public void mp3VolumeCannotBeIncreasedBeyond25Test(){
        sony.turnOn();

        sony.volumeUp();
        sony.volumeUp();
        sony.volumeUp();
        sony.volumeUp();
        sony.volumeUp();
        sony.volumeUp();
        sony.volumeUp();
        sony.volumeUp();
        sony.volumeUp();
        sony.volumeUp();
        sony.volumeUp();
        sony.volumeUp();
        sony.volumeUp();
        sony.volumeUp();
        sony.volumeUp();
        sony.volumeUp();
        sony.volumeUp();
        sony.volumeUp();
        sony.volumeUp();
        sony.volumeUp();

        sony.volumeUp();
        sony.volumeUp();

        assertEquals(25, sony.getVolumeLevel());
    }

    @Test
    public void mp3VolumeCannotBeDecreasedBelow0Test(){
        sony.turnOn();

        sony.volumeDown();
        sony.volumeDown();
        sony.volumeDown();
        sony.volumeDown();
        sony.volumeDown();
        sony.volumeDown();

        assertEquals(0, sony.getVolumeLevel());
    }

    @Test
    public void mp3PlayerCanPlaySongTest(){
        sony.turnOn();
        assertFalse(sony.isPlaying());

        sony.playSong();

        assertTrue(sony.isPlaying());
    }

    @Test
    public void mp3PlayerCannotPlaySongWhileOffTest(){
        sony.playSong();

        assertFalse(sony.isPlaying());
    }

    @Test
    public void mp3PlayerCanPauseSongTest(){
        assertFalse(sony.isPlaying());
    }
}