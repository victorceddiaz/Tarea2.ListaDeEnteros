/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Victor Cedillo
 */
public class ListaEnteros {

    private static int[] numeros = {1,2,3,4,5};

    public static int suma(int x) {
        if (x == numeros.length-1) {
            return numeros[x];
        } else {
            return numeros[x] + suma(x + 1);
        }
    }

    public static void main(String[] args) {
        //System.out.println(numeros.length);
        int resultado=suma(0);
        System.out.println(resultado);
    }
}
