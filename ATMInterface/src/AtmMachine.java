public class AtmMachine implements MachineInterface {
    private User user; // Reference to the `User` object.

    public AtmMachine(User user) {
        this.user = user;
    }

    @Override
    public void getBalance() {
        System.out.println("Your current balance is: " + user.checkBalance());
    }

    @Override
    public void withdraw(int amount) {
        String result = user.withdraw(amount);
        System.out.println(result);
    }

    @Override
    public void deposit(int amount) {
        int newBalance = user.deposit(amount);
        System.out.println("Deposit Successful! Updated Balance = " + newBalance);
    }
}
