package org.pklearning.jdbc.testConnection1;

public class ConnectionCheck {
    public static void main(String[] args) {
        try {
            ConnectComponent comp = new ConnectComponent();

            if (comp.tryConnection()) {
                System.out.println("Demo m2c1:");
                System.out.println("The attempt to Connection was a SUCCESS");
            } else {
                System.out.println("Demo m2c1:");
                System.out.println("The attempt to Connection FAILED");
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
