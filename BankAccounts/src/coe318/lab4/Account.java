package coe318.lab4;

/**
 *
 * @author Asif Choudhury
 */
public class Account {
    String accName;
    int accID;
    double accBalance;
    
    public Account(String name, int number, double initialBalance){
        accName = name;
        accID = number;
        accBalance = initialBalance;
    }

    String getName(){
        return(accName);
    }
    
    double getBalance(){
        return(accBalance);
    }

    int getNumber(){
        return(accID);
    }

    boolean deposit(double amount){
        if(amount <= 0)
            return false;
        else{
            accBalance += amount;
            return true;
        }
    }

    boolean withdraw(double amount){
        if(amount <= 0 || amount > accBalance)
            return false;
        else{
            accBalance -= amount;
            return true;
        }
    }

    @Override
    public String toString() {//DO NOT MODIFY
        return "(" + getName() + ", " + getNumber() + ", " +
        String.format("$%.2f", getBalance()) + ")";
    }
    
}
