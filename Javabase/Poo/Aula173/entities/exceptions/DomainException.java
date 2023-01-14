package Javabase.Poo.Aula173.entities.exceptions;

public class DomainException extends RuntimeException {
    private static final long serialVersion = 1L;

    public DomainException(String msg){
        super(msg);
    }
}
