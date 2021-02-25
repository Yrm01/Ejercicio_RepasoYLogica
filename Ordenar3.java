/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosDeLogica;

import  java.util.Scanner ;
public class Ordenar3
{
    public static void main(String[]args)
    {
            Scanner scanner=new Scanner(System.in);
        int N1,N2,N3,mayor=0,menor=0,medio=0;
        System.out.println("Primer número:");
        N1= scanner.nextInt();
        System.out.println("Segundo número:");
        N2=scanner.nextInt();
        System.out.println("Tercer número:");
        N3=scanner.nextInt();
        if(N1>N2&&N1>N3)
        {
         mayor=N1;
         if(N2>N3)
         {
         medio=N2;
         menor=N3;
         }
         else
         {
          medio=N3;
         menor=N2;
         }
        }
        else if(N2>N1&&N2>N3)
        {
        mayor=N2;
        if(N1>N3)
        {
        medio=N1;
        menor=N3;
        }
        else
        {
        medio=N3;
        menor=N1;
        }
        }
        if(N3>N1&&N3>N2)
        {
        mayor=N3;
        if(N1>N2)
        {
            medio=N1;
            menor=N2;        
        }
        else
        {
          medio=N2;
            menor=N1;   
        }
        }
        System.out.println(" "+mayor+" "+medio+" "+menor);

    }
    
}
