
import java.util.Scanner;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.lang.Character;
import java.lang.Math;
import java.math.BigDecimal;
import java.math.MathContext;

/**
 * Write a description of class Account here.
 * 
 * @author (RENDRO PRIBADI) 
 * @version (27/022016)
 */
public class Teller
{
    
    public static Account a1=new Account();
    private static Account akun;
    public static String cetak;
    public static double Balance;
    public static String fname, lname, DOB, phone, AcctType, userResponse; 
    private static String year ="1994", month="10", day="11";
    private static MathContext hitung = new MathContext(8), hitung1 = new MathContext(3);
    
     
    /**
     * Class teller berfungsi untuk membuat objek baru yang berisikan nama akun dan balancenya
     * @param args Arguments
     */
    public Teller(){
    }
    
  
    /**
     * Method main, untuk melihat nama dan saldo pelanggan
     */
    public static void main (String[] args){
       /*
        c1.setName("Sanadhi", " Sutandi"); //mengeset nama customer c1
        cetak = c1.getName(); //mengcopy nama kostumer c1 ke variabel cetak
        a1.setBalance(101010); ///mengeset balance pada a1
        c1.setAccount(a1); //mengeset kostumer c1 dengan balance a1
        akun=c1.getAccount(); //mengcopy nilai account ke variabel akun
        balance = akun.getBalance(); //mengcopy nilai balance dari akun ke variabel balance
        System.out.println(balance); //mencetak nilai balance
        System.out.println(cetak); //mencetak nilai cetak
        */
         
        Scanner in = new Scanner(System.in);
        
        System.out.println("Apakah Anda ingin membuat akun pelanggan? (y/n) ");
        userResponse = in.nextLine().toUpperCase();
        
        //Method untuk menampilkan waktu
        Customer c1 = new Customer (fname, lname, ( new 
        GregorianCalendar(Integer.parseInt(year),Integer.parseInt(month), Integer.parseInt(day)).getTime()));
                
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
        
        //simpledate format waktu 24jam
        SimpleDateFormat startclose = new SimpleDateFormat("k:m");
        
        
        //Perhitungan Interset Rates
        Account saving = new Account ('S', 1000);//Akun saving menyimpan saldo 1000
        Account invest = new Account ('I', 1000);////Akun invest menyimpan saldo 1000
        Account creditline = new Account ('C', 500);//Akun creditline menyimpan saldo 500
        
        //konversi double ke big decimal
        BigDecimal balanceSaving = new BigDecimal (saving.getBalance());
        BigDecimal balanceInvest = new BigDecimal (invest.getBalance());
        BigDecimal balanceCredit = new BigDecimal (250);
        
        BigDecimal rSaving = new BigDecimal (.03); //rates saving 3% per tahun, dihitung setiap hari
        BigDecimal rInvest = new BigDecimal (.07); //rates invest 7% per tahun, dihitung setiap hari
        BigDecimal rCredit = new BigDecimal (.18); //rates credit 7% per tahun, dihitung setiap hari
        BigDecimal n = new BigDecimal (360); //jumlah bunga dikumpulkan setiap tahun, 1 th= 360hr
        BigDecimal t = new BigDecimal (1.0); //Lama tabungan untuk 1 th
        
        //Formula 1 (r/n + 1)
        BigDecimal f1Saving = rSaving.divide(n, hitung).add(new BigDecimal(1.0));
        BigDecimal f1Invest = rInvest.divide(n, hitung).add(new BigDecimal(1.0));
        BigDecimal f1Credit = rCredit.divide(n, hitung).add(new BigDecimal(1.0));
        
        //Formula 2 P(r/n + 1)
        BigDecimal f2Saving = balanceSaving.multiply(f1Saving, hitung);
        BigDecimal f2Invest = balanceInvest.multiply(f1Invest, hitung);
        BigDecimal f2Credit = balanceCredit.multiply(f1Credit, hitung);
        
        
        //formula 3 n*t
        BigDecimal f3Saving = n.multiply(t, hitung);
        BigDecimal f3Invest = n.multiply(t, hitung);
        BigDecimal f3Credit = n.multiply(t, hitung);
        
        //formula 4 f2^f3
        double f4Saving = Math.pow(f2Saving.doubleValue(), f3Saving.doubleValue());
        double f4Invest = Math.pow(f2Invest.doubleValue(), f3Invest.doubleValue());
        double f4Credit = Math.pow(f2Credit.doubleValue(), f3Credit.doubleValue());
       
       
        if (userResponse.equals("Y")){
            do{
                System.out.println("Nama depan: ");
                fname = in.nextLine();
                System.out.println("Nama belakang: ");
                lname = in.nextLine();
                System.out.println("Nomor telepon: ");
                phone = in.nextLine();
                
                //Memberikan nilai pada no HP
                c1.setPhoneNumber(phone);
                
                //Membuat fungsi baru, yaitu bank, untuk memberitahukan waktu operasinal bank. 
                Bank bank = new Bank();
                
                
                System.out.println("\nJenis akun yang tersedia: (S/O/C/I)");
                System.out.println("S = Savings\nO = Overdraft\nC = Credit Checking\nI = Investment");
                System.out.println("Pilih jenis akun: ");
                AcctType = in.nextLine().toUpperCase();
                
                //Fungsi kondisonal jika user memilih tipe akun "S"
                if(AcctType.equals("S")){
                    System.out.println("\n=== Anda Memilih Jenis Akun Savings ===\n");
                    System.out.println("Masukkan Jumlah Saldo Anda: ");
                    Balance=in.nextInt();
                    a1 = new Account('S', Balance);
                    
                }
                
                //Fungsi kondisonal jika user memilih tipe akun "O"
                else if(AcctType.equals("O")){
                    System.out.println("\n=== Anda Memilih Jenis Akun Overdraft ===\n");
                    System.out.println("Masukkan Jumlah Saldo Anda: ");
                    Balance=in.nextDouble();
                    a1 = new Account('O', Balance);
                }
                 
                //Fungsi kondisonal jika user memilih tipe akun "C"
                else if(AcctType.equals("C")){
                    System.out.println("\n=== Anda Memilih Jenis Akun Credit Checking ===\n");
                    System.out.println("Masukkan Jumlah Saldo Anda: ");
                    Balance=in.nextDouble();
                    a1 = new Account('C', Balance);
                }
                    
                //Fungsi kondisonal jika user memilih tipe akun "I"
                else if(AcctType.equals("I")){
                    System.out.println("\n=== Anda Memilih Jenis Akun Investment ===\n");
                    System.out.println("Masukkan Jumlah Saldo Anda: ");
                    Balance=in.nextDouble();
                    a1 = new Account('I', Balance);
                }
                
                //Fungsi kondisonal jika user tidak memilih tipe akun "S,O,C,I"
                else{
                     a1 = new Account();
                }
                
                //Menampilkan informasi akun user
                System.out.println("\nInformasi Akun Anda :");
                System.out.println("Nama\t\t: " + fname+ " " +lname);
                System.out.println("Tanggal Lahir\t: " + c1.getDOB());
                System.out.println("No HP\t\t: " + c1.getPhoneNumber());
                System.out.println("ID\t\t: " + c1.getCustomerId());
                System.out.println("Tipe akun\t: " + a1.getAcctType());
                System.out.println("Saldo\t\t: " + a1.getBalance());
                System.out.println(bank.getHoursOfOperation());
                
                //Bunga Bank
                System.out.println("\nBunga bank pada Jbank :\n");  
                
                //Tampilan hasil perhitungan Interset Rates
                System.out.println("Saldo Tabungan (saving): " +saving.getBalance());
                System.out.println("Saldo Investasi (invest): "+invest.getBalance());        
                System.out.println("Bunga Tabungan (saving): " + f4Saving);
                System.out.println("Bunga Investasi (invest): " +f4Invest);
                System.out.println("Bunga Credit : " +f4Credit);
                
        
                
                System.out.println("\nAnda ingin membuat account lagi? (y/n)");
                userResponse = in.nextLine().toUpperCase();
                userResponse = in.nextLine().toUpperCase();
                
                //Jika user tidak mau membuat akun lagi
                if(userResponse.equals("N")){
                    System.out.println("Terima telah menggunakan layanan kami...\n");
                    System.exit(0);
                }
            }
            while(userResponse.equals("Y"));
        }
        
        //Jika user tidak mau membuat akun
        else {
            System.out.println("Terima telah menggunakan layanan kami...\n");
            System.exit(0);
        }
    }
    
   
    
}   