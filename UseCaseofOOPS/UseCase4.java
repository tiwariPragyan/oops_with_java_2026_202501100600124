package oops_with_java_2026_202501100600124.UseCaseofOOPS;


public class UseCase4 {
    public static void main(String[] args) {
        double balance = 5000.0;
        double withdrawAmount = 1500.0;
        // TODO: call withdraw() inside a try block,
        // catch InsufficientBalanceException,
        // and use finally to print "Transaction attempt completed."
        try{
            if(withdrawAmount > balance) throw new InsufficientBalanceException("Insufficient Balance");
            else withdraw(balance, withdrawAmount);
        }catch(InsufficientBalanceException e){
            System.out.println(e);
        }finally{
            System.out.println("Transaction attempt completed.");
        }
    }
    static void withdraw(double balance, double amount){
    // TODO: throw InsufficientBalanceException if amount > balance
    // otherwise print "Withdrawal successful. New balance: " + (balance - amount)
        balance = balance - amount;
        System.out.println("Withdrawal successful. New balance: " + balance);
    }
}

class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(String msg){
        super(msg);
    }
}


