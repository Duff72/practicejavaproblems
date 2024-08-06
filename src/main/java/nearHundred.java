public class nearHundred {
    public boolean nearHundred(int n) {
    if ((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10)) {
        return true;
    }
    return false;
}
}

// if 100 or 200 minus n equals any number between -10 and 10, it returns true