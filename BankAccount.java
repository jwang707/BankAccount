public class BankAccount{
  private int accountID;
  private String password;
  private double balance;

  public BankAccount(int accountID, String password){
    this.accountID = accountID;
    this.password = password;
    this.balance = 0;
  }

  public String toString(){
    return (Integer.toString(getAccountID()) + "\t" + getBalance());
  }

  public int getAccountID() {return accountID;}
  public double getBalance() {return balance;}
}
