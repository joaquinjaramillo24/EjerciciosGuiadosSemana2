public class Producto {
    public String nombre;
    public double precio;
    String categoria;

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Categoría: " + categoria);
    }

    void mostrarCategoria() {
        System.out.println("Categoría: " + categoria);
    }

    public void mostrarPrecio() {
        System.out.println("Precio de " + nombre + ": $" + precio);
    }
}
