import java.util.List;

public class PalabraCounter {

    public static int contarPalabrasConLetra(List<String> palabras, char letra) {
        int contador = 0;
        letra = Character.toLowerCase(letra); 

        for (String palabra : palabras) {
            if (!palabra.isEmpty() && Character.toLowerCase(palabra.charAt(0)) == letra) {
                contador++;
            }
        }

        return contador;
    }
}