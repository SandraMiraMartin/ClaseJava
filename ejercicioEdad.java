//El publicClass debe tener el mismo nombre que el archivo

public class ejercicioEdad {

    public static void main(String[] args) {
        //Declaro un array con 4 edades
        int[] edades = {45, 26, 19, 27};
        int suma = 0;
        //Hacemos el bucle for para hacer la suma de las edades 
        for (int i = 0; i < 4; i++) {
            suma += edades[i];

        }

        //Hacemos la media lo declaramos double por los decimales que nos puede dar
        Double media = (double) suma / 4; //le ponemos el (double) delante para que redonde al dividir enteros 

        System.out.println("La media de las edades es: " + media);

        System.out.printf("La media de las edades es: %.2f %n", media);

    }
}
