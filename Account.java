
/**
 * Write a description of class Account here.
 * 
 * @author (RENDRO PRIBADI) 
 * @version (24/03/2016)
 */
public class Account
{
    private char acctType;
    private double balance;
    private String ID;
    
    /**
     * Method Constructor Account
     * @param type Tipe dari Akun
     * @param amount Jumlah Nilai Kas
     */
    public Account(Customer cust, double amount, char type) {
        acctType = type;
        balance = amount;
        ID = cust.getCustID()+ "" + type;
    }
    
    public String toString() {
        System.out.println("Account Type  :   " + acctType);
        System.out.println("ID            :   " + ID);
        System.out.println("Balance       :   " + balance);
        return "";
    }
    
    /**
     * Method deposit untuk mendeposit atau menambahkan sejumlah uang ke akun yang bersangkutan
     * @param amount Jumlah Nilai Kas
     */
    public boolean deposit(double amount) {
        if (amount < 0) {
            return false;
        } else {
            balance += amount;
            return true;
        }   
    }
    
    /**
     * Method getAcctType Mendapatkan tipe akun
     * @return Nama tipe akun
     */
    public char getAcctType() {
        return acctType;
    }
    
    /**
     * Method getBalance Mendapatkan nilai saldo
     * @return Jumlah uang/balance yang dimiliki sebuah akun
     */
    public double getBalance() {
        return balance;
    }
    
    /**
     * Method getId Mendapatkan nomor
     * @return ID dari akun yang bersangkutan
     */
    public String getID() {
        return ID;
    }
    
    /**
     * Method setBalance Menentukan jumlah uang/balance pada suatu akun 
     * @param amount Jumlah Nilai Kas yang akan 
     */
    public void setBalance(double amount) {
        balance = amount;
    }
    
    /**
     * Method setID Menentukan nama ID dari sebuah akun
     * @param acctID Nama ID Account
     */
    /*
    public void setID(String acctId) {
        ID = acctId;
    }*/
    
    /**
     * Method setAcctType Menentukan tipe akun
     * @param type Tipe Akun pelanggan
     */
    public void setAcctType(char type) {
        acctType = type;
    }
    
    /**
     * Method withdraw Mengambil sejumlah uang dari suatu akun 
     * @param amount Jumlah Nilai Kas
     */
    public boolean withdraw(double amount) {
        if (balance-amount < 0) {
            return false;
        } else {
            balance -= amount;
            return true;
        }
    }
   
}