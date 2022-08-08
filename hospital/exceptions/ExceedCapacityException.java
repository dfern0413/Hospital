package exceptions;

public class ExceedCapacityException extends Exception{
    public ExceedCapacityException(String message){
        super(String.valueOf(message));
    }
}
