package exception;

public class DataAlreadyException extends RuntimeException{
    public DataAlreadyException(String message) {
        super(message);
    }
}
