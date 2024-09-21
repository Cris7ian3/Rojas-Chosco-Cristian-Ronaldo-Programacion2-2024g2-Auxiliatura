import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BotinGenerator botinGenerator = new BotinGenerator();
        List<Map<String, Object>> botinObtenido = new ArrayList<>();

        System.out.println("¡Bienvenido al juego de Borderlands! Prepárate para enfrentarte a enemigos y conseguir botín.");

        while (true) {
            System.out.println("\nDerrotaste a un enemigo y tienes la oportunidad de conseguir botín...");
            Map<String, Object> botin = botinGenerator.generarBotin();
            botinObtenido.add(botin);

            System.out.println("¡Has encontrado un botín!");
            System.out.println("Tipo: " + botin.get("tipo"));
            System.out.println("Rareza: " + botin.get("rareza"));

            if (botin.get("tipo").equals("Arma")) {
                System.out.println("Daño: " + botin.get("daño"));
                System.out.println("Rango: " + botin.get("rango"));
            } else if (botin.get("tipo").equals("Escudo")) {
                System.out.println("Capacidad de absorción: " + botin.get("capacidad_absorcion"));
                System.out.println("Durabilidad: " + botin.get("durabilidad"));
            } else if (botin.get("tipo").equals("Modificador")) {
                System.out.println("Mejora de habilidad: " + botin.get("mejora_habilidad"));
                System.out.println("Duración: " + botin.get("duracion"));
            }

            System.out.print("¿Quieres enfrentarte a más enemigos? (sí/no): ");
            String respuesta = scanner.nextLine();

            if (respuesta.equalsIgnoreCase("no")) {
                break;
            }
        }

        System.out.println("\nResumen del botín obtenido:");
        for (Map<String, Object> botin : botinObtenido) {
            System.out.println("Tipo: " + botin.get("tipo") + ", Rareza: " + botin.get("rareza"));
        }

        scanner.close();
    }
}