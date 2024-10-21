package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Personaje personaje = new Personaje("Guerrero", 5, 100);

        personaje.mostrarEstado();

        personaje.recibirDaño(30);
        System.out.println("Después de recibir daño:");
        personaje.mostrarEstado();

        personaje.curar();
        System.out.println("Después de curarse:");
        personaje.mostrarEstado();
    }
}
