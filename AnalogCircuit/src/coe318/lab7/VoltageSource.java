package coe318.lab7;

/**
 *
 * @author Asif Choudhury
 */
public class VoltageSource{
    private double voltage;
    private static int voltageID = 1;
    private Node node1, node2;
    
    public VoltageSource(double voltage, Node node1, Node node2){
        if(voltage == 0)
            throw new IllegalArgumentException("Please set a non-zero voltage value");
        if(voltage < 0){
            this.voltage = Math.abs(voltage);
            this.node1 = node2;
            this.node2 = node1;
        }
        else{
            this.voltage = voltage;
            this.node1 = node1;
            this.node2 = node2;
        }
        Circuit.cir.addVolt(this);
    }
    
    @Override
    public String toString(){
        return("\nV" + voltageID++ + node1.toString() + node2.toString() + voltage);
    }
}
