package agendalistasimple;

import javax.swing.JOptionPane;

/**
 *Programa para hacer una agenda de datos (Nombre y telefono) usando listas 
 * @author David Nava
 * Fecha de elaboracion: 20 de octubre de 2021
 */
public class AgendaListaMetodos {
    private  AgendaNodo inicio, fin;//Punteros para saber inicio y fin
    public AgendaListaMetodos(){
        inicio=null;
        fin=null;
    }
    //Metodo para cuando la lista este vacia
    public boolean estaVacia(){
          return inicio==null;//Si inicio es igual a nulo, returna verdadero
      }
//    public boolean estaVacia(){
//       if(inicio==null){
//            JOptionPane.showMessageDialog(null,"¡La lista esta vacia!"+
//                    "\nIngrese datos mediante la opcion 1"); 
//        }
//       return false;
//    }
   
    //Método para agregar al inicio del la lista
    public void agregar(String dato){
        //Creando al nodo
        inicio= new AgendaNodo(dato, inicio);
        if(fin==null){
            fin=inicio;
        }
    }
    //Método para mostrar datos
    public void MostrarLista(){
        System.out.println("*-----Nombres y telefonos----*");
        AgendaNodo auxiliar = inicio;
        while(auxiliar !=null){
            System.out.println(auxiliar.dato);
            auxiliar=auxiliar.siguiente;
            
        }
        System.out.println("------------------------------");   
    }
    
}
