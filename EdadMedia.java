
public class EdadMedia {

    public static void main(String[] args) {

        int[] edades = new int[5];
        int suma = 0;

        for (int i = 0; i < edades.length; i++) {
            edades[i] = (int) (Math.random() * 100); // Genera edades aleatorias entre 0 y 99
            suma += edades[i];
        }

        double media = (double) suma / edades.length;

        System.out.println("Edades generadas:");
        for (int edad : edades) {
            System.out.print(edad + "/");
        }

        System.out.println("\nEdad media: " + media);
    }
}
