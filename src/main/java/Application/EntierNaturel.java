package Application;

import exception.NombreNegatifException;

public class EntierNaturel {
    int val;

    public EntierNaturel(int val) throws NombreNegatifException {
        if (val<0) throw new NombreNegatifException(val, "can't create object with negative value");
        this.val = val;
        System.out.println("Object created with value: "+val);
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) throws NombreNegatifException {
        if(val<0) throw new NombreNegatifException(val, "can't set negative value");
        this.val = val;
        System.out.println("Value set to: "+val);
    }

    public void decrementer() throws NombreNegatifException{
        if (this.val==0) throw new NombreNegatifException(this.val-1,"can't decrement value");
        this.val-=1;
        System.out.println("Value decremented and equal to: "+this.val);
    }
    public void crementer() throws NombreNegatifException{
        this.val+=1;
    }
}

