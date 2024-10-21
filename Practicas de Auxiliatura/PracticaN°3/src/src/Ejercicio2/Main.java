package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        // Crear un personaje
        Personaje personaje = new Personaje("Guerrero", 5, 100);

        // Mostrar el estado inicial del personaje y su inventario
        personaje.mostrarEstado();

        // Agregar ítems al inventario del personaje
        personaje.agregarItemAlInventario("Espada");
        personaje.agregarItemAlInventario("Escudo");
        personaje.agregarItemAlInventario("Poción de vida");

        // Mostrar el estado después de agregar ítems
        System.out.println("Después de agregar ítems:");
        personaje.mostrarEstado();

        // El personaje recibe daño
        personaje.recibirDaño(30);
        System.out.println("Después de recibir daño:");
        personaje.mostrarEstado();

        // El personaje se cura
        personaje.curar();
        System.out.println("Después de curarse:");
        personaje.mostrarEstado();
    }
}
