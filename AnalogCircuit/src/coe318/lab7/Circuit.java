package coe318.lab7;

/**
 *
 * @author Asif Choudhury
 */
import java.util.ArrayList;

public class Circuit {
    private static Circuit instance = null; 
    private ArrayList<Resistor> resistors;
    private ArrayList<VoltageSource> volts;
    protected static Circuit cir = Circuit.getInstance();
    
    public static Circuit getInstance() {
        if (instance == null) {
            instance = new Circuit();
        }
        return instance;
    }
    
    private Circuit() {
        resistors = new ArrayList<Resistor>();
        volts = new ArrayList<VoltageSource>();
    }
    
    public void addRes(Resistor r){
        resistors.add(r);
    }
    
    public void addVolt(VoltageSource v){
        volts.add(v);
    }
    
}

