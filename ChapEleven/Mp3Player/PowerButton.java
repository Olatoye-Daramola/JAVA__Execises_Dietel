package Mp3Player;

import static Mp3Player.PowerButtonPosition.*;

public class PowerButton {
    private PowerButtonPosition buttonPosition = OFF;

    public PowerButtonPosition getPowerState() {
        return buttonPosition;
    }

    public void switchMp3PowerTo(PowerButtonPosition powerState) {
        buttonPosition = powerState;
    }
}
