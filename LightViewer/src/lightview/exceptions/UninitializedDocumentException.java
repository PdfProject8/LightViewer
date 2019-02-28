package lightview.exceptions;

/**
 *
 * @author Adeepa Gunathilake
 */
public class UninitializedDocumentException extends Exception{
    public UninitializedDocumentException() {
        super();
    }
    
    public UninitializedDocumentException(String message){
        super(message);
    }
}
