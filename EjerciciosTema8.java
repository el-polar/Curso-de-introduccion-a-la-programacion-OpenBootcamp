public class EjerciciosTema8 {
    public static void main(String[] args) {
        Persona miPersona = new Persona();
        miPersona.setEdad(20);
        miPersona.setNombre("Polar");
        miPersona.setTelefono("123-123-123-123");

        System.out.println("Edad: " + miPersona.getEdad());
        System.out.println("Nombre: " + miPersona.getNombre());
        System.out.println("Teléfono: " + miPersona.getTelefono());
    }

}

class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
