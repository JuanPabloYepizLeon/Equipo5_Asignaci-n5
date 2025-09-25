package implementaciones;

import interfaces.IList;
import excepciones.ListException;
import java.util.Iterator;

public class ArrayList<T> implements IList<T>, Iterable<T>{
 protected int nElementos;
    private final int tamLista;
    private final T lista[];
    
    
    public ArrayList(int nElementos, int tamLista, T[] lista) {
        this.nElementos = nElementos;
        this.tamLista = tamLista;
        this.lista = lista;
    }
   

    @Override
    public void set(T o, int i) throws ListException {
        if (isEmpty()) {
        throw new ListException("Lista vacía: no se puede setear elemento");
        }
        if (i < 0 || i >= nElementos) {
        throw new ListException("Índice fuera de límites: " + i);
        }
        lista[i] = o;
    }

    @Override
    public boolean remove(T o) throws ListException {
    for (int j = (int)o; j < nElementos - 1; j++) {
        lista[j] = lista[j + 1];
    }
    lista[--nElementos] = null; 
    return (boolean)o;
    }

    @Override
    public int indexOf(T o) throws ListException {
      if (isEmpty()) {
        throw new ListException("Lista vacía: no se puede buscar el índice");
        }
        for (int i = 0; i < nElementos; i++) {
        if (lista[i].equals(o)) {
            return i; 
      }
     }
        return -1; 
      }

    private boolean isEmpty() {
       return nElementos==0;
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
                            nElementos++;
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
    for (int i = 0; i < nElementos; i++) {
        lista[i] = null;
    }
    nElementos = 0;
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
