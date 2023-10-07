package coe318.lab7;

/**
 *
 * @author Asif Choudhury, 501111719
 */
public class Resistor{
    private double resistance;
    private static int resistorID = 1;
    private Node node1, node2;
    private Node[] nodes = {node1, node2};
    
    public Resistor(double resistance, Node node1, Node node2){    
        if(resistance <= 0)
            throw new IllegalArgumentException("Resistance can't be negative");
        else
            this.resistance = resistance;
        
        this.node1 = node1;
        this.node2 = node2;
        Circuit.cir.addRes(this);
    }
    
    public Node [] getNodes(){
        return nodes;
    }

    @Override
    public String toString(){
        return("\nR" + resistorID++ + node1.toString() + node2.toString() + resistance);
    }
}

