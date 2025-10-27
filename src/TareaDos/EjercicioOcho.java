package TareaDos;

public class EjercicioOcho {
    public static void main(String[] args) {
        System.out.print("Introduce la primera nota: ");
        double n1 = Double.parseDouble(System.console().readLine());
        System.out.print("Introduce la segunda nota: ");
        double n2 = Double.parseDouble(System.console().readLine());
        System.out.print("Introduce la tercera nota: ");
        double n3 = Double.parseDouble(System.console().readLine());
        double media = (n1 + n2 + n3) / 3;
        System.out.println("Media: " + media);
        if (media < 5) System.out.println("Insuficiente");
        else if (media < 6) System.out.println("Suficiente");
        else if (media < 7) System.out.println("Bien");
        else if (media < 9) System.out.println("Notable");
        else System.out.println("Sobresaliente");
    }
}
