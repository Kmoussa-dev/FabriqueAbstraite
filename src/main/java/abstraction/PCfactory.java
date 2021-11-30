package abstraction;

import abstraction.ComputerAbstractFactory;
import modele.Computer;
import modele.PC;

public class PCfactory implements ComputerAbstractFactory {

    private String ram;
    private String hdd;
    private String cpu;

    public PCfactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public Computer creerComputer() {
            return new PC(this.ram,this.hdd,this.cpu);
    }
}
