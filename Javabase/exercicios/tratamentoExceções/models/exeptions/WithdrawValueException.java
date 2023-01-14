package Javabase.exercicios.tratamentoExceções.models.exeptions;

public class WithdrawValueException extends Exception{
    private static long serialVersion = 1L;
    public WithdrawValueException(String msg){
        super(msg);
    }
}
