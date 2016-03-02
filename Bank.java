
/**
 * Write a description of class Bank here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bank
{
    // instance variables - replace the example below with your own
        private static double creditIntersRate, investmenInterestRate,premiumInterestRate;
        private static String closeTime, phone, startTime;
        private static int nextID;
        private static int nextCustID = 0;
        private static int numOfCurrentCustomer;
        private static int lastCustID;
        public static int maxNumOfCustomers = 20;
        public static String website, bankName= "JBank", bankaddress =  "1234 JavaStreet, AnyCity, ThisState, 34567";

    /**
     * Constructor for objects of class Bank
     */
    public Bank()
    {
        // initialise instance variables
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public static String getAddress()
    {
        // put your code here
        return null;
    }
    public static double getCreaditRate()
    {
        // put your code here
        return 0;
    }
    public static double getInvestmentRate()
    {
        // put your code here
        return 0;
    }
    public static String getHoursOfOperation()
    {
        // put your code here
        return null;
    }
    public static int getLastID()
    {
        // put your code here
        return 0;
    }
    public static int getMaxCustomers()
    {
        // put your code here
        return 0;
    }
    public static String getName()
    {
        // put your code here
        return null;
    }
    public static int getNumOfCurrentCustomers() 
    {
        return numOfCurrentCustomer;
    }
    public static int getNextID()
    {
       if (nextCustID == 0)  {
            lastCustID = 1000;
            nextCustID = 1000;
            return nextCustID;
        }
        else {
            lastCustID = nextCustID;
            nextCustID = lastCustID + 1;
            return nextCustID;
        }
    }
    public static String getWebsite()
    {
        // put your code here
        return null;
    }
    public static double getPremiumRate()
    {
        // put your code here
        return 0;
    }
    public static String getPhone()
    {
        // put your code here
        return null;
    }
    public static void setCreaditRate(double rate)
    {
        // put your code here
    }
    public static void setInvestmentRate(double rate)
    {
        // put your code here
    }
    public static void setPremium(double rate)
    {
        // put your code here
    }
}
