package agendalistasimple;

import static java.lang.System.exit;
import javax.swing.JOptionPane;

/**
 * Programa para hacer una agenda de datos (Nombre y Teléfono) usando listas 
 * @author David Nava
 * Fecha de elaboracion: 20 de octubre de 2021
 */
public class AgendaListaSimple {
    public static void main(String[] args) {
        int opcion=0;
        String dato1, dato2;
        AgendaListaMetodos miLista= new AgendaListaMetodos();
        for(;;){
            try{
                opcion=Integer.parseInt(JOptionPane.showInputDialog(null,
                          "1. Agregar datos a la agenda\n" 
                        + "2. Mostrar los datos de la agenda\n" 
                        + "3. Salir\n"
                        + "¿Qué deseas hacer?", "Menu de Opciones",
                        JOptionPane.INFORMATION_MESSAGE));
                switch (opcion){
                    case 1: 
                        dato1 = JOptionPane.showInputDialog(null,
                                "Ingresa el número de teléfono: ","Teléfono",
                                JOptionPane.INFORMATION_MESSAGE);
                        dato2=JOptionPane.showInputDialog(null, 
                                "Ingresa el nombre:","Nombre",
                                JOptionPane.INFORMATION_MESSAGE);
                        miLista.agregar("Teléfono: " + dato1);
                        miLista.agregar("Nombre: " + dato2);
                        break;
                    case 2: 
                        if(miLista.estaVacia())//Si la lista esta vacia
                            JOptionPane.showMessageDialog(null, 
                                "¡La lista esta vacia!" +
                                "\nIngrese datos mediante la opción 1","Información",
                                JOptionPane.INFORMATION_MESSAGE);
                        else{ //Si no esta vacia, muestra la lista (Agenda)
                        miLista.MostrarLista();}
                        break;
                    case 3: 
                        exit(0);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,"¡Elige una opción del Menú!", 
                                "Error",JOptionPane.INFORMATION_MESSAGE);  
                }
            }catch (Exception e){
            }
        }
    }
}
