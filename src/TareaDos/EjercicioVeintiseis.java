package TareaDos;

public class EjercicioVeintiseis {
    public static void main(String[] args) {
        System.out.println("Venta de entradas CineCampa");
        System.out.print("Número de entradas: ");
        int entradas = Integer.parseInt(System.console().readLine());
        System.out.print("Día de la semana: ");
        String dia = System.console().readLine().toLowerCase();
        System.out.print("¿Tiene tarjeta CineCampa? (s/n): ");
        String tarjeta = System.console().readLine().toLowerCase();

        double precioEntrada = 8;
        double total = 0;

        if (dia.equals("miercoles")) precioEntrada = 5;
        if (dia.equals("jueves")) {
            int parejas = entradas / 2;
            int sobrantes = entradas % 2;
            total = (parejas * 11) + (sobrantes * 8);
        } else {
            total = entradas * precioEntrada;
        }

        double descuento = tarjeta.equals("s") ? total * 0.10 : 0;
        double totalFinal = total - descuento;

        System.out.println("Total: " + total + " €");
        System.out.println("Descuento: " + descuento + " €");
        System.out.println("A pagar: " + totalFinal + " €");
    }
}
