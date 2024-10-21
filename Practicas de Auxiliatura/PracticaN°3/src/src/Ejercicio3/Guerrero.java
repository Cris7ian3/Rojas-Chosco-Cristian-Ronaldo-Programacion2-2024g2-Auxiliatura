package Ejercicio3;

public class Guerrero extends Personaje {
    private int fuerza;

    public Guerrero(String nombre, int nivel, int puntosDeVida, int fuerza) {
        super(nombre, nivel, puntosDeVida); // Llamar al constructor de la clase base
        this.fuerza = fuerza; // Inicializar el atributo fuerza
    }

    public void atacar() {
        System.out.println(getNombre() + " ha realizado un ataque con fuerza de " + fuerza);
    }

    @Override
    public void mostrarEstado() {
        super.mostrarEstado();
        System.out.println("Fuerza: " + fuerza);
    }
}