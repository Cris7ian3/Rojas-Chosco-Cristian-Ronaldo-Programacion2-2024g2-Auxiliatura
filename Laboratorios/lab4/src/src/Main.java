public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        
        // Agregar productos electrónicos
        store.addProduct(new Electronic("Laptop", 1000.0));
        store.addProduct(new Electronic("Smartphone", 500.0));

        // Agregar accesorios
        store.addProduct(new Accessory("Mouse", 25.0));
        store.addProduct(new Accessory("Keyboard", 45.0));
        store.addProduct(new Accessory("Headphones", 100.0));

        // Verificar que los productos se han agregado correctamente
        System.out.println("Productos añadidos a la tienda:");
        for (Product product : store.getProducts()) {
            System.out.println("Producto: " + product.getName() + ", Precio: " + product.getPrice());
        }

        // Aplicar descuento del 10%
        Discountable tenPercentDiscount = product -> product.getPrice() * 0.9;
        System.out.println("\nAplicando 10% de descuento:");
        store.applyDiscount(tenPercentDiscount);

        // Aplicar descuento fijo de $50
        Discountable fiftyDollarsDiscount = product -> product.getPrice() - 50.0;
        System.out.println("\nAplicando descuento fijo de $50:");
        store.applyDiscount(fiftyDollarsDiscount);

        // Aplicar descuento variable según el precio del producto (15% para productos > $100, 5% para los demás)
        Discountable variableDiscount = product -> {
            if (product.getPrice() > 100.0) {
                return product.getPrice() * 0.85;
            } else {
                return product.getPrice() * 0.95;
            }
        };
        System.out.println("\nAplicando descuento variable:");
        store.applyDiscount(variableDiscount);

        // Aplicar un descuento combinado (10% y $20 adicional)
        Discountable combinedDiscount = product -> (product.getPrice() * 0.9) - 20.0;
        System.out.println("\nAplicando descuento combinado (10% y $20):");
        store.applyDiscount(combinedDiscount);
    }
}
