import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese fechas en el formato 'día de mes, año'. Escriba 'salir' para terminar.");

        while (true) {
            System.out.print("Ingrese una fecha: ");
            String fecha = scanner.nextLine();

            if (fecha.equalsIgnoreCase("salir")) {
                break;
            }

            String resultado = FechaConverter.convertirFecha(fecha);
            System.out.println(resultado);
        }

        scanner.close();
    }
}