
public class DebitCard extends BankCard
{
        private int Pin_number;
        private int Withdrawal_Amount;
        private String Date_of_withdrawal;
        private boolean hasWithdrawn;
        
        
        public DebitCard(int balance_amount,int cardID,String bank_account,String issuer_bank,String client_name,int Pin_number)
        {
            super(cardID,issuer_bank,bank_account,balance_amount);//Call is made to parent class BankCard class//
            this.Pin_number=Pin_number;// assign the parameter Pin_number to instance variable Pin_number//
            setClient_name(client_name);
            hasWithdrawn=false;// According to question, the haswithdrawn is assigned to boolean value false//
            
            
            
           
        }
            public int getpin_number()//accessor method//
            {
              return this.Pin_number;  
            }
            public int getwithdrawal_Amount()
            {
                return this.Withdrawal_Amount;
            }
            public String getdate_of_withdrawal()
            {
              return this. Date_of_withdrawal;  
            }
            public boolean getHasWithdrawn()
            {
               return this.hasWithdrawn; 
            }
            
            public void setwithdrawal_Amount(int Withdrawal_Amount)//setter method//
            {
                this.Withdrawal_Amount=Withdrawal_Amount;
            }
            
            public void Withdraw( int Withdrawal_Amount,String Date_of_withdrawal,int Pin_number)// A method Withdraw is created//
            {
               this.Withdrawal_Amount=Withdrawal_Amount;
               this.Date_of_withdrawal=Date_of_withdrawal;
               this.Pin_number=Pin_number;
               
               
               if(this.Pin_number==Pin_number) 
               {
                  System.out.println("Pin number is valid!");
                      if(getBalance_amount()>= Withdrawal_Amount)
                      {
                      hasWithdrawn=true;
                      setBalance_amount(getBalance_amount()-Withdrawal_Amount);
                      System.out.println("Your amount has been withdrawn");
                      System.out.println("Your withdrawn amount is" +Withdrawal_Amount);
                      System.out.println("Your balance amount is" +getBalance_amount());
                      }
                      else
                      {
                      
                      System.out.println("Your balance amount is insufficient");
                      }
               }
               else
               {
                 System.out.println("The Pin you entered is invalid!");  
               }
            }
            
            public void display()//A method display is created//
            {
                if(hasWithdrawn=true)
                {
                    super.display();
                    System.out.println("Your Pin number is "+Pin_number);// This will print Pin_number//
                    System.out.println("Your withdrawal amount is" +Withdrawal_Amount);// This will print the amount withdrawn//
                    System.out.println("Your date of withdrawn is"+ Date_of_withdrawal);// This will print the date od amount withdrawn//
                }
                else
                {
                   System.out.println("Your balance amount is"+ super.getBalance_amount()); // call is made to superclass//
                }
                
            }
            
            
       
}