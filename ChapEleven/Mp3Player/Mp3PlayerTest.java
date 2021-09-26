package Mp3Player;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Mp3PlayerTest {
    Mp3Player sony;
    PowerButton powerButton;

    @BeforeEach
    public void setUp() {
        sony = new Mp3Player();
        powerButton = sony.switchButton();
    }

    @Test
    public void testThatMp3PlayerHasPowerSwitch(){
        assertNotNull(sony.switchButton());
    }

    @Test
    public void testThatMp3IsOffByDefault(){
        assertEquals(powerButton.);
    }
}