package com.campusdual.classroom;


import java.util.ArrayList;

public class Exercise07 {

    public static void main(String[] args) {
    }

    //TODO ↓
    // ESTE MÉTODO NO ES NECESARIO HACERLO POR PARTE DE LOS ALUMNOS
    // Crear una List<Integer> con los números del 10 al 1. Luego buscar el elemento
    // que se le pasa por parámetro.
    // Si lo encuentra, que imprima el siguiente mensaje → El elemento X se encuentra en la posición: Y
    // Si NO lo encuentra, que imprima el siguiente mensaje → El elemento X no se encuentra en la lista.


    public static void positionInAList(int num) {
        ArrayList<Integer> alist = new ArrayList<>();
        for (int i = 10; i >=1 ; i--) {
            alist.add(i);

        }
        boolean b1 = false;
        for (int i = 0; i < alist.size() && !b1; i++) {

            if(num == i){
                System.out.println( " se encuentra en la posición: " + i);
                b1 = true;
            }

        }
        if(!b1) {
            System.out.println( " no se encuentra en la lista.");
        }

    }

    //TODO ↓
    // Que imprima como mensaje la suma de los primeros N números positivos
    public static void sumFirstNaturalNumbers(int num) {
       int suma  =0;
        for (int i = 1; i <= num; i++) {
            suma = suma +i;
        }
        System.out.println("La suma de los primeros " + num + " números naturales es: " + suma);


    }

    //TODO ↓
    // Que imprima por pantalla los N primeros números positivos
    public static void showFirstNaturalNumbers(int num) {

        for (int i = 0; i <=num ; i++) {
            System.out.println(i);
        }
    }

}
