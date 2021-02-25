/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosPoo;

import  java.util.Random ;
public class Persona {
    
     private String Nombre,RFC;
    private double Altura,Peso;
    private byte Edad;
    private char Sexo;
    public Persona()
    {
        Nombre="Desconocido";
        Altura=0;
        Peso=0;
        Edad=0;
        Sexo='H';
        this.RFC=this.gererarRFC();
    }
    public Persona(String n,byte ed,char s)
    {
      Nombre=n;
        Altura=0;
        Peso=0;
        Edad=ed;
        Sexo=s;
       this.RFC=this.gererarRFC();

    }
    public Persona(String n,double a,double p,byte e,char s)
    {
      Nombre=n;
        Altura=a;
        Peso=p;
        Edad=e;
        Sexo=s;
       this.RFC=this.gererarRFC();
    }
    public int calcularIMC()
    {
    double constante=(Peso/(Math.pow(Altura,2)));
    if(constante<20)
    {
    return (-1);
    }
    else if(constante>=20 && constante<=25)
    {
        return (0);
    }
    else
    {
    return (1);
    }
    }
    
    public boolean esMayorEdad()
    {
    if(Edad>=18)
    {
        return true;
    }
    else
    {
    return false;
    }
    }
    
    private void comprobarSexo(char s)
    {
    if(s!='H'||s!='M')
    {
    Sexo='H';
    }
    }
    public String toString()
    {
    return "Nombre:"+this.Nombre+"\nAltura:"+this.Altura+"\nPeso:"+this.Peso+"\nEdad:"+this.Edad+"\nSexo:"+this.Sexo+"\nRFC:"+this.RFC;
    }
    
    private String gererarRFC()
    {
        Random miRandom=new Random();
        int numero=0;
    String Cadena="";
    for(int i=0;i<4;i++)
    {
    numero=(miRandom.nextInt(100)+1);
    Cadena+=(char)numero;
    }
    numero=(int)(Math.random()*100000);
    Cadena+=numero;
    return (Cadena);
    }
    
    
}
