import java.util.HashMap;
import java.util.Map;

public class FechaConverter {

    private static boolean esFechaValida(int dia, int mes, int anio) {
      
        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (mes == 2 && (anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0))) {
            diasPorMes[1] = 29;
        }

        return mes >= 1 && mes <= 12 && dia >= 1 && dia <= diasPorMes[mes - 1];
    }

    public static String convertirFecha(String fechaStr) {
        String[] partes = fechaStr.split(" de ");
        int dia = Integer.parseInt(partes[0].trim());
        String[] mesAnio = partes[1].trim().split(", ");
        String mesStr = mesAnio[0].trim().toLowerCase();
        int anio = Integer.parseInt(mesAnio[1].trim());

        Map<String, Integer> meses = new HashMap<>();
        meses.put("enero", 1);
        meses.put("febrero", 2);
        meses.put("marzo", 3);
        meses.put("abril", 4);
        meses.put("mayo", 5);
        meses.put("junio", 6);
        meses.put("julio", 7);
        meses.put("agosto", 8);
        meses.put("septiembre", 9);
        meses.put("octubre", 10);
        meses.put("noviembre", 11);
        meses.put("diciembre", 12);

        Integer mes = meses.get(mesStr);

        if (mes == null) {
            return "Mes no válido";
        }

        if (esFechaValida(dia, mes, anio)) {
            return String.format("%d / %02d / %d", dia, mes, anio);
        } else {
            return "Fecha no válida";
        }
    }
}