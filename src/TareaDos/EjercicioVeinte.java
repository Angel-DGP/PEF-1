package TareaDos;

public class EjercicioVeinte {
    public static void main(String[] args) {
        System.out.print("Introduce un número positivo (hasta 5 cifras): ");
        int n = Integer.parseInt(System.console().readLine());
        String s = Integer.toString(n);
        String invertido = new StringBuilder(s).reverse().toString();
        if (s.equals(invertido)) System.out.println("Es capicúa");
        else System.out.println("No es capicúa");
    }
}
