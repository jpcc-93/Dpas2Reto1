import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // this is to know the number of nodes
        int cantidadN = 0;
        // instantiated the list
        ListaNodo lista = new ListaNodo();
        // read the amount
        cantidadN = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de Nodos \n" +
                "Debe ser de minimo 5 maximo 20 Nodos"));
        // instantiated the nodos with amount indicated
        for (int i =0 ; i < cantidadN; i++){
            Nodo nuevo = new Nodo();
            lista.agregarN(nuevo);
        }
        // divide los datos

        //lista.recorrerNextWithdiv();

        // test the list and links
        lista.viewEasy();
        lista.invertirLista();
//        lista.recorrerNext();
//        lista.recorrerBack();


    }
}