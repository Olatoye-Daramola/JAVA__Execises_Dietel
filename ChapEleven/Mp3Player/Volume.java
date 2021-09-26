package Mp3Player;

public class Volume {
    private int volume = 25;

    public int getVolume() {
        return volume;
    }

    public void increaseVolume() {
        boolean isLimit = volume < 100;
        if (isLimit) {
            volume += 5;
        } else {
            volume = 100;
        }
    }

    public void decreaseVolume() {
        boolean isLimit = volume > 0;
        if (isLimit) {
            volume -= 5;
        } else {
            volume = 0;
        }
    }
}
