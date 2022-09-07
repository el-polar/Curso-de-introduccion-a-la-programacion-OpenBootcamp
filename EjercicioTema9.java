public class EjercicioTema9 {
    public static void main(String[] args) {
        Cliente miCliente = new Cliente();
        miCliente.edad = 20;
        miCliente.nombre = "Polar";
        miCliente.telefono = "123-123-123-123";
        miCliente.credito = 2000;

        System.out.println("Cliente edad: " + miCliente.edad);
        System.out.println("Cliente nombre: " + miCliente.nombre);
        System.out.println("Cliente telefono: " + miCliente.telefono);
        System.out.println("Cliente credito: " + miCliente.credito);

        Trabajador miTrabajador = new Trabajador();
        miTrabajador.edad = 30;
        miTrabajador.nombre = "Pardo";
        miTrabajador.telefono = "321-321-321-321";
        miTrabajador.salario = 3000;

        System.out.println("Trabajador edad: " + miTrabajador.edad);
        System.out.println("Trabajador nombre: " + miTrabajador.nombre);
        System.out.println("Trabajador telefono: " + miTrabajador.telefono);
        System.out.println("Trabajador salario: " + miTrabajador.salario);
    }
}

class Persona {
    public int edad;
    public String nombre;
    public String telefono;
}

class Cliente extends Persona {
    double credito;
}

class Trabajador extends Persona {
    double salario;
}