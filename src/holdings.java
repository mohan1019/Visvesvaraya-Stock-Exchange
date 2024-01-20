import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class holdings {



        public void hold()
        {

            JFrame f= new JFrame("VSE");
            int cc=0,cc1=0,cc2=0,cc3=0,cc4=0,cc5=0;
            double total=0;
            Boolean s=true;
            String opt,opt1;
            int dialogButton = JOptionPane.YES_NO_OPTION;

      /*  JButton be=new JButton(new ImageIcon("D:\\icon.png"));
        be.setBounds(100,100,100, 40);
        f.add(be);
        f.setSize(300,400);
        f.setLayout(null);
        f.setVisible(true);*/
            String a,b,c;
            String[] hold1 = new String[2];
            String[] hold2= new String[2];
            String[] hold3= new String[2];
            Scanner z;
            try {
                while(s=true) {
                    z = new Scanner(new File("H:\\VSE\\src\\Holdings.txt"));
                    while (z.hasNext()) {
                        a = z.nextLine();
                        hold1 = a.split(" ");
                        while (z.hasNextLine()) {
                            b = z.nextLine();

                            hold2 = b.split(" ");


                            while (z.hasNextLine()) {

                                c = z.nextLine();
                                hold3 = c.split(" ");
                            }
                        }


                        opt = JOptionPane.showInputDialog(f, "1. You own " + hold1[1] + " Shares of " + hold1[0] + "\n"
                                + "2. You own " + hold2[1] + " Shares of " + hold2[0] + "\n" + "3. You own " + hold3[1] + " Shares of " + hold3[0] + "\n4. Exit");
                        if (opt.equalsIgnoreCase("1")) {


                            if (hold1[0].equalsIgnoreCase("CS")) {
                                if (cc == 1) {
                                    JOptionPane.showMessageDialog(f, "NO CS STOCKS LEFT TO SELL ");
                                    break;
                                }
                                int dialogresult = JOptionPane.showConfirmDialog(f, "DO U WANT SELL YOUR CS STOCKS ", "warning", dialogButton);
                                if (dialogresult == JOptionPane.YES_OPTION) {
                                    JOptionPane.showMessageDialog(f, "CS Stocks sold");
                                    total = Double.parseDouble(hold1[1]) * Double.parseDouble(hold1[2]);
                                    JOptionPane.showMessageDialog(f, "Total Money added to Account is " + total);


                                    cc++;

                                }
                                if (dialogresult == JOptionPane.NO_OPTION) {
                                    JOptionPane.showMessageDialog(f, "CS Stocks Not sold");
                                }
                            }
                            if (hold1[0].equalsIgnoreCase("is")) {
                                if (cc1 == 1) {
                                    JOptionPane.showMessageDialog(f, "NO IS STOCKS LEFT TO SELL ");
                                    break;
                                }
                                int dialogresult = JOptionPane.showConfirmDialog(f, "DO U WANT SELL YOUR IS STOCKS ", "warning", dialogButton);
                                if (dialogresult == JOptionPane.YES_OPTION) {
                                    JOptionPane.showMessageDialog(f, "IS Stocks sold");
                                    total = Double.parseDouble(hold1[1]) * Double.parseDouble(hold1[2]);
                                    JOptionPane.showMessageDialog(f, "Total Money added to Account is " + total);
                                    cc1++;
                                }
                                if (dialogresult == JOptionPane.NO_OPTION) {
                                    JOptionPane.showMessageDialog(f, "IS Stocks Not sold");
                                }
                            }
                            if (hold1[0].equalsIgnoreCase("EC")) {
                                if (cc2 == 1) {
                                    JOptionPane.showMessageDialog(f, "NO EC STOCKS LEFT TO SELL ");
                                    break;
                                }
                                int dialogresult = JOptionPane.showConfirmDialog(f, "DO U WANT SELL YOUR EC STOCKS ", "warning", dialogButton);
                                if (dialogresult == JOptionPane.YES_OPTION) {
                                    JOptionPane.showMessageDialog(f, "EC Stocks sold");
                                    total = Double.parseDouble(hold1[1]) * Double.parseDouble(hold1[2]);
                                    JOptionPane.showMessageDialog(f, "Total Money added to Account is " + total);
                                    cc2++;
                                }
                                if (dialogresult == JOptionPane.NO_OPTION) {
                                    JOptionPane.showMessageDialog(f, "EC Stocks Not sold");
                                }
                            }
                            if (hold1[0].equalsIgnoreCase("TC")) {
                                if (cc3 == 1) {
                                    JOptionPane.showMessageDialog(f, "NO TC STOCKS LEFT TO SELL ");
                                    break;
                                }
                                int dialogresult = JOptionPane.showConfirmDialog(f, "DO U WANT SELL YOUR TC STOCKS ", "warning", dialogButton);
                                if (dialogresult == JOptionPane.YES_OPTION) {
                                    JOptionPane.showMessageDialog(f, "TC Stocks sold");
                                    total = Double.parseDouble(hold1[1]) * Double.parseDouble(hold1[2]);
                                    JOptionPane.showMessageDialog(f, "Total Money added to Account is " + total);
                                    cc3++;
                                }
                                if (dialogresult == JOptionPane.NO_OPTION) {
                                    JOptionPane.showMessageDialog(f, "TC Stocks Not sold");
                                }
                            }
                            if (hold1[0].equalsIgnoreCase("EE")) {
                                if (cc4 == 1) {
                                    JOptionPane.showMessageDialog(f, "NO EE STOCKS LEFT TO SELL ");
                                    break;
                                }
                                int dialogresult = JOptionPane.showConfirmDialog(f, "DO U WANT SELL YOUR EE STOCKS ", "warning", dialogButton);
                                if (dialogresult == JOptionPane.YES_OPTION) {
                                    JOptionPane.showMessageDialog(f, "EE Stocks sold");
                                    total = Double.parseDouble(hold1[1]) * Double.parseDouble(hold1[2]);
                                    JOptionPane.showMessageDialog(f, "Total Money dded to Account is " + total);
                                    cc4++;
                                }
                                if (dialogresult == JOptionPane.NO_OPTION) {
                                    JOptionPane.showMessageDialog(f, "EE Stocks Not sold");
                                }
                            }
                            if (hold1[0].equalsIgnoreCase("ME")) {
                                if (cc5 == 1) {
                                    JOptionPane.showMessageDialog(f, "NO ME STOCKS LEFT TO SELL ");
                                    break;
                                }
                                int dialogresult = JOptionPane.showConfirmDialog(f, "DO U WANT SELL YOUR ME STOCKS ", "warning", dialogButton);
                                if (dialogresult == JOptionPane.YES_OPTION) {
                                    JOptionPane.showMessageDialog(f, "ME Stocks sold");
                                    total = Double.parseDouble(hold1[1]) * Double.parseDouble(hold1[2]);
                                    JOptionPane.showMessageDialog(f, "Total Money added to Account is " + total);
                                    cc5++;
                                }
                                if (dialogresult == JOptionPane.NO_OPTION) {
                                    JOptionPane.showMessageDialog(f, "ME Stocks Not sold");
                                }
                            }
                        }
                        if (opt.equalsIgnoreCase("2")) {

                            if (hold2[0].equalsIgnoreCase("CS")) {
                                if (cc == 1) {
                                    JOptionPane.showMessageDialog(f, "NO CS STOCKS LEFT TO SELL ");
                                    break;
                                }
                                int dialogresult = JOptionPane.showConfirmDialog(f, "DO U WANT SELL YOUR CS STOCKS ", "warning", dialogButton);
                                if (dialogresult == JOptionPane.YES_OPTION) {
                                    JOptionPane.showMessageDialog(f, "CS Stocks sold");
                                    total = Double.parseDouble(hold2[1]) * Double.parseDouble(hold2[2]);
                                    JOptionPane.showMessageDialog(f, "Total Money added to Account is " + total);
                                    cc++;
                                }
                                if (dialogresult == JOptionPane.NO_OPTION) {
                                    JOptionPane.showMessageDialog(f, "CS Stocks Not sold");
                                }
                            }
                            if (hold2[0].equalsIgnoreCase("is")) {
                                if (cc1 == 1) {
                                    JOptionPane.showMessageDialog(f, "NO IS STOCKS LEFT TO SELL ");
                                    break;
                                }
                                int dialogresult = JOptionPane.showConfirmDialog(f, "DO U WANT SELL YOUR IS STOCKS ", "warning", dialogButton);
                                if (dialogresult == JOptionPane.YES_OPTION) {
                                    JOptionPane.showMessageDialog(f, "IS Stocks sold");
                                    total = Double.parseDouble(hold2[1]) * Double.parseDouble(hold2[2]);
                                    JOptionPane.showMessageDialog(f, "Total Money added to Account is " + total);
                                    cc1++;
                                }
                                if (dialogresult == JOptionPane.NO_OPTION) {
                                    JOptionPane.showMessageDialog(f, "IS Stocks Not sold");
                                }
                            }
                            if (hold2[0].equalsIgnoreCase("EC")) {
                                if (cc2 == 1) {
                                    JOptionPane.showMessageDialog(f, "NO CS STOCKS LEFT TO SELL ");
                                    break;
                                }
                                int dialogresult = JOptionPane.showConfirmDialog(f, "DO U WANT SELL YOUR EC STOCKS ", "warning", dialogButton);
                                if (dialogresult == JOptionPane.YES_OPTION) {
                                    JOptionPane.showMessageDialog(f, "EC Stocks sold");
                                    total = Double.parseDouble(hold2[1]) * Double.parseDouble(hold2[2]);
                                    JOptionPane.showMessageDialog(f, "Total Money added to Account is " + total);
                                    cc2++;
                                }
                                if (dialogresult == JOptionPane.NO_OPTION) {
                                    JOptionPane.showMessageDialog(f, "EC Stocks Not sold");
                                }
                            }
                            if (hold2[0].equalsIgnoreCase("TC")) {
                                if (cc3 == 1) {
                                    JOptionPane.showMessageDialog(f, "NO TC STOCKS LEFT TO SELL ");
                                    break;
                                }
                                int dialogresult = JOptionPane.showConfirmDialog(f, "DO U WANT SELL YOUR TC STOCKS ", "warning", dialogButton);
                                if (dialogresult == JOptionPane.YES_OPTION) {
                                    JOptionPane.showMessageDialog(f, "TC Stocks sold");
                                    total = Double.parseDouble(hold2[1]) * Double.parseDouble(hold2[2]);
                                    JOptionPane.showMessageDialog(f, "Total Money added to Account is " + total);
                                    cc3++;
                                }
                                if (dialogresult == JOptionPane.NO_OPTION) {
                                    JOptionPane.showMessageDialog(f, "TC Stocks Not sold");
                                }
                            }
                            if (hold2[0].equalsIgnoreCase("EE")) {
                                if (cc4 == 1) {
                                    JOptionPane.showMessageDialog(f, "NO EE STOCKS LEFT TO SELL ");
                                    break;
                                }
                                int dialogresult = JOptionPane.showConfirmDialog(f, "DO U WANT SELL YOUR EE STOCKS ", "warning", dialogButton);
                                if (dialogresult == JOptionPane.YES_OPTION) {
                                    JOptionPane.showMessageDialog(f, "EE Stocks sold");
                                    total = Double.parseDouble(hold2[1]) * Double.parseDouble(hold2[2]);
                                    JOptionPane.showMessageDialog(f, "Total Money dded to Account is " + total);
                                    cc4++;
                                }
                                if (dialogresult == JOptionPane.NO_OPTION) {
                                    JOptionPane.showMessageDialog(f, "EE Stocks Not sold");
                                }
                            }
                            if (hold2[0].equalsIgnoreCase("ME")) {
                                if (cc5 == 1) {
                                    JOptionPane.showMessageDialog(f, "NO ME STOCKS LEFT TO SELL ");
                                    break;
                                }
                                int dialogresult = JOptionPane.showConfirmDialog(f, "DO U WANT SELL YOUR ME STOCKS ", "warning", dialogButton);
                                if (dialogresult == JOptionPane.YES_OPTION) {
                                    JOptionPane.showMessageDialog(f, "ME Stocks sold");
                                    total = Double.parseDouble(hold2[1]) * Double.parseDouble(hold2[2]);
                                    JOptionPane.showMessageDialog(f, "Total Money added to Account is " + total);
                                    cc5++;
                                }
                                if (dialogresult == JOptionPane.NO_OPTION) {
                                    JOptionPane.showMessageDialog(f, "ME Stocks Not sold");
                                }
                            }
                        }
                        if (opt.equalsIgnoreCase("3")) {
                            if (hold3[0].equalsIgnoreCase("CS")) {
                                if (cc == 1) {
                                    JOptionPane.showMessageDialog(f, "NO CS STOCKS LEFT TO SELL ");
                                    break;
                                }
                                int dialogresult = JOptionPane.showConfirmDialog(f, "DO U WANT SELL YOUR CS STOCKS ", "warning", dialogButton);
                                if (dialogresult == JOptionPane.YES_OPTION) {
                                    JOptionPane.showMessageDialog(f, "CS Stocks sold");
                                    total = Double.parseDouble(hold3[1]) * Double.parseDouble(hold3[2]);
                                    JOptionPane.showMessageDialog(f, "Total Money added to Account is " + total);
                                    cc++;
                                }
                                if (dialogresult == JOptionPane.NO_OPTION) {
                                    JOptionPane.showMessageDialog(f, "CS Stocks Not sold");
                                }
                            }
                            if (hold3[0].equalsIgnoreCase("IS")) {
                                int dialogresult = JOptionPane.showConfirmDialog(f, "DO U WANT SELL YOUR IS STOCKS ", "warning", dialogButton);
                                if (cc1 == 1) {
                                    JOptionPane.showMessageDialog(f, "NO IS STOCKS LEFT TO SELL ");
                                    break;
                                }
                                if (dialogresult == JOptionPane.YES_OPTION) {
                                    JOptionPane.showMessageDialog(f, "IS Stocks sold");
                                    total = Double.parseDouble(hold3[1]) * Double.parseDouble(hold3[2]);
                                    JOptionPane.showMessageDialog(f, "Total Money added to Account is " + total);
                                    cc1++;
                                }
                                if (dialogresult == JOptionPane.NO_OPTION) {
                                    JOptionPane.showMessageDialog(f, "IS Stocks Not sold");
                                }
                            }
                            if (hold3[0].equalsIgnoreCase("EC")) {
                                int dialogresult = JOptionPane.showConfirmDialog(f, "DO U WANT SELL YOUR EC STOCKS ", "warning", dialogButton);
                                if (cc2 == 1) {
                                    JOptionPane.showMessageDialog(f, "NO EC STOCKS LEFT TO SELL ");
                                    break;
                                }
                                if (dialogresult == JOptionPane.YES_OPTION) {
                                    JOptionPane.showMessageDialog(f, "EC Stocks sold");
                                    total = Double.parseDouble(hold3[1]) * Double.parseDouble(hold3[2]);
                                    JOptionPane.showMessageDialog(f, "Total Money added to Account is " + total);
                                    cc2++;
                                }
                                if (dialogresult == JOptionPane.NO_OPTION) {
                                    JOptionPane.showMessageDialog(f, "EC Stocks Not sold");
                                }
                            }
                            if (hold3[0].equalsIgnoreCase("TC")) {
                                if (cc3 == 1) {
                                    JOptionPane.showMessageDialog(f, "NO TC STOCKS LEFT TO SELL ");
                                    break;
                                }
                                int dialogresult = JOptionPane.showConfirmDialog(f, "DO U WANT SELL YOUR TC STOCKS ", "warning", dialogButton);
                                if (dialogresult == JOptionPane.YES_OPTION) {
                                    JOptionPane.showMessageDialog(f, "TC Stocks sold");
                                    total = Double.parseDouble(hold3[1]) * Double.parseDouble(hold3[2]);
                                    JOptionPane.showMessageDialog(f, "Total Money added to Account is " + total);
                                    cc3++;
                                }
                                if (dialogresult == JOptionPane.NO_OPTION) {
                                    JOptionPane.showMessageDialog(f, "TC Stocks Not sold");
                                }
                            }
                            if (hold3[0].equalsIgnoreCase("EE")) {
                                if (cc4 == 1) {
                                    JOptionPane.showMessageDialog(f, "NO EE STOCKS LEFT TO SELL ");
                                    break;
                                }
                                int dialogresult = JOptionPane.showConfirmDialog(f, "DO U WANT SELL YOUR EEE STOCKS ", "warning", dialogButton);
                                if (dialogresult == JOptionPane.YES_OPTION) {
                                    JOptionPane.showMessageDialog(f, "EE Stocks sold");
                                    total = Double.parseDouble(hold3[1]) * Double.parseDouble(hold3[2]);
                                    JOptionPane.showMessageDialog(f, "Total Money dded to Account is " + total);
                                    cc4++;
                                }
                                if (dialogresult == JOptionPane.NO_OPTION) {
                                    JOptionPane.showMessageDialog(f, "EE Stocks Not sold");
                                }
                            }
                            if (hold3[0].equalsIgnoreCase("ME")) {
                                if (cc5 == 1) {
                                    JOptionPane.showMessageDialog(f, "NO ME STOCKS LEFT TO SELL ");
                                    break;
                                }
                                int dialogresult = JOptionPane.showConfirmDialog(f, "DO U WANT SELL YOUR ME STOCKS ", "warning", dialogButton);
                                if (dialogresult == JOptionPane.YES_OPTION) {
                                    JOptionPane.showMessageDialog(f, "ME Stocks sold");
                                    total = Double.parseDouble(hold3[1]) * Double.parseDouble(hold3[2]);
                                    JOptionPane.showMessageDialog(f, "Total Money added to Account is " + total);
                                    cc5++;
                                }
                                if (dialogresult == JOptionPane.NO_OPTION) {
                                    JOptionPane.showMessageDialog(f, "ME Stocks Not sold");
                                }
                            }
                        }
                        if (opt.equalsIgnoreCase("4")) {
                            System.exit(0);
                        }
                    }
                    z.close();

                }
            }catch (FileNotFoundException e) {
                System.out.println("File not found");
            }
        }
    }
