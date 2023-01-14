package Javabase.exercicios.tratamentoExceções.models.exeptions;

public class WithdrawLimitError extends Exception {
    private static long serialVersion = 2L;
    public WithdrawLimitError(String msg){
        super(msg);
    }
}
