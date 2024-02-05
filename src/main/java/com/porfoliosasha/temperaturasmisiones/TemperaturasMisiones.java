package com.porfoliosasha.temperaturasmisiones;

import java.util.Scanner;

public class TemperaturasMisiones {

    public static void main(String[] args) {
        
        //Creo los 3 vectores
        String ciudades [] = new String [5];
        Double minimas [] = new Double [5];
        Double maximas [] = new Double [5];
        
        Scanner teclado = new Scanner (System.in);
        Scanner teclado2 = new Scanner (System.in);
        
        //Cargo los vectores
        for (int i = 0; i < ciudades.length; i++) {
            
            System.out.println("Ingrese el nombre de la ciudad " + i);
            ciudades[i] = teclado.nextLine(); 
            
            System.out.println("Ingrese la temperatura minima de la ciudad " + i);
            minimas[i] = teclado2.nextDouble();
            
            System.out.println("Ingrese la temperatura maxima de la ciudad " + i);
            maximas[i] = teclado2.nextDouble();
            
        }
        
        Double minima = 9999999.00;
        int posMin = -1;
        
        Double maxima = -9999999.00;
        int posMax = -1;
        
        //Determino las temperaturas minimas y maximas
        for (int i = 0; i < ciudades.length; i++) {
            
            if (minimas[i] < minima){
                minima = minimas[i];
                posMin = i;
            }
            
            if (maxima < maximas[i]){
                maxima = maximas[i];
                posMax = i; 
            }
            
        }
        
        System.out.println("La temperatura minima es de " + minima);
        System.out.println("Se registro en la ciudad de " + ciudades[posMin]);
        System.out.println("La temperatura maxima es de " + maxima);
        System.out.println("Se registro en la ciudad de " + ciudades[posMax]);
        
    }
}
