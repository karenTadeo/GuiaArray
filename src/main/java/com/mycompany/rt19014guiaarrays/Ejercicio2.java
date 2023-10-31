
package com.mycompany.rt19014guiaarrays;

public class Ejercicio25 {
 public static void main(String[] args) {
        String contraseña = "Ax5@abcdefg";

        if (cumpleRequisitos(contraseña)) {
            System.out.println("La contraseña cumple con los requisitos.");
        } else {
            System.out.println("La contraseña no cumple con los requisitos.");
        }
    }

    public static boolean cumpleRequisitos(String contraseña) {
        
        if (contraseña.length() < 8) {
            return false;
        }

        boolean tieneMayuscula = false;
        boolean tieneMinuscula = false;
        boolean tieneDigito = false;
        boolean tieneSimbolo = false;

        for (char caracter : contraseña.toCharArray()) {
            if (Character.isUpperCase(caracter)) {
                tieneMayuscula = true;
            } else if (Character.isLowerCase(caracter)) {
                tieneMinuscula = true;
            } else if (Character.isDigit(caracter)) {
                tieneDigito = true;
            } else {
                tieneSimbolo = true;
            }
        }

        return tieneMayuscula && tieneMinuscula && tieneDigito && tieneSimbolo;
    }
}   

