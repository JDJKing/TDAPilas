package TdaLista;

public class Pila<T> {

    private Nodo cima;
    private int size;
    Nodo nodo = new Nodo();

    public boolean estaVacia(){
        return cima ==  null;
    }

    public boolean estaLlena(){
        return !(cima ==  null);
    }

    public int size() {
        return size;
    }

    public void push(T dato){
        Nodo nuevo = new Nodo();
        nuevo.setDato(dato);

        if(estaVacia())
            cima = nuevo;
        else{
            nuevo.setSiguiente(cima);
            cima = nuevo;
        }
        size++;
    }

    public void pop(){
        if(estaVacia())
            System.out.printf("Pila Vacia");
        else
            cima = cima.getSiguiente();
             size --;

    }

    public Object peek(){
        return cima.getDato();
    }

    public void limpiar(){
        cima = null;
        size =0;
    }

    public String toString(){
        String Pila = "";
        for(Nodo n = cima; n != null; n = n.getSiguiente()){
            Pila = Pila + "\n " + n.getDato();
        }
        return Pila;
    }

}
