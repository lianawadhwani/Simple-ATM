import java.util.*; 

public class Deposit {
  private String atmID;
  private double balance;
  private HashMap <String,Double >  account; 
  
  public Deposit(String ident, double amount){
	  balance=amount; 
	  //System.out.println(balance); 
	  atmID=ident; 
	  account=new HashMap <String, Double>(); 
	  account.put(atmID,balance); 
	 //  System.out.println(account.get(atmID)); 
  }
  
  public Deposit() {
	  account=new HashMap <String, Double>(); 
  }
  
 
  public void depsoitMoney (String iD, double amount) {
	  if (account.containsKey(iD)==true){
		 double num= account.get(iD); 
		 num=num+amount; 
		 account.replace(iD,num); 
	  }
	  else {
		  account.put(iD,amount); 
	  }
  }
  
  public double currentMoney (String identification) {
	  if (account.containsKey(identification)==false) {
		  System.out.println("Your account doesn't exsist. To create an account deposit money"); 
		  return (-1.0); 
	  }
	  else {
		  double mon= account.get(identification); 
		  return (mon); 
	  } 
  }

 public static void main (String[] args) {
	 Deposit cash = new Deposit ("Liana123", 213.7); 
	 cash.depsoitMoney("Hello123", 300.7); 
	 System.out.println(cash.currentMoney("Hello227")); 
	
	  
  }
}
