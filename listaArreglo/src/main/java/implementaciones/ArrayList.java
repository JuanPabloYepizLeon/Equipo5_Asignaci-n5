package implementaciones;
import interfaces.IList;
import excepciones.ListException;
import java.util.Iterator;
/**
 * Clase ArrayList.java
 * Implementación de una lista genérica basada en un arreglo
 * @author E5
 * @param <T> El tipo de elementos que contendrá la lista
 */
public class ArrayList<T> implements IList<T>, Iterable<T>{
    protected int nElementos;
    private final int tamLista;
    private final T lista[];
    /**
     * Constructor principal
     * @param nElementos Numero inicial de elementos
     * @param tamLista Capacidad de la lista
     * @param lista Arreglo de elementos
     */
    public ArrayList(int nElementos, int tamLista, T[] lista) {
        this.nElementos = nElementos;
        this.tamLista = tamLista;
        this.lista = lista;
    }
    /**
     * Reemplaza el elemento en la posicion especificada
     * @param o Elemento nuevo
     * @param i Indice donde se reemplazará el elemento
     * @throws ListException
     */
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
    /**
     * Elimina el primer elemento que coincida con el objeto dado
     * @param o Objeto a eliminar
     * @return true si fue eliminado, false en caso contrario
     * @throws ListException 
     */
    @Override
    public boolean remove(T o) throws ListException {
    for (int j = (int)o; j < nElementos - 1; j++) {
        lista[j] = lista[j + 1];
    }
    lista[--nElementos] = null; 
    return (boolean)o;
    }
    /**
     * Devuelve el índice del primer elemento que coincida con el objeto dado
     * @param o Objeto a buscar
     * @return Indice el objeto si existe, -1 en caso contrario
     * @throws ListException 
     */
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
    /**
     * Indica si la lista esta vacia
     * @return true si esta vacia, false en caso contrario
     */
    private boolean isEmpty() {
       return nElementos==0;
    }
    /**
     * Clase interna que implementa un iterador para recorrer la lista
     * @param <T> Tipo generico que sera la lista
     */
    private class ListIterator<T> implements Iterator<T>{
        private int actual = 0;
        /**
         * Devuelve el elemento que sigue en la lista
         * @return El valor del elemento
         */
        @Override 
        public T next(){
            return (T)lista[actual++];
        }
        /**
         * Checa el elemento que sigue
         * @return El valor del elemento que sigue
         */
        @Override
        public boolean hasNext() {
            return actual < nElementos;
        }  
    }    
    /**
     * Constructor que inicializa una lista vacía con la capacidad indicada
     * @param tipoDato Clase del tipo genérico (usada para crear el arreglo)
     * @param tamLista Capacidad máxima de la lista
     */
    public ArrayList(Class<T> tipoDato, int tamLista){
        this.tamLista = tamLista;
        nElementos = 0;
        lista = (T[]) java.lang.reflect.Array.newInstance(tipoDato,
        tamLista);
    }
    /**
     * Agrega un elemento al final de la lista
     * @param o Elemento a agregar
     * @throws ListException 
     */
    @Override
    public void append(T o) throws ListException {
        if(nElementos >= tamLista)
            throw new ListException("Lista llena");
                lista[nElementos] = o;
                nElementos++;
    }
    /**
     * Inserta un elemento en la posición indicada
     * @param o Elemento a insertar
     * @param i Indice donde se insertara el elemento
     * @throws ListException 
     */
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
    /**
     * Obtiene el elemento en la posición indicada
     * @param i Indice del elemento
     * @return El elemento en la posición indicada
     * @throws ListException 
     */
    @Override
    public T get(int i) throws ListException {
        if (empty())
        throw new ListException("Lista vacia");
            if(i < 0 || i >= nElementos)
                throw new ListException("Indice fuera de limites");
        return lista[i];        
    }
    /**
     * Elimina el elemento en la posición indicada y lo retorna
     * @param i Indice del elemento a eliminar
     * @return El elemento eliminado
     * @throws ListException 
     */
    @Override
    public T remove(int i) throws ListException {
        T o = get(i);
        for(int j = i; j < nElementos - 1; j++)
        lista[j] = lista[j+1];
        nElementos--;
        return o;
    }
    /**
     * Indica si la lista esta vacia
     * @return true si esta vacia, false en caso contrario
     */
    @Override
    public boolean empty() {
        return nElementos == 0;
    }
    /**
     * Devuelve la cantidad de elementos almacenados
     * @return Número de elementos en la lista
     */
    @Override
    public int size() {
        return nElementos;
    }
    /**
     * Retorna un iterador para recorrer los elementos de la lista
     * @return Un iterador sobre los elementos de la lista
     */
    @Override
    public Iterator<T> iterator() {
        return new ListIterator();
    }
    /**
     * Elimina todos los elementos de la lista
     */
    @Override
    public void clear() {
    for (int i = 0; i < nElementos; i++) {
        lista[i] = null;
    }
    nElementos = 0;
    }
    /**
     * Devuelve una representación en cadena de la lista
     * @return Los elementos en formato [elem1, elem2, ...]
     */
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
