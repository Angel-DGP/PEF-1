package TareaDos;

public class EjercicioDieciocho {
    public static void main(String[] args) {
        System.out.print("Introduce un número (hasta 5 cifras): ");
        int n = Math.abs(Integer.parseInt(System.console().readLine()));
        while (n >= 10) n /= 10;
        System.out.println("La primera cifra es: " + n);
    }
}
