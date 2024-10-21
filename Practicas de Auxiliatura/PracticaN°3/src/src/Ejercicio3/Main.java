package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        Mago mago = new Mago("Merlín", 10, 80, 100);
        mago.mostrarEstado();
        mago.lanzarHechizo();

        System.out.println();

        Arquero arquero = new Arquero("Robin", 8, 70, 85);
        arquero.mostrarEstado();
        arquero.dispararFlecha();

        System.out.println();

        Guerrero guerrero = new Guerrero("Conan", 12, 120, 150);
        guerrero.mostrarEstado();
        guerrero.atacar();
    }
}
