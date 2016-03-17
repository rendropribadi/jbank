import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.lang.Character;
/**
 * Write a description of class Bank here.
 * 
 * @author (RENDRO PRIBADI) 
 * @version (27/022016)
 */


public class Bank
{
    //Deklarasi Variabel creditInterestRate, investmentInterestRate,premiumInterestRate, lastCustID, nextCustID
    private static double cInterestRate, iInterestRate,pInterestRate;
    private static int lastCustID;
    private static int nextID;
    private static int nextCustID = 0;
    private static int numOfCurrentCustomer;
    public static int maxNumOfCustomers = 20;
    private static String phone;
    private static Date cTime, sTime;
    public static String website, Name= "JBANK", Address = "1234 JavaStreet, AnyCity, ThisState, 34567";
  
    /**
      * Method Constructor bank
    */
   public Bank() { 
        
    }
    
   
    /**
     * Method Accessor getAddress
     * @return ke nilai null
     */
    /*public static String getAddress() {
        return null; //mengembalikan nilai ke null
    }*/
    
     /**
     * Method Accessor getCreditRate
     * @return ke nilai 0
     */
    public static double getCreditRate() {
        return 0; //mengembalikan nilai ke 0
    }
      /**
     * Method Accessor getMaxCustomers
     * @return ke nilai 0
     */
    /*public static int getmaxNumOfCustomers() {
        return 0; //mengembalikan nilai ke 0
    }*/
    
     /**
     * Method Accessor getName
     * @return ke nilai null
     */
    /*public static String getName() {
        return null; //mengembalikan nilai ke null
    }*/
     /**
     * Method Accessor getInvestmentRate
     * @return ke nilai 0
     */
    public static double getInvestmentRate() {
        return 0; //mengembalikan nilai ke 0
    }
     /**
     * Method Accessor getHoursOfOperation
     * @return ke null
     */
    public static String getHoursOfOperation() {
        Calendar start = new GregorianCalendar();
        start.set(Calendar.DAY_OF_WEEK, 2);
        start.set(Calendar.HOUR_OF_DAY, 8);
        start.set(Calendar.MINUTE, 0);
        Date sTime = start.getTime();
        Calendar close = new GregorianCalendar();
        close.set(Calendar.DAY_OF_WEEK, 6);
        close.set(Calendar.HOUR_OF_DAY, 17);
        close.set(Calendar.MINUTE, 0);
        Date cTime = close.getTime();
                
        SimpleDateFormat startclose = new SimpleDateFormat("k:mm");
        return startclose.format(sTime) + " " + "TO" + " " + startclose.format(cTime);
    }
    
     /**
     * Method Accessor getLastID
     * @return ke nilai 0
     */
    public static int getLastID() {
        return 0; //mengembalikan nilai ke 0
    }
    /**
     * Method Accessor getstart time
     * @return ke nilai stime
     */
    public static Date getsTime() {
        return sTime; //mengembalikan nilai ke 0
    }
    /**
     * Method Accessor getclose time
     * @return ke nilai ctime
     */
    public static Date getcTime() {
        return cTime; //mengembalikan nilai ke 0
    }
    /**
     * Method Accessor getNumOfCurrentCustomers
     * @return ke numOfCurrentCustomer
     */
    public static int getNumOfCurrentCustomers() {
        return numOfCurrentCustomer;
    }
    /**
     * Method Accessor getNextID
     * @return ke nomor customer ID selanjutnya
    */
    public static int getNextID() {
       if (nextCustID == 0)  {
            lastCustID = 1000;
            nextCustID = 1000;
            
            numOfCurrentCustomer++;
            
            return nextCustID;
        }
        else {
            lastCustID = nextCustID;
            nextCustID = lastCustID + 1;
            
            numOfCurrentCustomer++;
            
            return nextCustID;
        }
    }   
     /**
     * Method Accessor getWebsite
     * @return ke nilai null
     */
    public static String getWebsite() {
        return null; //mengembalikan nilai ke null
    }    
     /**
     * Method Accessor getPremiumRate
     * @return ke nilai 0
     */
    public static double getPremiumRate() {
        return 0; //mengembalikan nilai ke 0
    }    
     /**
     * Method Accessor getPhone
     * @return ke nilai null
     */
    public static String getPhone() {
        return null; //mengembalikan nilai ke null
    }    
     /**
     * Method Mutator setCreditRate
     * @param rate bunga credit
     */
    public static void setCreditRate(double rate) {
        
    }    
     /**
     * Method Mutator setPremiumRate
     * @param rate bunga investment
     */
    public static void setInvestmentRate(double rate) {
        
    }   
     /**
     * Method Mutator setPremiumRate
     * @param rate bunga pinjaman
     */
    public static void setPremium(double rate) {
        
    }  
    /**
     * Method Mutator setcTime
     * @param close time
     */
    public static void setcTime(Date cTime) {
        
    }   
    /**
     * Method Mutator setsTime
     * @param start time
     */
    public static void setsTime(Date sTime) {
        
    }
    
}