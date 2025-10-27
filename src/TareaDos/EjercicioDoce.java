package TareaDos;

public class EjercicioDoce {
    public static void main(String[] args) {
        int puntuacion = 0;
        System.out.println("Responde con 'true' o 'false'");
        String[] preguntas = {
                "1. Java es un lenguaje de programación.",
                "2. HTML es un lenguaje de programación.",
                "3. Linux es un sistema operativo.",
                "4. La CPU es la tarjeta gráfica del computador.",
                "5. IntelliJ IDEA es un IDE.",
                "6. GitHub sirve para control de versiones.",
                "7. XML es un formato de imagen.",
                "8. El lenguaje SQL sirve para bases de datos.",
                "9. Python y Java son lenguajes compilados.",
                "10. El bucle for permite repetir acciones."
        };
        boolean[] respuestasCorrectas = {true, false, true, false, true, true, false, true, false, true};
        for (int i = 0; i < preguntas.length; i++) {
            System.out.print(preguntas[i] + " ");
            boolean respuesta = Boolean.parseBoolean(System.console().readLine());
            if (respuesta == respuestasCorrectas[i]) puntuacion++;
        }
        System.out.println("Tu calificación es: " + puntuacion + "/10");
    }
}
