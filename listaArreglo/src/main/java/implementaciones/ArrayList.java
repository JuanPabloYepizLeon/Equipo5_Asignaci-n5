
package implementaciones;

import interfaces.IList;
import excepciones.ListException;
import java.util.Iterator;

public class ArrayList<T> implements IList<T>, Iterable<T>{
    protected int nElementos;
    private final int tamLista;
    private final T lista[];

    @Override
    public void set(T o, int i) throws ListException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean remove(T o) throws ListException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int indexOf(T o) throws ListException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    private class ListIterator<T> implements Iterator<T>{
        private int actual = 0;
        
        
        @Override 
        public T next(){
            return (T)lista[actual++];
        }

        @Override
        public boolean hasNext() {
            return actual < nElementos;
        }
        
    }    
    
    public ArrayList(Class<T> tipoDato, int tamLista){
        this.tamLista = tamLista;
        nElementos = 0;
        lista = (T[]) java.lang.reflect.Array.newInstance(tipoDato,
        tamLista);
    }
    
    @Override
    public void append(T o) throws ListException {
        if(nElementos >= tamLista)
            throw new ListException("Lista llena");
            lista[nElementos] = o;
            nElementos++;
        
    }

    @Override
    public void insert(T o, int i) throws ListException {
        if (nElementos >= tamLista)
        throw new ListException("Lista llena");
        // Si el indice i esta fuera de los limites de los datos
        if(i < 0 || i > nElementos)
        throw new ListException("Indice fuera de limites");
        for(int j = nElementos; j > i; j--)
        lista[j] = lista[j - 1];
        lista[i] = o;
        nElementos++;;
    }

    @Override
    public T get(int i) throws ListException {
        if (empty())
        throw new ListException("Lista vacia");
        if(i < 0 || i >= nElementos)
        throw new ListException("Indice fuera de limites");
        return lista[i];        
    }

    @Override
    public T remove(int i) throws ListException {
        T o = get(i);
        for(int j = i; j < nElementos - 1; j++)
        lista[j] = lista[j+1];
        nElementos--;
        return o;
    }

    @Override
    public boolean empty() {
        return nElementos == 0;
    }

    @Override
    public int size() {
        return nElementos;
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator();
    }


    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        String s = "[";
        for(int i = 0; i < nElementos; i++) {
        s += lista[i];
        if(i < nElementos - 1) s += ", ";
        }
        s += "]";
        return s;
    }
    

    
    
    
}
