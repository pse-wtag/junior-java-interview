/**
 *  How would you refactor this to be scalable, secure, and testable?
 */
public class OrderProcessor {
    public void processOrder(String orderType, double amount, String customerEmail) throws SQLException {
        if (orderType.equals("STANDARD")) {
            System.out.println("Processing standard order...");
            double tax = amount * 0.15;
            double total = amount + tax;
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "password");
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("INSERT INTO orders VALUES (" + total + ", '" + customerEmail + "')");
        } else if (orderType.equals("VIP")) {
            System.out.println("Processing standard order...");
            double tax = amount * 0.05;
            double total = amount + tax;
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "password");
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("INSERT INTO orders VALUES (" + total + ", '" + customerEmail + "')");
        }

        // Hardcoded Third-Party Notification
        SendGridClient client = new SendGridClient("api-key");
        client.send(customerEmail, "Order Processed!");
    }

    public class SendGridClient {
        private final String apiKey;
        public SendGridClient(String key) {
            apiKey = key;
        }

        public void send(String customerEmail, String s) {
            //send customer an email
        }
    }
}