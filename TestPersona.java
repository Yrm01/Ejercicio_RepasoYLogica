/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosPoo;

import java.util.Scanner;
public class TestPersona {
    public static void main(String[]args)
    {
         Scanner scanner=new Scanner(System.in);
        Persona miPersona1;
        Persona miPersona2;
        Persona miPersona3;
    System.out.println("ingrese nombre:");
    String n=scanner.next();
     System.out.println("ingrese edad:");
     byte e=scanner.nextByte();
      System.out.println("ingrese sexo de manera caracter (H o M):");
      char s=scanner.next().charAt(0);
       System.out.println("ingrese Peso(kg):");
       double p=scanner.nextDouble();
        System.out.println("ingrese Altura(en metros):");
        double a=scanner.nextDouble();
        miPersona1=new Persona(n, a,p,e,s);
        miPersona2=new Persona(n, e, s);
        miPersona3=new Persona();
       System.out.println("Primer persona IMC:\n----------");
        switch(miPersona1.calcularIMC())
       {
           case -1: System.out.println("Peso ideal");break;
           case 0: System.out.println("Por debajo de su peso");break;
           case 1:System.out.println("Sobrepeso");break;
            default: System.out.println("No existe");break;
       }
        System.out.println("Segunda persona IMC:\n----------");
        switch(miPersona2.calcularIMC())
       {
           case -1: System.out.println("Peso ideal");break;
           case 0: System.out.println("Por debajo de su peso");break;
           case 1:System.out.println("Sobrepeso");break;
            default: System.out.println("No existe");break;
       }
        System.out.println("Tercera persona IMC:\n----------");
        switch(miPersona3.calcularIMC())
       {
           case -1: System.out.println("Peso ideal");break;
           case 0: System.out.println("Por debajo de su peso");break;
           case 1:System.out.println("Sobrepeso");break;
            default: System.out.println("No existe");break;
       }
         if(miPersona1.esMayorEdad())
         {
             System.out.println("la primer persona es mayor de edad"); 
         }
         else
         {
        System.out.println("la primer persona no es mayor de edad"); 
         }
          if(miPersona2.esMayorEdad())
         {
             System.out.println("la segunda persona es mayor de edad"); 
         }
         else
         {
        System.out.println("la segunda persona no es mayor de edad"); 
         }
           if(miPersona3.esMayorEdad())
         {
             System.out.println("la tercera persona es mayor de edad"); 
         }
         else
         {
        System.out.println("la tercera persona no es mayor de edad"); 
         }
           
            System.out.println("\n\n ----------------------"+"Pirmera persona\n"+miPersona1.toString());
            System.out.println("\n\n----------------------"+"Segunda persona\n"+miPersona2.toString());
            System.out.println("\n\n----------------------"+"Tercera persona\n"+miPersona3.toString());
         
               
               
               
    }
    
}
