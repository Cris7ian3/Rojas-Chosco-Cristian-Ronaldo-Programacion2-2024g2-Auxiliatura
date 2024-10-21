package Ejercicio1;

public class Personaje {
    private String nombre;
    private int nivel;
    private int puntosDeVida;

    public Personaje(String nombre, int nivel, int puntosDeVida) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosDeVida = puntosDeVida;
    }

    public void mostrarEstado() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Nivel: " + nivel);
        System.out.println("Puntos de vida: " + puntosDeVida);
    }

    public void recibirDaño(int daño) {
        if (daño > 0) {
            puntosDeVida -= daño;
            if (puntosDeVida < 0) {
                puntosDeVida = 0;
            }
        }
    }

    public void curar() {
        puntosDeVida += 20;
    }

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

