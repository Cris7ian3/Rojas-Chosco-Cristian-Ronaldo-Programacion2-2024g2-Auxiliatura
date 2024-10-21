package Ejercicio2;

import java.util.ArrayList;

public class Inventario {
    private ArrayList<String> items;
    public Inventario() {
        items = new ArrayList<>();
    }

    public void agregarItem(String item) {
        items.add(item);
    }

    public void mostrarItems() {
        if (items.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            System.out.println("Inventario del personaje:");
            for (String item : items) {
                System.out.println("- " + item);
            }
        }
    }
}