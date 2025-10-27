package TareaDos;

public class EjercicioVeintidos {
    public static void main(String[] args) {
        System.out.print("Introduce el día (lunes a viernes): ");
        String dia = System.console().readLine().toLowerCase();
        System.out.print("Introduce la hora (0-23): ");
        int horas = Integer.parseInt(System.console().readLine());
        System.out.print("Introduce los minutos (0-59): ");
        int minutos = Integer.parseInt(System.console().readLine());

        int minutosActuales = 0;
        switch (dia) {
            case "lunes" -> minutosActuales = (0 * 24 * 60) + (horas * 60) + minutos;
            case "martes" -> minutosActuales = (1 * 24 * 60) + (horas * 60) + minutos;
            case "miércoles", "miercoles" -> minutosActuales = (2 * 24 * 60) + (horas * 60) + minutos;
            case "jueves" -> minutosActuales = (3 * 24 * 60) + (horas * 60) + minutos;
            case "viernes" -> minutosActuales = (4 * 24 * 60) + (horas * 60) + minutos;
        }

        int minutosFinSemana = (4 * 24 * 60) + (15 * 60);
        int faltan = minutosFinSemana - minutosActuales;
        System.out.println("Faltan " + faltan + " minutos para el fin de semana.");
    }
}
