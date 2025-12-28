
public class CreditCard extends BankCard
{
    private int CVC_number;
    private double Credit_Limit;
    private double Interest_Rate;
    private String Expiration_Date;
    private int Grace_Period;
    private boolean isGranted;
    
    
 public CreditCard(int cardID,String client_name, String issuer_bank, String bank_account,int balance_amount,int CVC_number,double Interest_Rate,String Expiration_Date)
 {
     super( cardID,issuer_bank,bank_account,balance_amount);// Call is made to superclass BankCard//
     super.setClient_name( client_name);
     super.setBalance_amount( balance_amount);
     this.CVC_number=CVC_number;// assign the parameter CVC_number to instance variable CVC_number//
     this.Interest_Rate=Interest_Rate;//assigning the parameter Interest_Rate to instance variable Interest_Rate//
     this.Expiration_Date=Expiration_Date;//assigning the parameter Expiration_Date to instance variable Expiration_Date//
     this.isGranted=false;// isGranted to assigned to false//
     
 }
 public int getcvc_number()// accessor method//
 {

     return this.CVC_number;
 }
 
 public double getcredit_limit()
 {
     return this.Credit_Limit;
 }
 
 public double getinterest_rate()
 {
     return this.Interest_Rate;
     
 }
 
 public String getexpiration_date()
 {
     return this.Expiration_Date;
     
 }
 
 public int getgrace_period()
 {
     return this.Grace_Period;
     
 }
 
 public boolean getIsgranted(){
   return this.isGranted;  
 }
 
 
 public void creditlimit(double Credit_Limit,int Grace_Period)// A method creditlimit is created//
 {
     if(Credit_Limit<=(2.5* getBalance_amount()))
     {
        this.isGranted=true;
        this.Credit_Limit=Credit_Limit;
        this.Grace_Period=Grace_Period;
        System.out.println("Your credit card is issued");
     }
     else
     {
        isGranted=false;
        System.out.println("Sorry! your credit card cannot be issued");
     }
 }
 
 public void cancelCreditCard()//A method cancelCreditCard is created//
 {
     CVC_number=0;
     Credit_Limit=0;
     Grace_Period=0;
     
     isGranted=false;
 }
 
 public void Display()// A method Display is created//
 {
    if(isGranted=true)
        {
            super.display();
        
        System.out.println("Your CVC number is "+CVC_number);// This will print the CVC number//
        System.out.println("Your interest rate is" + Interest_Rate);// This will print the Interest rate//
        System.out.println("Your expiration date is" + Expiration_Date);// This will print the Expiration_Date//
        System.out.println ("Your credit granted is" + isGranted);// This will print the credit granted or not//
        
         }
    else
        {
            super.display();
        System.out.println("your credit granted is"+isGranted);
        }
 
     
 
     
    
    
    
    
}
}