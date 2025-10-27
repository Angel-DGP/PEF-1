package TareaDos;

public class EjercicioSiete {
    public static void main(String[] args) {
        System.out.print("Introduce la primera nota: ");
        double n1 = Double.parseDouble(System.console().readLine());
        System.out.print("Introduce la segunda nota: ");
        double n2 = Double.parseDouble(System.console().readLine());
        System.out.print("Introduce la tercera nota: ");
        double n3 = Double.parseDouble(System.console().readLine());
        double media = (n1 + n2 + n3) / 3;
        System.out.println("La media es: " + media);
    }
}
