import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            //tamaño de la matriz
            int N = scanner.nextInt();
            int[][] original = new int[N][N];

            // matriz original
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    original[i][j] = scanner.nextInt();
                }
            }

            Joyero joyero = new Joyero(original);
            int rotations = 0;


            for (int i = 0; i < 4; i++) {
                if (i > 0) {

                    original = joyero.rotateCounterClockwise();
                }

                if (joyero.isEqual(original)) {
                    System.out.println(rotations);
                    return;
                }
                rotations++;
            }

            System.out.println(rotations);
            scanner.close();
        }
    }
}