package TareaDos;

public class EjercicioTres {
    public static void main(String[] args) {
        System.out.print("Introduce un número del 1 al 7: ");
        int num = Integer.parseInt(System.console().readLine());
        String dia;

        switch (num) {
            case 1 -> dia = "Lunes";
            case 2 -> dia = "Martes";
            case 3 -> dia = "Miércoles";
            case 4 -> dia = "Jueves";
            case 5 -> dia = "Viernes";
            case 6 -> dia = "Sábado";
            case 7 -> dia = "Domingo";
            default -> dia = "Número no válido";
        }
        System.out.println("Día correspondiente: " + dia);
    }
}
