public class posNeg {
    public boolean posNeg(int a, int b, boolean negative) {
        if (negative == true) {
            return (a < 0 && b < 0);
        }
        else {
            return ((a < 0 && b > 0) || (a > 0 && b < 0));
        }
    }
}

// first we check if the negative parameter is true, then we return true only if both numbers are negative
// else we return true only if one number is positive AND the other is negative