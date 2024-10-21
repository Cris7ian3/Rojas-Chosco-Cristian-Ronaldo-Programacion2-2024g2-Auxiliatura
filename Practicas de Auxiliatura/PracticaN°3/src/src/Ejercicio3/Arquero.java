package Ejercicio3;

public class Arquero extends Personaje {
    private int destreza;

    public Arquero(String nombre, int nivel, int puntosDeVida, int destreza) {
        super(nombre, nivel, puntosDeVida); // Llamar al constructor de la clase base
        this.destreza = destreza; // Inicializar el atributo destreza
    }

    public void dispararFlecha() {
        System.out.println(getNombre() + " ha disparado una flecha con destreza de " + destreza);
    }

    @Override
    public void mostrarEstado() {
        super.mostrarEstado();
        System.out.println("Destreza: " + destreza);
    }
}