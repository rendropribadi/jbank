
/**
 * Write a description of class Account here.
 * 
 * @author (RENDRO PRIBADI) 
 * @version (27/022016)
 */
public class Account
{
    // Deklarasi Variabel acctType, balance
    public char acctType;
    public double balance;
    private String id;
    
    /**
     * Method Cunstructor Account
    */
    public Account() {
        acctType = 'S';
        balance = 10.00;
    }    
    /**
     * Method Cunstructor Account
     * @param type = tipe akun
     * @param amount = banyaknya saldo
    */
    public Account(char type, double amount) {
        acctType = type;
        balance = amount;
    }
    /**
     * Method Mutator deposit, Method untuk menambah saldo akhir dengan jumlah uang yang diinginkan 
     * @param amount = banyaknya saldo
     */ 
    public boolean deposit(double amount) {
        // jika saldo negatif maka menjalankan perintah false
         if (amount < 0){
            return false;
        }
        // jika ada uang masuk (saldo positif) maka akan menambah ke nilai balance
        else{
            balance = balance + amount; //menambah variabel balance dengan amount ntuk menambahkan saldo
            return true;
        }
    }
    /**
     * Method Accessor getAcctType
     * @return ke acctType
    */
    public char getAcctType() {
        return acctType; // mengembalikan nilai ke accType
    }    
    /**
     * Method Accessor getBalance
     * @return balance
    */
    public double getBalance() {
        return balance;  //mengembalikan nilai ke balance
    }    
    /**
     * Method Accessor getId
     * @return id
     */
    public String getId() {
        return id; //mengembalikan nilai ke Id
    }    
    /**
     * Method Mutator setBalance
     * @param amount = banyaknya saldo
    */
    public void setBalance(double amount) {
        balance = amount; // mengeset balance pada saldo customer
    }    
    /**
     * Method Mutator setID
    */
    public void setID(String acctId) {
        id = acctId; // mengeset nilai ID ke acctId
    }    
    /**
     * Method Mutator setAcctType
    */
    public void setAcctType(char type) {
        acctType = type; // mengeset nilai acctType ke tipe
    }   
     /**
     * Method Mutator withdraw , Method yang mengeset jumlah uang yang didapat 
     */
    public boolean withdraw(double amount) {
       //Fungsi untuk melakukan pengambilan saldo
       // jika pengambilan uang menyebabkan balance bernilai negatif maka akan menjalankan perintah false
        if (balance-amount < 0){
            return false;
        }
        // jika tidak, maka nilai pengambilan akan dimasukkan ke balance
        else{
            balance = balance - amount;
            return true;
        }
    }
}