public class Tester{
  public static void main(String[] args){
    BankAccount myacc = new BankAccount(11037, "ping");
    BankAccount boom = new BankAccount(21, "pong");
    System.out.println(myacc.toString());
    System.out.println(myacc.deposit(340304.39));
    System.out.println(myacc.toString());
    System.out.println(myacc.withdraw(304.39));
    System.out.println(myacc.toString());

    System.out.println(myacc.withdraw(50000)); // true
    System.out.println(myacc.withdraw(-5)); // false
    System.out.println(myacc.deposit(-5)); // false
    System.out.println(myacc.toString());

    System.out.println(myacc.transferTo(boom, 40000, "ping")); // true
    System.out.println(myacc.toString());
    System.out.println(boom.toString());

  }
}
