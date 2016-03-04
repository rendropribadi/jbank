
/**
 * Write a description of class Account here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Account
{
    // instance variables - replace the example below with your own
    private char acctType;
    private double balance;
    private String id;
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public Account()
    {
       
    }
    public Account(char type, double amount)
    {
        // put your code here
    }
    public boolean deposit(double amount)
    {
         if (amount < 0){
            return false;
        }
        // jika ada uang masuk maka akan ditambah ke balance
        else{
            balance = balance + amount; //menambah variabel balance dengan amount ntuk menambahkan saldo
            return true;
        }// put your code here
    }
    public char getAcctType()
    {
        // put your code here
        return  acctType ;
    }
    public double getBalance()
    {
        // put your code here
        return 10.00 ;
    }
    public String getId()
    {
        // put your code here
        return id ;
    }
    public void setBalance(double amount)
    {
        // put your code here
        this.balance = amount;
    }
    public void setId(String acctId)
    {
        // put your code here
        this.id = acctId;
    }
    public void setAcctType(char type)
    {
        // put your code here
      acctType = type;
    }
    public boolean withdraw(double amount)
    {
        if (balance-amount < 0){
            return false;
        }
        // jika tidak, maka nilai pengambilan akan dimasukkan ke balance
        else{
            balance = balance - amount;
            return true;
        }// put your code here
    }
}
