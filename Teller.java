
/**
 * Write a description of class Teller here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Teller
{
    // instance variables - replace the example below with your own
    public Customer c1 = new Customer();
    public Account a1=new Account();
    private Account akun;
    public String cetak;
    public double balance;
    public static void main(String[] args){}

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public Teller()
    {
        c1.setName("Sanadhi", "Sutandi");
        cetak = c1.getName();
        a1.setBalance(101010);
        c1.setAccount (a1);
        akun=c1.getAccount();
        balance = akun.getBalance();
        System.out.println(balance);
        System.out.println(cetak);
        
    }
}
