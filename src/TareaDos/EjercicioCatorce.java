package TareaDos;

public class EjercicioCatorce {
    public static void main(String[] args) {
        System.out.print("Introduce un número: ");
        int n = Integer.parseInt(System.console().readLine());
        if (n % 2 == 0) System.out.println("Es par");
        else System.out.println("No es par");
        if (n % 5 == 0) System.out.println("Es divisible entre 5");
        else System.out.println("No es divisible entre 5");
    }
}
