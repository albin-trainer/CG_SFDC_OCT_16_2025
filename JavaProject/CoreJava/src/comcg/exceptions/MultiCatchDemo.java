package comcg.exceptions;

public class MultiCatchDemo {
    public static void main(String[] args) {
        BankApp bank=new BankApp(5000);
        String r=bank.withDrawAmt(1000);
        System.out.println(r);
    }
}
