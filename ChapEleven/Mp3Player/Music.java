package Mp3Player;

import java.sql.Time;

public class Music {
    private String name;
    private int trackNumber;
    private Time lengthInSeconds;

    Music(String name, int trackNumber, Time lengthInSeconds) {
        this.name = name;
        this.trackNumber = trackNumber;
        this.lengthInSeconds = lengthInSeconds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
    }

    public Time getLengthInSeconds() {
        return lengthInSeconds;
    }

    public void setLengthInSeconds(Time lengthInSeconds) {
        this.lengthInSeconds = lengthInSeconds;
    }
}
