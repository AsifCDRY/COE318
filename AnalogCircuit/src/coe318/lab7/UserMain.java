package coe318.lab7;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Asif Choudhury
 */
public class UserMain {
    private static ArrayList<String> str = new ArrayList();
    
    public static String circuitString(){
        String a = "";
        for(String element : str){
            a += element.toString();
        }
        return a;
    }
    
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        String[] stringArr;
        VoltageSource volts = null;
        Resistor res = null;
        Node node1 = new Node(), node2 = new Node();
        System.out.println("Please enter the component you would like to add, followed by the two nodes "
                + "it's connected to and its value");
        
        String userRes = userInput.nextLine();
       
        while(!userRes.equals("spice")){
            stringArr = userRes.split(" ");
            node1.setNodeID(Integer.parseInt(stringArr[1]));
            node2.setNodeID(Integer.parseInt(stringArr[2]));
            
            if(stringArr[0].equals("v")){
                volts = new VoltageSource(Double.parseDouble(stringArr[3]), node1, node2);
                str.add(volts.toString());
            }
            else if(stringArr[0].equals("r")){
                res = new Resistor(Double.parseDouble(stringArr[3]), node1, node2);
                str.add(res.toString());
            }

            userRes = userInput.nextLine();

            if(userRes.equals("spice")){
                System.out.println(circuitString());
                userRes = userInput.nextLine();
            }
            if(userRes.equals("end")){
                System.out.println("All Done");
                break;
            }
        }
    }          
}
