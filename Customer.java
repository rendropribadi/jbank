import java.util.regex.Matcher;// import fungsi untuk REGEX Matche
import java.util.regex.Pattern;// import fungsi untuk REGEX Pattern
import java.util.Date; // import fungsi tanggal

/**
 * Write a description of class Customer here.
 * 
 * @author (RENDRO PRIBADI) 
 * @version (27/022016)
 */
public class Customer
{
    // Deklarasi Variabel cityAddress,dateOfBirth,email,firstName,lastName,streetAddress,phoneNumber,zipOrPostalCode;
    public String cityAddress,email,fname,lname,streetAddress,phoneNumber,zipOrPostalCode;
    public int custId,numberOfCurrentAccounts;
    public Account accounts = new Account();
    private Pattern pattern;
    private Matcher matcher;
    private Date DOB;
    private static final String emailPattern = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"; //pengecekan pattern pada email

    
    /**
     * Method Cunstructor Customer
    */
    public Customer() {
       
    }
    /**
     * Method Cunstructor Customer
     * @param fname = nama depan
     * @param lname = nama akhir
     * @param dob = tanggal lahir
    */
    public Customer(String fname, String lname, Date DOB) {
        this.fname = fname;
        this.lname = lname;
        this.DOB = DOB;
        custId = Bank.getNextID();
        
    }
    /**
     * Method Cunstructor Customer
     * @param firstName = nama depan
     * @param lastName = nama akhir
     * @param dateOfBirth = tanggal lahir
     * @param custId = kostumer id
    */
    public Customer(String fname, String lname, Date DOB, int custId){
    }
    /**
     * Method Accessor getAddress
     * @return ke streetAddress+cityAddress+zipOrPostalCode;
    */
    private String getAddress() {
        return streetAddress+cityAddress+zipOrPostalCode;
        //Mengembalikan nilai ke streetAddress+cityAddress+zipOrPostalCode
    }    
    /**
     * Method Accessor getAccount
     * @return ke accounts
    */
    public Account getAccount() {
        return accounts;
        //Mengembalikan nilai ke akun kostumer
    }   
    /**
     * Method Accessor getName
     * @return ke firstName+lastName
    */
    public String getName(){
        return fname+ " " +lname;
        //Mengembalikan nilai ke firstName+lastName
    }    
    /**
     * Method Accessor getCustomerId
     * @return ke custId
    */
    public int getCustomerId() {
        return custId;
        //Mengembalikan nilai ke custId
    }    
    /**
     * Method Accessor getEmail
     * @return ke email
    */
    public String getEmail() {
        return email;
        //Mengembalikan nilai ke email
    }   
    /**
     * Method Accessor getNumOfAccounts
     * @return ke numberOfCurrentAccounts
    */
    public int getNumOfAccounts() {
        return numberOfCurrentAccounts;
        //Mengembalikan nilai ke numberOfCurrentAccounts
    }   
    /**
      * Method Accessor getPhoneNumber
      * @return ke phoneNumber
    */
    public String getPhoneNumber() {
        return phoneNumber;
        //Mengembalikan nilai ke phoneNumber
    } 
    /**
     * Method Accessor untuk memperoleh tanggal lahir
     * @return ke dateOfBirth 
     */
    public Date getDOB()
    {
        return DOB;
    }  
    /**
     * Method Mutator setAddress
     * @param street = jalan
     * @param city = kota
     * @param code = kode pos
     */
    public void setAddress(String street, String city, String code) {
        streetAddress = street; //mengeset nilai streetAddress ke street
        cityAddress = city; //mengeset nilai cityAddress ke city
        zipOrPostalCode = code; //mengeset nilai zipOrPostalCode ke code
    }  
    /**
     * Method Mutator setEmail
     * @param email = email Customer
    */
    public boolean setEmail(String emailAddress) {
        pattern = Pattern.compile(emailPattern);
        matcher = pattern.matcher(emailAddress);
        if (matcher.matches()){
            email = emailAddress; //mengeset nilai email ke emailAddress
            return true;
        }
        
        else{
            return false;
        }
    }  
    /**
     * Method Mutator setName
     * @param fname = nama depan
     * @param lname = nama akhir 
    */
    public void setName(String fname, String lname) {
         fname = fname; //mengeset nilai firstName ke fname
         lname = lname; //mengeset nilai lastName ke lname
    } 
    /**
     * Method Mutator setAccount
     * @param name = nama akun
    */
    public void setAccount(Account name){
        accounts = name; //mengeset nilai accounts ke name
    }
    public void setCustID(int custID){
        custId = custID; //mengeset nilai accounts ke name
    }    
    /**
     * Method Mutator setPhoneNumber
     * @param phoneNum = nomor telepon
    */
    public void setPhoneNumber(String phoneNum) {
        phoneNumber = phoneNum;  //mengeset phoneNumber ke phoneNum
    }    
    /**
     * Method Mutator setDOB
     * @param dob = name
    */
    public void setDOB(Date name)
    {
        DOB = name;
    }
     
    
}