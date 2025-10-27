package TareaDos;

public class EjercicioCuatro {
    public static void main(String[] args) {
        System.out.print("Introduce el número de horas trabajadas: ");
        int horas = Integer.parseInt(System.console().readLine());
        int salario;

        if (horas <= 40) {
            salario = horas * 12;
        } else {
            salario = (40 * 12) + ((horas - 40) * 16);
        }

        System.out.println("El sueldo semanal que le corresponde es de " + salario + " euros");
    }
}
