package TareaDos;

public class EjercicioTrece {
    public static void main(String[] args) {
        System.out.print("Introduce el primer número: ");
        int a = Integer.parseInt(System.console().readLine());
        System.out.print("Introduce el segundo número: ");
        int b = Integer.parseInt(System.console().readLine());
        System.out.print("Introduce el tercer número: ");
        int c = Integer.parseInt(System.console().readLine());
        int temp;
        if (a > b) { temp = a; a = b; b = temp; }
        if (b > c) { temp = b; b = c; c = temp; }
        if (a > b) { temp = a; a = b; b = temp; }
        System.out.println("Orden ascendente: " + a + ", " + b + ", " + c);
    }
}
