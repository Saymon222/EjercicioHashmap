import java.util.HashMap;

public class Agenda {
    private HashMap<String, Contacto> contactos;

    public Agenda() {
        contactos = new HashMap<>();
    }

    // Metodo para agregar un contacto a la agenda
    public void agregarContacto(String nombre, String telefono) {
        if (contactos.containsKey(nombre)) {
            System.out.println("El contacto ya existe.");
        } else {
            Contacto contacto = new Contacto(nombre, telefono);
            contactos.put(nombre, contacto);
            //Metodo put: Si la clave no existe, añade un nuevo par clave-valor. Si ya existe, reemplaza el valor asociado a esa clave.
            System.out.println("Contacto agregado exitosamente.");
        }
    }

    // Metodo para buscar un contacto por nombre
    public void buscarContacto(String nombre) {
        if (contactos.containsKey(nombre)) {
            System.out.println(contactos.get(nombre));
        } else {
            System.out.println("El contacto no existe.");
        }
    }

    // Metodo para eliminar un contacto por nombre
    public void eliminarContacto(String nombre) {
        if (contactos.containsKey(nombre)) {
            contactos.remove(nombre);
            System.out.println("Contacto eliminado.");
        } else {
            System.out.println("El contacto no existe.");
        }
    }

    // Metodo para mostrar todos los contactos
    public void mostrarContactos() {
        if (contactos.isEmpty()) {
            System.out.println("No hay contactos.");
        } else {
            for (Contacto contacto : contactos.values()) {
                System.out.println(contacto);
            }
        }
    }
}
