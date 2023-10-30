import java.util.Random;

public class Nodo {

    private int dato;

    String nombre;

    private Nodo ligaN;
    private Nodo ligaB;

    public Nodo(){
        Random numero = new Random();
        dato = numero.nextInt(10,200);
        System.out.println(dato);
    }


    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getLigaN() {
        return ligaN;
    }

    public void setLigaN(Nodo ligaN) {
        this.ligaN = ligaN;
    }

    public Nodo getLigaB() {
        return ligaB;
    }

    public void setLigaB(Nodo ligaB) {
        this.ligaB = ligaB;
    }
}
