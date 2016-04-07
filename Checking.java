/**
 * Kelas Abstrak Checking adalah kelas extends dari Account. Kelas ini memeriksa jika
 * Customer ingin menarik saldo melebihi dari saldo yang disimpan di Saving Account
 * @author Rendro Pribadi
 * @version 26/02/2016
 */
public abstract class Checking extends Account {
    protected double monthlyFee;
    /**
     * Metode abstrak untuk mengecek biaya Checking Account
     */
    protected abstract void feeAssessment();
    
    /**
     * Metode abstrak untuk mengecek biaya Checking Account
     */
    public void resetMonthlyFee() {
        monthlyFee = 0;
    }
    
    public double getMonthlyFee() {
        return monthlyFee;
    }
}