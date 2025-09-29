package implementaciones;

import excepciones.ListException;
import interfaces.IList;
import java.util.Iterator;

/**
 *
 * @author Pablo
 */
public class LinkedList<T> implements IList<T>, Iterable<T> {
    protected NodoSimple<T> inicio;
    protected int nElementos;
    private final int tamLista;
    private final T lista[];
    /**
     * Constructor principal
     * @param nElementos Numero inicial de elementos
     * @param tamLista Capacidad de la lista
     * @param lista Arreglo de elementos
     */
    

    public LinkedList(NodoSimple<T> inicio, int nElementos, int tamLista, T[] lista) {
        this.inicio = inicio;
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

    @Override
    public void clear() {
        for (int i = 0; i < nElementos; i++) {
        lista[i] = null;
    }
    nElementos = 0;
    }

    private boolean isEmpty() {
        return nElementos==0;
    }
    
    private class NodoSimple<T> {
        private T dato;
        private NodoSimple<T> sig;

        public NodoSimple(T dato) {
            this.dato = dato;
        }
    }
    private class ListIterator<T> implements Iterator<T> {
        private NodoSimple<T> nodoActual;
        public ListIterator(NodoSimple<T> inicio) {
            nodoActual = inicio;
        }
        @Override
        public boolean hasNext() {
            return nodoActual != null;
        }
        
        @Override
        public T next() {
            T dato = nodoActual.dato;
            nodoActual = nodoActual.sig;
            return dato;
        }
    }
    public LinkedList() {
        inicio = null;
        nElementos = 0;
        this.tamLista = 0;
        this.lista = null;
    }
    
    @Override
    public void append(T o) {
        NodoSimple<T> nodoNuevo = new NodoSimple<>(o);
        NodoSimple<T> nodo = inicio;
        if (inicio == null) {
            // Si la lista está vacía
            inicio = nodoNuevo;
        } else {
            // Si la lista no esta vacia, haz que nodo
            // apunte al ultimo elemento de la lista
            while (nodo.sig != null) {
                nodo = nodo.sig;
            }
            // agrega el nuevo nodo al final de la lista
            nodo.sig = nodoNuevo;
        }
        nElementos++;
    }
    @Override
    public void insert(T o, int i) throws ListException {
        NodoSimple<T> nodoNuevo = new NodoSimple<>(o);
        if (i < 0 || i > nElementos) {
            throw new ListException("Indice fuera de limites");
        }
        if (i == 0) {
            // Inserta el elemento al inicio de la lista
            if (inicio != null) {
            // Si la lista no esta vacia,
            // colocala detras del nodo nuevo
            nodoNuevo.sig = inicio;
            }
        inicio = nodoNuevo;
        } else {
        // Inserta el elemento en la posición i de la lista
        NodoSimple<T> nodo = inicio;
        // Haz que nodo apunte al nodo
        // anterior al punto de insercion
        for (int j = 0; j < i - 1; j++) {
        nodo = nodo.sig;
        }
        // Agrega la lista a la derecha del punto
        // de inserción al nodo nuevo
        nodoNuevo.sig = nodo.sig;
        // Agrega el nodo nuevo a la lista a la
        // izquierda del punto de inserción
        nodo.sig = nodoNuevo;
        }
        nElementos++;
    }
    @Override
    public T get(int i) throws ListException {
    if (empty()) {
    throw new ListException("Lista vacia");
    }
    if (i < 0 || i >= nElementos) {
    throw new ListException("Indice fuera de limites");
    }
    NodoSimple<T> nodo = inicio;
    // Haz que nodo apunte al nodo a modificar
    for (int j = 0; j < i; j++) {
    nodo = nodo.sig;
    }
    // Regresa el dato en la posición i de la lista
    return nodo.dato;
    }
    @Override
    public T remove(int i) throws ListException {
    T o;
    if (empty()) {
    throw new ListException("Lista vacia");
    }
    if (i < 0 || i >= nElementos) {
    throw new ListException("Indice fuera de limites");
    }
    if (i == 0) {
    // Si el nodo a eliminar esta al inicio de la lista
    // Obten el dato a eliminar
    o = inicio.dato;
    // Quita el elemento al inicio de la lista
    inicio = inicio.sig;
    } else {
    // Si el nodo a eliminar esta en la posición i
    // de la lista
    NodoSimple<T> nodo = inicio;
    // Haz que nodo apunte al nodo anterior al
    // nodo a eliminar
    for (int j = 0; j < i - 1; j++) {
    nodo = nodo.sig;
    }
    // Obten el dato a eliminar
    o = nodo.sig.dato;
    // Quita el elemento a eliminar de la lista
    nodo.sig = nodo.sig.sig;
    }
    nElementos--;
    // Regresa el dato
    return o;
    }
    @Override
    public boolean empty() {
    return inicio == null;
    }
    @Override
    public int size() {
    return nElementos;
    }
    @Override
    public Iterator<T> iterator() {
    return new ListIterator(inicio);
    }
    @Override
    public String toString() {
    String s = "[";
    NodoSimple<T> nodo = inicio;
    while (nodo != null) {
    s += nodo.dato;
    if (nodo.sig != null) {
    s += ", ";
    }
    nodo = nodo.sig;
    }
    s += "]";
    return s;
    }
}
