public class Dispositivo {
    public String nombre;
    public boolean activo;


    String tipo;


    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Estado: " + (activo ? "Activo" : "Inactivo"));
    }


    void mostrarEstado() {
        System.out.println("Estado de " + nombre + ": " + (activo ? "Activo" : "Inactivo"));
    }

    public void activar() {
        activo = true;
        System.out.println(nombre + " ha sido activado.");
    }

}