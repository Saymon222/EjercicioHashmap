import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        Agenda agenda = new Agenda();
        int opcion;
        //SIMÓN PINZÓN ALGARRA
        //938508

        do {
            // Menú de opciones
            System.out.println("\n--- Agenda de Contactos ---");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Eliminar contacto");
            System.out.println("4. Mostrar todos los contactos");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = lectura.nextInt();
            lectura.nextLine();  // Limpiar el buffer del scanner

            switch (opcion) {
                case 1:
                    // Opción para agregar un contacto
                    System.out.print("Ingrese el nombre del contacto: ");
                    String nombre = lectura.nextLine();
                    System.out.print("Ingrese el teléfono del contacto: ");
                    String telefono = lectura.nextLine();
                    agenda.agregarContacto(nombre, telefono);
                    break;
                case 2:
                    // Opción para buscar un contacto
                    System.out.print("Ingrese el nombre del contacto a buscar: ");
                    nombre = lectura.nextLine();
                    agenda.buscarContacto(nombre);
                    break;
                case 3:
                    // Opción para eliminar un contacto
                    System.out.print("Ingrese el nombre del contacto a eliminar: ");
                    nombre = lectura.nextLine();
                    agenda.eliminarContacto(nombre);
                    break;
                case 4:
                    // Opción para mostrar todos los contactos
                    agenda.mostrarContactos();
                    break;
                case 5:
                    // Salir del programa
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida, intente nuevamente.");
            }
        } while (opcion != 5);

        lectura.close();
    }
}
