public class Main {
    public static void main(String[] args) {

        Dispositivo dispositivo1 = new Dispositivo();
        Dispositivo dispositivo2 = new Dispositivo();


        dispositivo1.nombre = "Laptop";
        dispositivo1.tipo = "Computadora";
        dispositivo1.activo = true;

        dispositivo2.nombre = "Impresora";
        dispositivo2.tipo = "Periférico";
        dispositivo2.activo = false;


        System.out.println("Dispositivo 1");
        dispositivo1.mostrarInformacion();
        dispositivo1.mostrarEstado();


        System.out.println("Dispositivo 2");
        dispositivo2.mostrarInformacion();
        dispositivo2.mostrarEstado();


        dispositivo1.activo = false;


        dispositivo1.mostrarInformacion();

        
        System.out.println("Dispositivo 2  después del cambio");
        dispositivo2.mostrarInformacion();

        }


}