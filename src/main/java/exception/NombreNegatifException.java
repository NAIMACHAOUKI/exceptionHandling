package exception;

public class NombreNegatifException extends Exception{
    int val_erronee;
    public NombreNegatifException(int val, String message){
        super(message);
        this.val_erronee=val;
    }

    public int getVal_erronee() {
        return val_erronee;
    }
}
