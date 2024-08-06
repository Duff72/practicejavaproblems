public class parrotTrouble {
        public boolean parrotTrouble(boolean talking, int hour) {
    if ((hour > 20 || hour < 7) && talking) {
        return true;
    }
    return false;

}
}

// if int hour is more than 20 or less than 7 AND the parrot is talking, it returns true