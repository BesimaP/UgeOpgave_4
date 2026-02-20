import java.util.ArrayList;

    public class BankAccount {
        String owner;
        Double balance;
        ArrayList<Transaction>transactions = new ArrayList<>();

        public BankAccount(String owner, double startBalance){
            this.owner = owner;
            this.balance = startBalance;
            this.transactions = new ArrayList<>();
            //Tilføj start balance som transaction
            transactions.add(new Transaction("deposit", startBalance));
        }

        public void deposit(double amount) {
            if(amount > 0){
                balance = balance + amount;
                Transaction t = new Transaction("deposit", amount);
                transactions.add(t);
                System.out.println("Indsatte " + amount + " kr.");
            }
        }

        public void withdraw(double amount) {
            if(amount > 0 && amount <= balance){
                balance = balance - amount;
                Transaction t = new Transaction("withdraw", amount);
                transactions.add(t);

                System.out.println("Hævede " + amount + " kr.");
            } else if (amount > balance) {
                System.out.println("Ikke nok penge på kontoen");
            }
        }

        public void printTransactionHistory(){
            System.out.println("\n~~~Transaktionshistorisk for " + owner + " ~~~");
            int transactionNumber = 1;
            for (Transaction t : transactions){
                transactionNumber++;
            }
        }

        public double getBalance(){
            return balance;
        }
    }