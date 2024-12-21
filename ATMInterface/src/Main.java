import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        User userObj = new User();

        System.out.println("==============================================");
        System.out.print("Enter your username: ");
        String user = in.next();
        userObj.setUser(user);

        System.out.print("Enter your password: ");
        String password = in.next();

        if (!userObj.checkUserWithPassword(password)) {
            System.out.println("Invalid credentials! Exiting...");
            return;
        }

        AtmMachine atmMachine = new AtmMachine(userObj);

        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = in.nextInt();

            switch (choice) {
                case 1:
                    atmMachine.getBalance();
                    break;
                case 2:
                    System.out.print("Enter the amount to deposit: ");
                    int depositAmount = in.nextInt();
                    atmMachine.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter the amount to withdraw: ");
                    int withdrawAmount = in.nextInt();
                    atmMachine.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
