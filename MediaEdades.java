
public class MediaEdades {

    public static void main(String[] args) {
        int[] edades = {20, 25, 30, 35};
        int suma = 0;
        for (int i = 0; i < edades.length; i++) {
            suma += edades[i];
        }
        double media = (double) suma / edades.length;
        System.out.println("Media: " + media);
    }
}
