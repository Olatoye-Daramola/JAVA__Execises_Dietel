package Mp3Player;

public class PowerButton {
    private PowerButtonPosition buttonPosition = PowerButtonPosition.OFF;

    public PowerButtonPosition getPowerState() {
        return buttonPosition;
    }

    public void setPowerSwitchState(PowerButtonPosition powerState) {
        buttonPosition = powerState;
    }
}
