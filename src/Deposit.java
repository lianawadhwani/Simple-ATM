import java.util.*; 

public class Deposit {
  private HashMap <String,Double >  account; 
 
  public Deposit() {
	  account=new HashMap <String, Double>(); 
  }
  
 
  public void deposit (String iD, double amount) {
	  if (account.containsKey(iD)==true){
		 double num= account.get(iD); 
		 num=num+amount; 
		 account.replace(iD,num); 
	  }
	  else {
		  account.put(iD,amount); 
	  }
  }
  
  public String checkBalance (String identification) {
	  if (account.containsKey(identification)==false) {
		  return ("account does not exist"); 
	  }
	  else {
		  double mon= account.get(identification); 
		  return ""+(mon); 
	  } 
  }
  
public void withdraw(String iD, double amount) {
	
	if(amount<0 || amount > account.get(iD)) {
		System.out.println("Not a valid amount to withdraw. Transaction canceled.");
	}
	else {
		account.replace(iD, account.get(iD)-amount);

	}
	
}


 public static void main (String[] args) {
	 Deposit cash = new Deposit (); 
		cash.deposit("Winfrey", 25159684372.43);
		cash.deposit("Bezos", 193495330293.43);
		cash.deposit("Bezos", 20394353.35);
		cash.withdraw("Bezos", 3593293.66);
		cash.deposit("MrTheiss",64033.55);
		cash.withdraw("MrTheiss", 443964.46);
		System.out.println(cash.checkBalance("Bezos")); 
		System.out.println(cash.checkBalance("Winfrey")); 
		cash.checkBalance("YoMama");
		System.out.println(cash.checkBalance("MrTheiss"));  
  }
}

 // note to self, instead of importing or opening project just create a new one and set path to local repository on desktop
 

