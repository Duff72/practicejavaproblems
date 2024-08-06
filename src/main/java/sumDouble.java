public class sumDouble {
    public int sumDouble(int a, int b) {

    int sum = a + b;


    if (a == b) {
        sum = sum * 2;
    }

    return sum;
}
}

// first we define sum as the sum of a and b
// then we check if they are equal, and if so we mulitply by 2,
// finally we return sum