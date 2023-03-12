package Application;

import exception.NombreNegatifException;

public class Application {
    public static void main(String[] args) {
        System.out.println("Début de Programme");
        EntierNaturel entier=null;
        try {
            entier= new EntierNaturel(-1);
        } catch (NombreNegatifException e) {
            throw new RuntimeException(e.getMessage()+": "+e.getVal_erronee());
        }
        try {
            entier= new EntierNaturel(4);
        } catch (NombreNegatifException e) {
            throw new RuntimeException(e.getMessage()+": "+e.getVal_erronee());
        }
        try {
            entier.setVal(-1);
        } catch (NombreNegatifException e) {
            throw new RuntimeException(e.getMessage()+": "+e.getVal_erronee());
        }
        try {
            entier.setVal(0);
        } catch (NombreNegatifException e) {
            throw new RuntimeException(e.getMessage()+": "+e.getVal_erronee());
        }
        try {
            entier.decrementer();
        } catch (NombreNegatifException e) {
            throw new RuntimeException(e.getMessage()+": "+e.getVal_erronee());
        }

    }
}
