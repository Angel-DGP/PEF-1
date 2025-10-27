package TareaDos;

public class EjercicioVeintisiete {
    public static void main(String[] args) {
        System.out.print("Elija un sabor (manzana, fresa o chocolate): ");
        String sabor = System.console().readLine().toLowerCase();
        double precio = 0;

        if (sabor.equals("manzana")) precio = 18;
        else if (sabor.equals("fresa")) precio = 16;
        else if (sabor.equals("chocolate")) {
            System.out.print("¿Qué tipo de chocolate quiere? (negro o blanco): ");
            String tipo = System.console().readLine().toLowerCase();
            precio = tipo.equals("negro") ? 14 : 15;
        }

        System.out.print("¿Quiere nata? (si o no): ");
        String nata = System.console().readLine().toLowerCase();
        if (nata.equals("si")) precio += 2.5;

        System.out.print("¿Quiere ponerle un nombre? (si o no): ");
        String nombre = System.console().readLine().toLowerCase();
        if (nombre.equals("si")) precio += 2.75;

        System.out.println("Total: " + precio + " €");
    }
}
