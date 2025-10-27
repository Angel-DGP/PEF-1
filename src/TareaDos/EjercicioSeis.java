package TareaDos;

public class EjercicioSeis {
    public static void main(String[] args) {
        System.out.print("Introduce la altura (m): ");
        double h = Double.parseDouble(System.console().readLine());
        double g = 9.81;
        double t = Math.sqrt((2 * h) / g);
        System.out.println("El objeto tarda " + t + " segundos en caer.");
    }
}
