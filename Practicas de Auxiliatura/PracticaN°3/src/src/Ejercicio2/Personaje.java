package Ejercicio2;

public class Personaje {
    // Atributos de la clase
    private String nombre;
    private int nivel;
    private int puntosDeVida;
    private Inventario inventario; // Atributo de tipo Inventario

    // Constructor para inicializar el personaje con su inventario
    public Personaje(String nombre, int nivel, int puntosDeVida) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosDeVida = puntosDeVida;
        this.inventario = new Inventario(); // Inicializar el inventario
    }

    // Método para mostrar el estado del personaje
    public void mostrarEstado() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Nivel: " + nivel);
        System.out.println("Puntos de vida: " + puntosDeVida);
        inventario.mostrarItems(); // Mostrar los ítems del inventario
    }

    // Método para recibir daño
    public void recibirDaño(int daño) {
        if (daño > 0) {
            puntosDeVida -= daño;
            if (puntosDeVida < 0) {
                puntosDeVida = 0;
            }
        }
    }

    // Método para curar al personaje
    public void curar() {
        puntosDeVida += 20;
    }

    // Método para agregar un ítem al inventario
    public void agregarItemAlInventario(String item) {
        inventario.agregarItem(item);
    }

    // Getters (opcional)
    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }
}
