public class EjerciciosTema3 {
    public static void main(String[] args) {
        sumar3Numeros(1, 2, 3);

        Coche coche = new Coche();
        coche.agregarPuerta();

        System.out.println(coche.puertas);
    }

    public static void sumar3Numeros(int primerNumero, int segundoNumero, int tercerNumero) {
        int suma = primerNumero + segundoNumero + tercerNumero;
        System.out.println(suma);
    }
}

class Coche {
    public int puertas = 2;

    public void agregarPuerta() {
        puertas++;
    }
}