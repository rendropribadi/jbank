
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
        private static String closeTime, startTime;
        private static int lastCustID = 1000;
        private static int nextCustID = 1000;
        private static int nextID;
        private static int numOfCurrentCustomers;
        public static int maxNumOfAcctsPerCustomer = 4;
        public static int MAXNUMBEROFCUSTOMERS = 20;
        public static String website, bankName= "JBank", phone, bankaddress =  "1234 JavaStreet, AnyCity, ThisState, 34567";

    /**
     * Constructor for objects of class Bank
     */
    private Bank()
    {
        // initialise instance variables
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    /*
    public static String getAddress()
    {
        // put your code here
        return address;
    }*/
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
    /*
    public static String getName()
    {
        // put your code here
        return  name;
    }*/
    public static int getNumOfCurrentCustomers() 
    {
        return numOfCurrentCustomers;
    }
    public static int getNextID()
    {
       if (nextCustID == 0)  {
            lastCustID = 1000;
            nextCustID = 1000;
            numOfCurrentCustomers++;
            return nextCustID;
        }
        else if ( numOfCurrentCustomers == MAXNUMBEROFCUSTOMERS ) {
            nextCustID = 0;
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
    public static void setStartTime(int hour, int min)
    {
        // put your code here
    }
}
