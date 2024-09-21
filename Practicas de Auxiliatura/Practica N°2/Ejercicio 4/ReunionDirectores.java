public class ReunionDirectores {

    public static int calcularTiempoMaximoPorDiscurso(int N, int K) {

        return (K - (N - 1)) / N;
    }
}