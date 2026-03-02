public class EdadMedia {

    public static void main(String[] args) {

        int[] edades = {20, 22, 25, 23};
        int suma = 0;

        for (int edad : edades) {
            suma += edad;
        }

        double media = (double) suma / edades.length;

        System.out.println("La edad media es: " + media);
    }
}
