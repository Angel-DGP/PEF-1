package TareaDos;

public class EjercicioVeinticinco {
    public static void main(String[] args) {
        System.out.print("Introduzca la altura de la bandera en cm: ");
        double alto = Double.parseDouble(System.console().readLine());
        System.out.print("Ahora introduzca la anchura: ");
        double ancho = Double.parseDouble(System.console().readLine());
        System.out.print("¿Quiere escudo bordado? (s/n): ");
        String escudo = System.console().readLine().toLowerCase();

        double area = alto * ancho;
        double precio = area * 0.01;
        double extra = escudo.equals("s") ? 2.5 : 0;
        double total = precio + extra + 3.25;

        System.out.println("Bandera de " + area + " cm2: " + precio + " €");
        System.out.println((escudo.equals("s") ? "Con escudo: 2.50 €" : "Sin escudo: 0.00 €"));
        System.out.println("Gastos de envío: 3.25 €");
        System.out.println("Total: " + total + " €");
    }
}
