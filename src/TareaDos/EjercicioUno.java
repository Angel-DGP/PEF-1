package TareaDos;

public class EjercicioUno {
    public static void main(String[] args) {
        System.out.print("Introduce un día de la semana: ");
        String dia = System.console().readLine().toLowerCase();
        switch (dia) {
            case "lunes":
                System.out.println("Toca Programación.");
                break;
            case "martes":
                System.out.println("Toca Base de Datos.");
                break;
            case "miércoles":
            case "miercoles":
                System.out.println("Toca Lenguajes de Marcas.");
                break;
            case "jueves":
                System.out.println("Toca Entornos de Desarrollo.");
                break;
            case "viernes":
                System.out.println("Toca Sistemas Informáticos.");
                break;
            default:
                System.out.println("Día no válido.");
        }
    }
}
