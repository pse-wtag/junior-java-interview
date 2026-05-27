/**
 *  What OOP violations are present here?
 */
public class Worker {
    public String name;

    public void performDuty(String role) {
        if (role.equals("DEVELOPER")) {
            System.out.println("Writing code...");
        } else if (role.equals("MANAGER")) {
            System.out.println("Scheduling meetings...");
        }
    }
}