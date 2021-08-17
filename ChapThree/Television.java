package TryOuts;

public class Television {
    private boolean isOn;
    private int channelNumber;
    private int volume;


    public Television(){
        channelNumber = 25;
        volume = 2;
    }

    public void setOn(boolean powerButton) {
        isOn = powerButton;
    }

    public boolean isOn() {
        return isOn;
    }

    public void nextChannel() {
        channelNumber++;
    }

    public void previousChannel() {
        channelNumber--;
    }

    public void setChannelNumber(int channelNumber) {
        this.channelNumber = channelNumber;
    }

    public int getChannelNumber() {
        return channelNumber;
    }

    public void volumeUp(){
        if(volume > 100){volume = 100;}
        if(volume < 100){volume++;}
    }

    public void volumeDown() {
        if(volume < 0){volume = 0;}
        if(volume > 0){volume--;}
    }

    public int getVolumeLevel(){
            return volume;
    }


    public void setMute(boolean muteButton) {
        if(muteButton) { volume = 0;}
    }
}