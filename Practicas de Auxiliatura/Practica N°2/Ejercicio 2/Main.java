import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> palabras = Arrays.asList("manzana", "banana", "melón", "mora", "naranja", "mandarina", "papaya");

        System.out.print("Ingrese una letra: ");
        char letra = scanner.nextLine().charAt(0);

        int cantidad = PalabraCounter.contarPalabrasConLetra(palabras, letra);
        System.out.println("Cantidad de palabras que comienzan con '" + letra + "': " + cantidad);

        scanner.close();
    }
}