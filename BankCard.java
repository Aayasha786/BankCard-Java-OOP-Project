 public class BankCard
 {
    private int cardID;
    private String client_name;
    private String issuer_bank;
    private String bank_account;
    private int balance_amount;
    
        public BankCard(int cardID,String issuer_bank,String bank_account,int balance_amount)
        {
            this.cardID=cardID; // assigning the parameter cardID  to instance variable cardID//
            this.issuer_bank=issuer_bank;//assigning the parameter issuer_bank  to instance variable issuer_bank//
            this.bank_account=bank_account;//assigning the parameter bank_account to instance variable bank_account//
            this.balance_amount=balance_amount;//assigning the parameter balance_amount to instance variable balance_amount//
            this.client_name="";
        }
            public int getCardID()
            {
                return this.cardID;
                
            }
            public String getIssuer_bank()
            {
                return this.issuer_bank;
                
            }
            public String getBank_accoun()
            {
                return this.bank_account;
                
            }
            public int getBalance_amount()
            {
                return this.balance_amount;
            }
            public String getClient_name()
            {
               return this.client_name; 
            }
            public void setClient_name(String client_name)
            {
                this.client_name=client_name;
            }
            public void setBalance_amount(int balance_amount)
            {
                this.balance_amount=balance_amount;
            }
                
            
        public void display(){
            if(client_name=="")
            {
                System.out.print("Please! enter your name");
                
            }
            else
            {
                System.out.println("The cardID is"+cardID);// The cardID will be printed//
                System.out.println("The client name is "+client_name);// The client name will be printed//
                System.out.println("The Bank_account is"+bank_account);// The bank_account will be printed//
                System.out.println("The Balance_amount is "+balance_amount);// The balance_amount will be printed//
                
            }
            
        }
            
            
            
            
            
            
            
            
            
        
 }