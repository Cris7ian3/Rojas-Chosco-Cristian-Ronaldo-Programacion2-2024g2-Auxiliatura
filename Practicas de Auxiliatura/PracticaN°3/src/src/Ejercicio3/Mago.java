package Ejercicio3;

public class Mago extends Personaje {
    private int mana;

    public Mago(String nombre, int nivel, int puntosDeVida, int mana) {
        super(nombre, nivel, puntosDeVida);
        this.mana = mana;
    }

    public void lanzarHechizo() {
        System.out.println(getNombre() + " ha lanzado un hechizo. Mana restante: " + mana);
    }

    @Override
    public void mostrarEstado() {
        super.mostrarEstado();
        System.out.println("Mana: " + mana);
    }
}