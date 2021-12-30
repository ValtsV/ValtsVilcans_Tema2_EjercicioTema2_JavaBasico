package com.valts;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Añade el precio:");
        String precio = scanner.nextLine();


        try
        {
            Float precioF = Float.parseFloat(precio);
            Float precioConIva = calcularPrecioConIva(precioF);
            System.out.println(precioConIva);
        }
        catch (NumberFormatException e)
        {
            System.out.println(precio + " no es un precio válido!");
        }
    }

    private static float calcularPrecioConIva(Float precio) {
        float precioConIva = precio + precio * 0.21F;
        float precioConIvaCorto = roundTwoDecimals(precioConIva);
        return precioConIvaCorto;
    }

    private static float roundTwoDecimals(Float fl) {
        DecimalFormat twoDForm = new DecimalFormat("#.##");
        return Float.valueOf(twoDForm.format(fl));
    }

}
