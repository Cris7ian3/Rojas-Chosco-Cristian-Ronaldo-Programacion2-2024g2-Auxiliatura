import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class BotinGenerator {
    private static final String[] TIPOS = {"Arma", "Escudo", "Modificador"};
    private static final String[] RAREZAS = {"Común", "Poco Común", "Raro", "Épico", "Legendario"};

    private Random random;

    public BotinGenerator() {
        this.random = new Random();
    }

    public Map<String, Object> generarBotin() {
        Map<String, Object> botin = new HashMap<>();
        
        String tipo = TIPOS[random.nextInt(TIPOS.length)];
        botin.put("tipo", tipo);

        String rareza = RAREZAS[random.nextInt(RAREZAS.length)];
        botin.put("rareza", rareza);

        switch (tipo) {
            case "Arma":
                botin.put("daño", random.nextInt(50) + 10); 
                botin.put("rango", random.nextInt(100) + 1);
                break;

            case "Escudo":
                botin.put("capacidad_absorcion", random.nextInt(100) + 20); 
                botin.put("durabilidad", random.nextInt(50) + 10);
                break;

            case "Modificador":
                botin.put("mejora_habilidad", random.nextInt(20) + 1); 
                botin.put("duracion", random.nextInt(30) + 5); 
                break;
        }

        return botin;
    }
}