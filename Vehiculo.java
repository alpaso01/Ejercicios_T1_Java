package com.dam.alex;

public class Vehiculo {
   private String tipo;
   private String marca;
   private String modelo;


   public Vehiculo(String tipo, String marca, String modelo){
    this.tipo = tipo;
    this.marca = marca;
    this.modelo = modelo;

   }
    public void mostrarInfo(){
System.out.println("TIPO: "+ tipo + " MODELO: "+modelo+" MARCA. "+marca);
    }
}
