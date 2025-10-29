package comcg.exceptions;
public class BankApp {
    private float balance;
    public BankApp(float balance) {
        this.balance = balance;
    }
    //use multi catch for single try block
    public String withDrawAmt(float amt){
         //if bal is insuffient throw
         // InSufficientFundsException with msg
          // and in catch block return the msg
         //if amt is less than or eq to 0 throw
         //InvalidInputException with msg
          // and in catch block return the msg
         //if all fine return "SUCCESS"
        return "";
    }
}
class InSufficientFundsException extends RuntimeException{
    InSufficientFundsException(String msg){
        super(msg);
    }
}
class InvalidInputException extends RuntimeException{
    InvalidInputException(String msg){
        super(msg);
    }
}