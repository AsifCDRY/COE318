package coe318.lab7;

/**
 *
 * @author Asif Choudhury
 */
public class Node {
    private int nodeID;
    
    public Node() {
        nodeID = 0;
    }
    
    public void setNodeID(int nodeID){
        if(nodeID < 0)
            throw new IllegalArgumentException("Node ID can't be negative");
        else
            this.nodeID = nodeID;
    }
    
    public int getNodeID(){
        return nodeID;
    }
     
    @Override
    public String toString(){
        return (" N" + nodeID + " ");
    }
}
