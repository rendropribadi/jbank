import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * Write a description of class Customer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Customer
{
    // instance variables - replace the example below with your own
    private String cityAddress,dataOfBrirth,email,firstName,lastName,streetAddress,phoneNumber,cityName,zipOrPostalCode;
    private int custId,numberOfCurrentAccounts;
    private Account accounts = new Account();
    private Pattern pattern;
    private Matcher matcher;
    private static final String emailPattern = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public Customer()
    {
        // put your code here
    }
    public Customer(String fname, String lname, String dob)
    {
        // put your code here
    }
    public Customer(String firstName, String lastName, String dateOfBirth, int custId)
    {
        // put your code here
    }
    private String getAddress()
    {
        // put your code here
        return streetAddress+cityName+zipOrPostalCode;
    }
    public Account getAccount()
    {
        // put your code here
        return accounts;
    }
    public int getCustID()
    {
        // put your code here
        return custId;
    }
    public String getName()
    {
        // put your code here
        return lastName + firstName;
    }
    public int getCustomerID()
    {
        // put your code here
        return custId;
    }
    public String getEmail()
    {
        // put your code here
        return email;
    }
    public String getCustomerName()
    {
        // put your code here
        return "";
    }
    public int getNumOfAccounts()
    {
        // put your code here
        return numberOfCurrentAccounts;
    }
    public String getPhoneNumber()
    {
        // put your code here
        return phoneNumber;
    }
    public void setAddress(String street, String city, String code)
    {
        // put your code here
        this.streetAddress = street;
        this.cityName = city;
        this.zipOrPostalCode = code;
    }
    public boolean setEmail(String emailAddress)
    {
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
    public void setName(String lname, String fname)
    {
        // put your code here
       firstName = fname;
       lastName = lname;
    }
    public void setAccount(Account name)
    {
        // put your code here
        accounts = name;
    }
    public void setPhoneNumber(String phoneNum)
    {
        // put your code here
        this.phoneNumber = phoneNum;
    }
    
    
}
