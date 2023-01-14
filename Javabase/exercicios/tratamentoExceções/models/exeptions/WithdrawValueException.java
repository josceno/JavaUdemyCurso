package Javabase.exercicios.tratamentoExceções.models.exeptions;

public class WithdrawValueException extends RuntimeException{
    private static long serialVersion = 1L;
    public WithdrawValueException(String msg){
        super(msg);
    }
}
