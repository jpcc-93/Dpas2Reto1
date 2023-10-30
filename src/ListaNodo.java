import javax.swing.*;

public class ListaNodo {

    private Nodo cabeza,anterior;
    int h;

    public ListaNodo(){
        cabeza = null;
        h=0;
    }

    public void agregarN(Nodo nodo){
        Nodo aux = cabeza;

        // only run if list is clean
        if(cabeza == null){
            cabeza = nodo;
            nodo.setLigaB(cabeza);
            nodo.setLigaN(cabeza);


        }else {
            do{
                if(cabeza.getLigaN() == cabeza){
                    nodo.setLigaB(cabeza);
                    nodo.setLigaN(cabeza);
                    cabeza.setLigaN(nodo);
                    cabeza.setLigaB(nodo);
                }else {
                    anterior.setLigaN(nodo);
                    nodo.setLigaB(anterior);
                    nodo.setLigaN(cabeza);
                    cabeza.setLigaB(nodo);


                }

                aux = aux.getLigaN();
            }while (aux != cabeza);
        }
        anterior = nodo;
        nodo.nombre = "Nodo numero "+(h+1);
        h++;

    }

    public void recorrerNext(){
        Nodo aux = cabeza;
        do{
            JOptionPane.showMessageDialog(null," DATO ANTERIOR: "+
                    aux.getLigaB().getDato() + " DATO: "+aux.getDato() + " y dato siguiente es " + aux.getLigaN().getDato());
            aux = aux.getLigaN();
        }while(aux != cabeza);
    }

    public void recorrerBack(){
        Nodo aux = cabeza;
        do{
            JOptionPane.showMessageDialog(null," DATO ANTERIOR: "+
                    aux.getLigaB().getDato() + " DATO: "+aux.getDato() + " y dato siguiente es " + aux.getLigaN().getDato());
            aux = aux.getLigaB();
        }while(aux != cabeza);
    }

    public void recorrerNextWithdiv(){
        Nodo aux = cabeza;
        // bandera para mostrar las pasadas
        int i = 0;
        //bandera para terminar el ciclo
        int j = 0;
        // bandera para interrumpir
        boolean salir = false;
        int datoAnterior;
        int divisor = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el divisor de la lista entre el 2 y el 9"));
        do{
            datoAnterior = aux.getDato();
            if(aux.getDato()>divisor) {
                aux.setDato(aux.getDato() / divisor);
                j++;
            }
            if(aux.getDato()>divisor && (i == 0 || i == 2) || (aux.getDato()>divisor && i > 2)){
                JOptionPane.showMessageDialog(null,"Nombre: "+aux.nombre+"\nDato: " + datoAnterior +
                        " Divisor: "+divisor+"\nNuevo Dato: "+aux.getDato()
                + "\nPasada numero: " + (i+1));

            }

            if (aux == cabeza.getLigaB()){
                i ++;

                if(j == 0 && i > 0){salir = true;}
                j = 0;
            }

            aux = aux.getLigaN();
        }while(!salir);
    }
}
