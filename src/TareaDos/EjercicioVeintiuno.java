package TareaDos;

public class EjercicioVeintiuno {
    public static void main(String[] args) {
        System.out.print("Nota del primer control: ");
        double nota1 = Double.parseDouble(System.console().readLine());
        System.out.print("Nota del segundo control: ");
        double nota2 = Double.parseDouble(System.console().readLine());
        double media = (nota1 + nota2) / 2;

        if (media >= 5) {
            System.out.println("Tu nota de Programación es " + media);
        } else {
            System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
            String recu = System.console().readLine().toLowerCase();
            if (recu.equals("apto")) System.out.println("Tu nota de Programación es 5");
            else System.out.println("Tu nota de Programación es " + media);
        }
    }
}
