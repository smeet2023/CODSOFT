import java.util.HashMap;
import java.util.Map;

public class User {
    private Map<String, String> userWithPassWord = new HashMap<>() {{
        put("user1", "1234");
        put("user2", "qwe1234");
        put("user3", "abc1234");
    }};

    private String user;

    private Map<String, Integer> userWithBalance = new HashMap<>() {{
        put("user1", 100000);
        put("user2", 200000);
        put("user3", 100000);
    }};

    public boolean checkUserWithPassword(String password) {
        // Ensure null safety when getting the user's password.
        String storedPassword = userWithPassWord.get(user);
        return storedPassword != null && storedPassword.equals(password);
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Integer checkBalance() {
        return userWithBalance.get(user);
    }

    public Integer deposit(int amount) {
        int existingAmount = userWithBalance.get(user);
        userWithBalance.put(user, existingAmount + amount);
        return userWithBalance.get(user);
    }

    public String withdraw(int amount) {
        int balance = checkBalance();

        if (amount > balance) {
            return "Cannot withdraw more than the balance. Please try again! Your balance = " + balance;
        } else {
            userWithBalance.put(user, balance - amount); // Update balance in the map.
            return "Withdrawal Successful! Updated Balance = " + (balance - amount);
        }
    }
}
