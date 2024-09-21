import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // número de directores
        int N = scanner.nextInt();
        // duración máxima de la reunión
        int K = scanner.nextInt();

        //  calcular el tiempo máximo por discurso
        int tiempoMaximoPorDiscurso = ReunionDirectores.calcularTiempoMaximoPorDiscurso(N, K);

     
        System.out.println(tiempoMaximoPorDiscurso);
        
        scanner.close();
    }
}