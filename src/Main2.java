import javax.swing.*;

public class Main2 {
    public static void main(String[] args) {

        int opcion = 0;

        String mensaje = "1. mostrar lista 1" +
                "\n2. mostrar lista 2" +
                "\n3. unir listas en la lista 1"
                +"\n0. Salir";

        // this is to know the number of nodes
        int cantidadN = 0;
        int cantidadN2 = 0;
        // instantiated the list
        ListaNodo lista = new ListaNodo();
        ListaNodo lista2 = new ListaNodo();
        // read the amount
        cantidadN = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de Nodos \n" +
                "de la lista 1"));
        cantidadN2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de Nodos \n" +
                "de la lista 2"));
        // instantiated the nodos with amount indicated
        for (int i =0 ; i < cantidadN; i++){
            Nodo nuevo = new Nodo();
            lista.agregarN(nuevo);
        }
        for (int i =0 ; i < cantidadN2; i++){
            Nodo nuevo = new Nodo();
            lista2.agregarN(nuevo);
        }

        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,mensaje));
            switch (opcion){
                case 1:lista.viewEasy();
                    break;
                case 2:lista2.viewEasy();
                    break;
                case 3:lista.unirListas(lista2);
                    break;
                case 4:
                    break;
                case 0:
                    break;
            }

        }while (opcion != 0);
    }
}
