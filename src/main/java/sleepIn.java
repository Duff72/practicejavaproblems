public class sleepIn {
    public boolean sleepIn(boolean weekday, boolean vacation) {
    if (!weekday || vacation) {
        return true;
    }

    return false;

}
}

// the code checks if is not a weekday or a vacation
// if those conditions are met, the boolean sleepIn is true
// otherwise it is false