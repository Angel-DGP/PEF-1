package TareaDos;

public class EjercicioOnce {
    public static void main(String[] args) {
        System.out.print("Introduce la hora (0-23): ");
        int horas = Integer.parseInt(System.console().readLine());
        System.out.print("Introduce los minutos (0-59): ");
        int minutos = Integer.parseInt(System.console().readLine());
        int totalSegundos = (24 * 3600) - (horas * 3600 + minutos * 60);
        System.out.println("Faltan " + totalSegundos + " segundos para la medianoche.");
    }
}
