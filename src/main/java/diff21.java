public class diff21 {
    public int diff21(int n) {
        if (n > 21) {
            return (n - 21) * 2;
        } else {
            return 21 - n;
        }
    }
}

// we check if n is greater than 21, and if so we subtract 21 from it and double it
// if it's less than 21, we subtract it from 21
// by changing the order of n and 21 in each case, we get the absolute value