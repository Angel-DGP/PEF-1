package TareaDos;

public class EjercicioVeintinueve {
    public static void main(String[] args) {
        System.out.print("¿Qué ha tomado de comer? (palmera, donut o pitufo): ");
        String comida = System.console().readLine().toLowerCase();
        double precioComida = 0;

        if (comida.equals("palmera")) precioComida = 1.4;
        else if (comida.equals("donut")) precioComida = 1.0;
        else if (comida.equals("pitufo")) {
            System.out.print("¿Con qué se ha tomado el pitufo? (aceite o tortilla): ");
            String tipo = System.console().readLine().toLowerCase();
            precioComida = tipo.equals("aceite") ? 1.2 : 1.6;
        }

        System.out.print("¿Qué ha tomado de beber? (zumo o café): ");
        String bebida = System.console().readLine().toLowerCase();
        double precioBebida = bebida.equals("zumo") ? 1.5 : 1.2;

        double total = precioComida + precioBebida;
        System.out.println("Total desayuno: " + total + " €");
    }
}
