import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.io.IOException;

class test {
    public static void main(String[] args) throws IOException {
        int k = 0, z = 0, op = 0;
        readfile r = new readfile();
        BuySell bs = new BuySell();
        holdings h = new holdings();
        Visvesvarayatable vs = new Visvesvarayatable();


        JFrame frame = new JFrame("VSE");


        JOptionPane.showMessageDialog(frame, "Welcome to Visvesvaraya Stock Exchange");
        tabledata td = new tabledata();

        while (op < 5) {
            r.openFile();


            String Username = JOptionPane.showInputDialog(frame, "Enter your Username");

            for (int i = 0; i < 4; i++) {
                String s = r.UsernameFile();
                if (s.equalsIgnoreCase(Username)) {
                    k = 1;

                }
            }

            if (k == 1) {
                JOptionPane.showMessageDialog(frame, "Enter Password");
                String Password = JOptionPane.showInputDialog(frame, "Enter your Password");
                for (int i = 0; i < 4; i++) {
                    String ss = r.PasswordFile();

                    if (ss.equalsIgnoreCase(Password)) {
                        z = 1;

                    }
                }
                if (z == 1) {
                    JOptionPane.showMessageDialog(frame, "Login Successful");
                    break;

                }
            } else {
                JOptionPane.showMessageDialog(frame, "Renter Credentials");
            }

        }
        while (true) {
            int buy = Integer.parseInt(JOptionPane.showInputDialog(frame, "Enter your Choice\n1. BUY Stocks\n2.Sell Stocks\n3.EXIT"));
            if (buy == 1) {
                JOptionPane.showMessageDialog(frame, "Buy Stocks here");
                bs.Buy();
            }
            if (buy == 2) {
                h.hold();
            } else
                System.exit(0);


        }
    }

}



