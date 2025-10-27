package TareaDos;

public class EjercicioVeinticuatro {
    public static void main(String[] args) {
        System.out.println("1 - Programador junior\n2 - Programador senior\n3 - Jefe de proyecto");
        System.out.print("Introduzca el cargo del empleado (1-3): ");
        int cargo = Integer.parseInt(System.console().readLine());
        System.out.print("¿Cuántos días ha estado de viaje visitando clientes? ");
        int dias = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
        int estado = Integer.parseInt(System.console().readLine());

        double sueldoBase = switch (cargo) {
            case 1 -> 950;
            case 2 -> 1200;
            case 3 -> 1600;
            default -> 0;
        };

        double dietas = dias * 30;
        double sueldoBruto = sueldoBase + dietas;
        double irpf = (estado == 1) ? 0.25 : 0.20;
        double retencion = sueldoBruto * irpf;
        double neto = sueldoBruto - retencion;

        System.out.println("----------------------------------");
        System.out.println("Sueldo base: " + sueldoBase);
        System.out.println("Dietas (" + dias + " viajes): " + dietas);
        System.out.println("Sueldo bruto: " + sueldoBruto);
        System.out.println("Retención IRPF (" + (irpf * 100) + "%): " + retencion);
        System.out.println("Sueldo neto: " + neto);
        System.out.println("----------------------------------");
    }
}
