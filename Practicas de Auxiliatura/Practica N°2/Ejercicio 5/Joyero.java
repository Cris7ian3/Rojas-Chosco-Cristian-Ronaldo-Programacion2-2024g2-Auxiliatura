public class Joyero {
    private int[][] original;

    public Joyero(int[][] original) {
        this.original = original;
    }

    public int[][] rotateCounterClockwise() {
        int N = original.length;
        int[][] rotated = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                rotated[N - j - 1][i] = original[i][j];
            }
        }
        return rotated;
    }

    public boolean isEqual(int[][] matrix) {
        for (int i = 0; i < original.length; i++) {
            for (int j = 0; j < original.length; j++) {
                if (original[i][j] != matrix[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}