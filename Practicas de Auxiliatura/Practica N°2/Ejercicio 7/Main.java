import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] numbers = new int[N];


        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }


        int[] result = Maxima.maximizar(numbers);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();

        scanner.close();
    }
}