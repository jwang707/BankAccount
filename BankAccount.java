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
    return ("#" + Integer.toString(getAccountID()) + "\t $" + getBalance());
  }

  public String setPassword(String password){
    this.password = password;
    return password;
  }

  public int getAccountID() {return accountID;}
  public double getBalance() {return balance;}

  public boolean deposit(double amount){
      if (amount >= 0) {
        this.balance = balance + amount;
        return true;
      }
      return false;
  }

  public boolean withdraw(double amount){
    if (balance - amount > 0 && amount >= 0) {
      this.balance = balance - amount;
      return true;
    }
    return false;
  }

  private boolean authenticate(String password){
    return (this.password.equals(password));
  }

  public boolean transferTo(BankAccount other, double amount, String password){
    if (authenticate(password) && withdraw(amount)) {
      this.balance -= amount;
      other.balance += amount;
      return true;
    }

    return false;
  }






}
