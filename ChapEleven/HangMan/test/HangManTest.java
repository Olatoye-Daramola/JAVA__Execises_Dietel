package HangMan.test;

import HangMan.src.HangMan;
import org.junit.jupiter.api.Test;

class HangManTest {
    HangMan hangMan = new HangMan();

    @Test
    void testThatHangManHasAHangingPlatform() {
        String platform = """
                ⸺⸺⸺⸺⸺
                ‖
                ‖
                ‖
                ‖
                ‖
                ⸺⸺⸺⸺⸺
                """;
//        assertEquals(platform, hangMan.displayPlatform());
    }
}