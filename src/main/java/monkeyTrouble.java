public class monkeyTrouble {
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if ((aSmile && bSmile) || (!aSmile && !bSmile)) {
            return true;
        }
        return false;

    }
}

// if they are both smiling or neither is smiling, the boolean monkeyTrouble returns true
// the only other possibility is that one is smiling and the other is not,
// so it returns false