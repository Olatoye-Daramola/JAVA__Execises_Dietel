package TryoutsAgain;

import static TryoutsAgain.PenPosition.UP;

public class Pen {
    private PenPosition penPosition = UP;

//    public Pen() {
//        penPosition = PenPosition.UP;
//    }

    public PenPosition getPosition() {
        return penPosition;
    }

    public void setPositionTo(PenPosition currentPosition) {
        penPosition = currentPosition;
    }
}
