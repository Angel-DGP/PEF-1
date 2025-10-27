package TareaDos;

public class EjercicioDiecinueve {
    public static void main(String[] args) {
        System.out.print("Introduce un número (hasta 5 dígitos): ");
        int n = Math.abs(Integer.parseInt(System.console().readLine()));
        int digitos = (n == 0) ? 1 : (int) Math.log10(n) + 1;
        System.out.println("El número tiene " + digitos + " dígitos.");
    }
}
