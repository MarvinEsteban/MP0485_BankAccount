package marvin.esteban;

/**
 *
 * @author Marvin
 */
public class Account {
    int number;
    int balance;
    String holder;

    public Account(int number, int balance, String holder) {
        this.number = number;
        this.balance = balance;
        this.holder = holder;
    }

    public int getNumber() {
        return number;
    }
    public int getBalance() {
        return balance;
    }
    public String getHolder() {
        return holder;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }
    
    

    
    
    
    
    
    
}
