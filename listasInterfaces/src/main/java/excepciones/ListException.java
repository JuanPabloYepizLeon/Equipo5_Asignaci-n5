package excepciones;
/**
 * Clase ListException.java
 * Lanzara las excepciones cuando se requiera
 * @author E5
 */
public class ListException extends RuntimeException{
    /**
     * constructor de la clase ListException
     */
    public ListException(){
        super();
    }
    /**
     * constructor del mensaje de la clase ListException
     * @param msj tipo String mensaje de porque ocurre el error
     */
    public ListException(String msj){
        super(msj);
    }
      
}
