/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosPoo;


public class Cuenta 
{
    //ATRIBUTOS
    private String Titular;
    private double Cantidad;
    
    //PROPIEDADES GET Y SET
    public String getTitular()
    {
    return Titular;
    }
    
    public void setTitular(String Titular)
    {
    this.Titular= Titular;
    }
    
    public double getCantidad()
    {
    return Cantidad;
    }
    
    public void setCantidad(double Cantidad)
    {
    this.Cantidad=Cantidad;
    }
    
    //CONSTRUCTORES
    public Cuenta()
    {
    //CONSTRUCTOR DEFAULT
    }
    
    public Cuenta(String T, double C)
    {
    Titular= T;
    Cantidad = C;
    }
    
    //METODO STRING
    public String toString()
    {
    return "TITULAR DE LA CUENTA:  "+ Titular+"\nCANTIDAD EN LA CUENTA: $ "+Cantidad;
    }
    
    //METODOS ESPECIALES
    public double Ingresar(double C)
    {
        if (Cantidad>0)
        {
            this.Cantidad=C;
           
        }
        
        return Cantidad;
    }
    
    public double Retirar(double R)
    {
        this.Cantidad=this.Cantidad-R;
        if (this.Cantidad<=0)
        {
            this.Cantidad=0;
        }
        return Cantidad;
    }
}
