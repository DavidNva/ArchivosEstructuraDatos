/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendalistasimple;

/**
 *Programa para hacer una agenda de datos (Nombre y telefono) usando listas
 * @author David Nava
 * Fecha de elaboracion: 20 de octubre de 2021
 */
public class AgendaNodo {
    String dato;
    AgendaNodo siguiente;//Puntero enlace
    public AgendaNodo(String dato){
        this.dato=dato;
    }
    //Contructor para insertar al inicio
    public AgendaNodo(String d,AgendaNodo n ){
        dato=d;
        siguiente=n;
    }
    
}
