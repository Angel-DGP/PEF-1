package TareaDos;

public class EjercicioDieciseis {
    public static void main(String[] args) {
        int puntos = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Pregunta " + i + " (true/false): ");
            boolean resp = Boolean.parseBoolean(System.console().readLine());
            if (resp) puntos += 3;
        }
        if (puntos <= 10)
            System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
        else if (puntos <= 22)
            System.out.println("Quizás exista el peligro de otra persona, pero sin importancia.");
        else
            System.out.println("Tu pareja podría estar viviendo un romance. Indaga más.");
    }
}
