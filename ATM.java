import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/* @author Rendro Pribadi
 * @version 8/04/2016
 */
public class ATM  {
    
   private JFrame mainFrame;
   private JLabel headerLabel;
   private JLabel statusLabel;
   private JPanel controlPanel;
   private JPanel contPanel;
   private Button btnWith, btnDeposit, btnExit;

   public ATM(){
      prepareGUI();
   }

   public static void main(String[] args){
      ATM  swingControlDemo = new ATM();      
      swingControlDemo.showTextAreaDemo();
   }

   private void prepareGUI(){
      mainFrame = new JFrame("Java Swing Examples");
      mainFrame.setSize(600,400);
      mainFrame.setLayout(new GridLayout(2, 1));
      mainFrame.addWindowListener(new WindowAdapter()
      {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      });    
      
     
      
      
      contPanel = new JPanel();
      contPanel.setLayout(new FlowLayout());
      
      controlPanel = new JPanel();
      controlPanel.setLayout(new FlowLayout());

      
      mainFrame.add(contPanel);
      mainFrame.add(controlPanel);
      

      mainFrame.setVisible(true);  
   }

   private void showTextAreaDemo(){
      
      JLabel  namelabel= new JLabel("Enter Customer ID: ", JLabel.RIGHT);
      final JTextField userText = new JTextField(10);
      contPanel.add(namelabel);
      contPanel.add(userText);
       
       /**
       * Text Field         
       * 
         */
       

      

      final JTextArea commentTextArea = 
         new JTextArea("Welcome",10,40);

      JScrollPane scrollPane = new JScrollPane(commentTextArea);    

      commentTextArea.setEnabled(false);
      controlPanel.add(scrollPane);        
      
      
      /**
       * Button         
       * 
         */
      
      //resources folder should be inside SWING folder.
      //ImageIcon icon = createImageIcon("/resources/java_icon.png","Java");

      JPanel panel = new JPanel();
      panel.setSize(300,300);
      GridLayout layout = new GridLayout(3,3);
      panel.setLayout(layout); 
      
        panel.add(new JButton("Deposit"));
      panel.add(new JButton("Withdraw")); 
      panel.add(new JButton("Exit")); 
 
      controlPanel.add(panel);
      
      
      /**
       * Radio Button         
       * 
         */
      
      JPanel panel1 = new JPanel();
      panel1.setBackground(Color.darkGray);
      panel1.setSize(300,300);
      GridLayout layout1 = new GridLayout(4,1);
      panel1.setLayout(layout1); 
      
      final JRadioButton radSavings = new JRadioButton("Savings");
      final JRadioButton radInvestment = new JRadioButton("Investment");
      final JRadioButton radLineOfCredit = new JRadioButton("Line of Credit");
      final JRadioButton radOverdraft = new JRadioButton("Overdraft");
      
      
      
      panel1.add(radSavings);
      panel1.add(radInvestment);
      panel1.add(radLineOfCredit);
      panel1.add(radOverdraft);
      
      contPanel.add(panel1);
      /**
       * Text Field     
       * 
         */
      
      
      
      
      JLabel  passwordLabel = new JLabel("Enter Amount Here: ", JLabel.CENTER);
      final JPasswordField passwordText = new JPasswordField(10);    
      contPanel.add(passwordLabel);       
      contPanel.add(passwordText);
     
      
      mainFrame.setVisible(true);  
   }
   
}