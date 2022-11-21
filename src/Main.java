public class Main {
    public static void main(String[] args) {

        //comentario desde Rama Master Borja Vidal Lopez

        String nombre = "Borja Vidal";
        int modulos = 6;
        int horasestudio = 40;

        System.out.print("Estudiante " + args[0] + " : " );
        //Realizamos la comprobacion de los argumentos de entrada
        System.out.println(veredicto(args[1], args[2]));

    }

    private static String veredicto(String valor1, String valor2) {
        if(Integer.parseInt(valor1) > Integer.parseInt(valor2)) {
            return "Poco tiempo de estudio. Debes dedicar más tiempo.";
        } else if (Integer.parseInt(valor1) == Integer.parseInt(valor2)) {
            return "Bien. Pero una hora de estudio para cada módulo puede ser insuficiente.";

        }
        return "Ideal. Trabajas los contenidos en casa.";
    }
}
