package exceptions;

public class NegativeValueException extends Exception{
    public NegativeValueException(String message){
        super(String.valueOf(message));
    }
}
