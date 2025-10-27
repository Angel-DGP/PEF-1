package TareaDos;

public class EjercicioVeintiocho {
    public static void main(String[] args) {
        System.out.print("Turno del jugador 1 (piedra, papel o tijera): ");
        String j1 = System.console().readLine().toLowerCase();
        System.out.print("Turno del jugador 2 (piedra, papel o tijera): ");
        String j2 = System.console().readLine().toLowerCase();

        if (!(j1.equals("piedra") || j1.equals("papel") || j1.equals("tijera")) ||
                !(j2.equals("piedra") || j2.equals("papel") || j2.equals("tijera"))) {
            System.out.println("Error: opción no válida");
        } else if (j1.equals(j2)) {
            System.out.println("Empate");
        } else if ((j1.equals("piedra") && j2.equals("tijera")) ||
                (j1.equals("tijera") && j2.equals("papel")) ||
                (j1.equals("papel") && j2.equals("piedra"))) {
            System.out.println("Gana el jugador 1");
        } else {
            System.out.println("Gana el jugador 2");
        }
    }
}
