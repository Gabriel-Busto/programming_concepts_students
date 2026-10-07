package basics;

import java.util.Arrays;

public class Pascal {

    /**
     * Computes the nth row of Pascal triangle iteratively.
     * Uses the additive property to avoid factorial overflow.
     *
     * @param n > 0
     * @return the nth row of Pascal triangle
     */
    public static int[] pascal(int n) {
        int[] result = new int[n];
        result[0] = 1;

        // Build each row from 2 to n
        for (int row = 2; row <= n; row++) {
            // Update from right to left to reuse the same array
            for (int i = row - 2; i > 0; i--) {
                result[i] = result[i] + result[i - 1];
            }
            result[row - 1] = 1;
        }

        return result;
    }
}