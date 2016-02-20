
/**
 * Write a description of class Customer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Customer
{
    // instance variables - replace the example below with your own
    private String cityAddress,dataOfBrirth,email,firstName,lastName,streetAddress,phoneNumber,zipOrPostalCode;
    private int custId,numberOfCurrentAccounts;
    private Account accounts = new Account();

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
        return "";
    }
    public Account getAccount()
    {
        // put your code here
        return accounts;
    }
    private int getCustomerId()
    {
        // put your code here
        return 0;
    }
    private String getEmail()
    {
        // put your code here
        return "";
    }
    private String getCustomerName()
    {
        // put your code here
        return "";
    }
    public int getNumOfAccounts()
    {
        // put your code here
        return 0;
    }
    private String getPhoneNumber()
    {
        // put your code here
        return "";
    }
    private void setAddress(String street, String city, String code)
    {
        // put your code here
        return ;
    }
    private void setEmail(String emailAddress)
    {
        // put your code here
        return ;
    }
    private void setCustomerName(String lname, String cfname)
    {
        // put your code here
        return ;
    }
    private void setPhoneNumber(String phoneNum)
    {
        // put your code here
        return ;
    }
    
}
