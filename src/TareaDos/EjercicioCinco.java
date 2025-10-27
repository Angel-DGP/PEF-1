package TareaDos;

public class EjercicioCinco {
    public static void main(String[] args) {
        System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
        System.out.print("Por favor, introduzca el valor de a: ");
        double a = Double.parseDouble(System.console().readLine());
        System.out.print("Ahora introduzca el valor de b: ");
        double b = Double.parseDouble(System.console().readLine());

        if (a == 0) {
            System.out.println("Esa ecuación no tiene solución real.");
        } else {
            double x = -b / a;
            System.out.println("x = " + x);
        }
    }
}
