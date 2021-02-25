/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosDeLogica;

import java.util.Scanner;
import java.util.Random;
public class AdivinaNumero
{
     public static void main(String[]args)
    {
    Scanner scanner=new Scanner(System.in);
     int nIngresado=0,nAdivinar=0;
    System.out.println("Ingrese el numero maximo hasta el 15:");
    nAdivinar=(int)(Math.random()*scanner.nextInt());
    do
    {
        System.out.println("Ingrese numero a adivinar:");
        nIngresado=scanner.nextInt();
        if(nIngresado==nAdivinar)
        {
        System.out.println("---Acterooooo---");
        break;
        }
        else if(nIngresado>nAdivinar)
        {
        System.out.println("El numeroa adivinar es menor que "+nIngresado);
        }
        else
        {
         System.out.println("El numeroa adivinar es mayor que "+nIngresado);
        }
        
    }while(nIngresado!=nAdivinar);
    }
}
