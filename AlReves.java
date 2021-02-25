/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosDeLogica;

import java.util.Scanner;
public class AlReves 
{
     public static void main(String[]args)
    {
        Scanner scanner=new Scanner(System.in);
        String n;
        char c1,c2,c3,c4;
    System.out.print("Ingrese numero (0 a (9,999):");
    n=scanner.next()+"000";
    c1=n.charAt(0);
    c2=n.charAt(1);
    c3=n.charAt(2);
    c4=n.charAt(3);
    n=""+c4+""+c3+""+c2+""+c1;
    System.out.println("Numero alreves:"+n);
    
    
    }
}
