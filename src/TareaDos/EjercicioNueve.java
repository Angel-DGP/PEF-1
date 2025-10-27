package TareaDos;

public class EjercicioNueve {
    public static void main(String[] args) {
        System.out.print("Introduce a: ");
        double a = Double.parseDouble(System.console().readLine());
        System.out.print("Introduce b: ");
        double b = Double.parseDouble(System.console().readLine());
        System.out.print("Introduce c: ");
        double c = Double.parseDouble(System.console().readLine());
        double discriminante = (b * b) - (4 * a * c);
        if (a == 0) System.out.println("No es una ecuación de segundo grado.");
        else if (discriminante < 0) System.out.println("No tiene soluciones reales.");
        else if (discriminante == 0) System.out.println("x = " + (-b / (2 * a)));
        else {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("x1 = " + x1 + " | x2 = " + x2);
        }
    }
}
