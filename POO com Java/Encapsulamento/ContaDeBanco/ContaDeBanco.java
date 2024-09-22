public class ContaDeBanco {
    public static void main(String[] args) {
        BankAccount conta = new BankAccount();

        conta.setAccountNumber(1234);
        conta.setBalance(350.32);

        System.out.println("A conta " + conta.getAccountNumber() + " tem saldo no valor de: U$" + conta.getBalance());

        conta.setAccountNumber(12345);
        System.out.println("O banco passou por uma mudança no sistema e alterou o número 5 no final de todas as contas.");

        conta.setBalance(390.41);
        System.out.println("A conta " + conta.getAccountNumber() + " recebeu uma quantia de depósito e tem saldo atualizado no valor de: R$" + conta.getBalance());
    }

    public static class BankAccount {
        private int accountNumber;
        private double balance;

        public double getBalance() {
            return balance;
        }

        public int getAccountNumber() {
            return accountNumber;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public void setAccountNumber(int accountNumber) {
            this.accountNumber = accountNumber;
        }
    }
}
