public class EjerciciosTema4 {
    public static void main(String[] args) {
        compararNumero(1);
        compararNumero(0);
        compararNumero(-1);

        miWhile(0);

        miDoWhile(2);

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("FOR: " + numeroFor);
        }

        miSwitch("spring");
        miSwitch("summer");
        miSwitch("fall");
        miSwitch("winter");
    }

    public static void compararNumero(int numeroIf) {
        if (numeroIf > 0) {
            System.out.println("IF: Es mayor a 0");
        }
        if (numeroIf == 0) {
            System.out.println("IF: Es 0");
        }
        if (numeroIf < 0) {
            System.out.println("IF: Es menor a 0");
        }
    }

    public static void miWhile(int numeroWhile) {
        while (numeroWhile < 3) {
            System.out.println("WHILE: " + numeroWhile);
            numeroWhile++;
        }
    }

    public static void miDoWhile(int numeroDoWhile) {
        do {
            System.out.println("DO-WHILE: " + numeroDoWhile);
            numeroDoWhile++;
        } while (numeroDoWhile < 3);
    }

    public static void miSwitch(String estacion) {
        switch (estacion) {
            case "spring":
                System.out.println("SWITCH: Es primavera");
                break;
            case "summer":
                System.out.println("SWITCH: Es verano");
                break;
            case "fall":
                System.out.println("SWITCH: Es otoño");
                break;
            case "winter":
                System.out.println("SWITCH: Es invierno");
                break;

            default:
                System.out.println("SWITCH: No es una estación");
                break;
        }
    }

}
