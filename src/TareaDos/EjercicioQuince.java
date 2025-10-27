package TareaDos;

public class EjercicioQuince {
    public static void main(String[] args) {
        System.out.print("Introduce un carácter: ");
        char c = System.console().readLine().charAt(0);
        System.out.println("1. Vértice arriba\n2. Vértice abajo\n3. Vértice izquierda\n4. Vértice derecha");
        int opcion = Integer.parseInt(System.console().readLine());
        switch (opcion) {
            case 1 -> {
                System.out.println("  " + c);
                System.out.println(" " + c + c + c);
                System.out.println("" + c + c + c + c + c);
            }
            case 2 -> {
                System.out.println("" + c + c + c + c + c);
                System.out.println(" " + c + c + c);
                System.out.println("  " + c);
            }
            case 3 -> {
                System.out.println("  " + c);
                System.out.println(" " + c + c);
                System.out.println("" + c + c + c);
                System.out.println(" " + c + c);
                System.out.println("  " + c);
            }
            case 4 -> {
                System.out.println(c + "  ");
                System.out.println(c + c + " ");
                System.out.println(c + c + c);
                System.out.println(c + c + " ");
                System.out.println(c + "  ");
            }
            default -> System.out.println("Opción no válida");
        }
    }
}
