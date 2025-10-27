package TareaDos;

public class EjercicioDiecisiete {
    public static void main(String[] args) {
        System.out.print("Introduce un número entero: ");
        int n = Integer.parseInt(System.console().readLine());
        int ultima = Math.abs(n % 10);
        System.out.println("La última cifra es: " + ultima);
    }
}
