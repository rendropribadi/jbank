import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
/**
 * Write a description of class Teller here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Teller
{
/*
    {
        c1.setName("Sanadhi", "Sutandi");
        cetak = c1.getName();
        Account a1 = new Account(),acc;
        Customer c1 = new Customer();
        a1.setBalance(101010);
        c1.setAccount (a1);
        akun=c1.getAccount();
        balance = akun.getBalance();
        System.out.println(balance);
        System.out.println(cetak);
        
    }*/
    public static void main(String[] args){
    int index = 0, balance;
    Scanner o = new Scanner(System.in);
    String input = "", fname, lname, phone, acctType,DOB;
    List<Customer> customer = new ArrayList<Customer>();
    int n = 0;
    do{
     System.out.println("Jika ingin membuat Customer? (yes/no)");
     input = o.next();
     
     if ( ( input.equals("yes") ) || ( input.equals("yes") ) )
     {
     System.out.print("Input Nama Depan: ");
     fname = o.next();
     System.out.print("Input Nama Belakang: ");
     lname = o.next();
     System.out.print("Input Tanggal Lahir (Format DD/MM/YY): ");
     input = o.next();
     DOB = input;
     System.out.print("Input No Telepon: ");
     phone = o.next();
     
     customer.add(new Customer (fname,lname,DOB));
     System.out.println("Masukkan jenis akun ");
     System.out.print("(S: Save; O: Object; I:Investment; C: Credit; T: Tidak Input): ");
     input = o.next();
     acctType = input;
     System.out.print("Memasukkan nilai saldo awal: ");
     balance = o.nextInt();
             if (balance<=0) {
                  
              } else {
                  
              }
      } else if ( ( input.equals("no") ) || ( input.equals("no") ) ) {
             System.out.println("System akan Berhenti"); 
             break;
          } else {
              System.out.println("Input Hanyalah yes Atau no Saja\n");
          }
      } while(true);
    }
     
    

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */

 public Teller() 
 {
    }
    
    public Customer createNewCustomer(String DOB, String fname, String lname) 
    {
        return new Customer(DOB, fname, lname);
    }
    
    public Customer getCustomer(int customerID) 
    {
        return new Customer();
    }
}