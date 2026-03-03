/*
    Un programa sencillo que calcula cuánto cuesta una camiseta
    después de aplicar un descuento del 15%.
 */
public class CalculoDescuento {

    public static void main(String[] args) {

        // 1. Declaración de variables con valores fijos
        // Usamos 'double' para precios porque llevan decimales
        double precioOriginal = 29.99;
        double porcentajeDescuento = 15.0; // El descuento será del 15%

        // 2. Lógica del cálculo
        // Para sacar el descuento: (Precio * Porcentaje) / 100
        double ahorro = (precioOriginal * porcentajeDescuento) / 100;

        // El precio final es la resta del original menos lo ahorrado
        double precioFinal = precioOriginal - ahorro;

        // 3. Mostrar los resultados en la consola sin controlar los decimales
        System.out.println("--- TICKET DE VENTA ---");
        System.out.println("Precio base: " + precioOriginal + "€");
        System.out.println("Descuento aplicado: " + porcentajeDescuento + "%");

        System.out.println("-----------------------");

        System.out.println("Te ahorras: " + ahorro + "€");
        System.out.println("Total a pagar: " + precioFinal + "€");

        /* 
        // 3. Mostrar los resultados en la consola controlando los decimales
        System.out.println("--- TICKET DE VENTA ---");

        // Usamos %.2f para decir: "pon un número decimal (f) con 2 decimales (.2)"
        // El %n sirve para dar un salto de línea (como el ln de println)
        System.out.printf("Precio base: %.2f€ %n", precioOriginal);
        System.out.printf("Descuento aplicado: %.0f%% %n", porcentajeDescuento);

        System.out.println("-----------------------");

        System.out.printf("Te ahorras: %.2f€ %n", ahorro);
        System.out.printf("Total a pagar: %.2f€ %n", precioFinal);
         */
    }
}
