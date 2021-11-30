package factory;

import abstraction.ComputerAbstractFactory;
import modele.Computer;

public abstract class ComputerFactory {

    public static Computer getComputer(ComputerAbstractFactory fact){
        return fact.creerComputer();
    }
}
