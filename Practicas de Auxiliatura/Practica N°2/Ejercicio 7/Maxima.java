public class Maxima {
    public static int[] maximizar(int[] numbers) {
        int N = numbers.length;
        final int BITS = 30;

        int[][] bitMatrix = new int[BITS][N];

        for (int j = 0; j < N; j++) {
            for (int k = 0; k < BITS; k++) {
                bitMatrix[k][j] = (numbers[j] >> k) & 1;
            }
        }


        for (int k = BITS - 1; k >= 0; k--) {
            
            int countOnes = 0;
            for (int j = 0; j < N; j++) {
                countOnes += bitMatrix[k][j];
            }


            for (int j = 0; j < countOnes; j++) {
                bitMatrix[k][j] = 1;
            }

 
            for (int j = countOnes; j < N; j++) {
                bitMatrix[k][j] = 0;
            }
        }

        int[] result = new int[N];
        for (int j = 0; j < N; j++) {
            for (int k = 0; k < BITS; k++) {
                if (bitMatrix[k][j] == 1) {
                    result[j] |= (1 << k);
                }
            }
        }

        return result;
    }
}