/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosPoo;

import java.util.Scanner;
public class TestCuenta 
{
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        Cuenta Pedro= new Cuenta("Pedro",300);
        Cuenta Fernando = new Cuenta("Fernando",300);
        double Depositop,Depositof,Retirop,Retirof;
        Depositop=300;
        Depositof=400;
//       Pedro.Ingresar(Depositop);
//       Fernando.Ingresar(Depositof);
       
       System.out.println(Pedro.toString());
       System.out.println(Fernando.toString());
       System.out.println("SALDO AUMENTADO: $"+Pedro.Ingresar(Depositop));
       System.out.println("SALDO AUMENTADO: $"+Fernando.Ingresar(Depositof));
         Retirop=500;
       Retirof=100;
//       
//       Pedro.Retirar(Retirop);
//       Fernando.Retirar(Retirof);
       
       System.out.println("SALDO ACTUAL: PEDRO: $"+Pedro.Retirar(Retirop));
       System.out.println("SALDO ACTUAL: FERNANDO: $"+Fernando.Retirar(Retirof));
       
     
       
       
       
      
        
        
        
        
    }
}
