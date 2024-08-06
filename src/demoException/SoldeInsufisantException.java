package demoException;

public class SoldeInsufisantException extends RuntimeException{

    public SoldeInsufisantException() {
        super("Solde insuffisant");
    }

    public SoldeInsufisantException(String message) {
        super(message);
    }
}
