package africa.semicolon.BeansApp.exceptions;

public class CustomerAlreadyExistsException extends BeansAppException{
    public CustomerAlreadyExistsException(String message) {
        super(message);
    }
}
