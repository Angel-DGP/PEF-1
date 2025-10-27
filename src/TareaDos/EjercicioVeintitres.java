package TareaDos;

public class EjercicioVeintitres {
    public static void main(String[] args) {
        System.out.print("Introduzca la base imponible: ");
        double base = Double.parseDouble(System.console().readLine());
        System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
        String tipo = System.console().readLine().toLowerCase();
        System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
        String promo = System.console().readLine().toLowerCase();

        double iva = switch (tipo) {
            case "general" -> 0.21;
            case "reducido" -> 0.10;
            case "superreducido" -> 0.04;
            default -> 0;
        };

        double precioConIva = base + (base * iva);
        double descuento = switch (promo) {
            case "mitad" -> precioConIva / 2;
            case "meno5" -> 5;
            case "5porc" -> precioConIva * 0.05;
            default -> 0;
        };

        double total = (promo.equals("mitad")) ? precioConIva / 2 : precioConIva - descuento;
        System.out.println("Base imponible: " + base);
        System.out.println("IVA (" + (iva * 100) + "%): " + (base * iva));
        System.out.println("Precio con IVA: " + precioConIva);
        System.out.println("Descuento aplicado: " + descuento);
        System.out.println("TOTAL: " + total);
    }
}
