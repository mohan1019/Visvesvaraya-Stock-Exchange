import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class BuySell {

    private static final
    double  constant = 0.1;
    double total = 0;
    JFrame frame = new JFrame("VSE");
    private Scanner z;
    //Double sc=1000.0,ISE=900.0,ECE=800.0,TCE=700.0,EEE=600.0;
   // Double ME=500.0;
    double cs,is,ec,ee,tc,me;
    Boolean s=true;




   public void Buy() {


       while (true) {
           String buy1 = JOptionPane.showInputDialog(frame, "Enter your choice\n1.CSE\n2.ISE\n3.ECE\n4.TCE\n5.EEE\n6.ME\n7.EXIT");
           if (buy1.equalsIgnoreCase("1")) {
               try {
                   z = new Scanner(new File("H:\\VSE\\src\\Data.txt"));
               } catch (FileNotFoundException e) {
               }
               while (z.hasNext()) {
                   cs = Double.parseDouble(z.next());
                   is = Double.parseDouble(z.next());
                   ec = Double.parseDouble(z.next());
                   tc = Double.parseDouble(z.next());
                   ee = Double.parseDouble(z.next());
                   me = Double.parseDouble(z.next());
               }


               int ch = Integer.parseInt(JOptionPane.showInputDialog(frame, "Enter the number of Stocks"));
               total = ch * cs;
               JOptionPane.showMessageDialog(frame, "total " + total); //Transactions Function should b called here
               cs += ch * constant;


               try {

                   FileWriter fw = new FileWriter("H:\\VSE\\src\\Data.txt");
                   FileWriter fin = new FileWriter("H:\\VSE\\src\\Holdings.txt", true);
                   fw.write(Double.toString(cs));
                   fw.write(" ");
                   fw.write(Double.toString(is));
                   fw.write(" ");
                   fw.write(Double.toString(ec));
                   fw.write(" ");
                   fw.write(Double.toString(tc));
                   fw.write(" ");
                   fw.write(Double.toString(ee));
                   fw.write(" ");
                   fw.write(Double.toString(me));
                   fin.write("cs");
                   fin.write(" ");
                   fin.write(Double.toString(ch));
                   fin.write(" ");
                   fin.write(Double.toString(cs));
                   fin.write("\n");


                   fw.close();
                   fin.close();
               } catch (Exception e) {
               }

           }
           if (buy1.equalsIgnoreCase("2")) {
               try {
                   z = new Scanner(new File("H:\\VSE\\src\\Data.txt"));
               } catch (FileNotFoundException e) {

               }
               while (z.hasNext()) {
                   cs = Double.parseDouble(z.next());
                   is = Double.parseDouble(z.next());
                   ec = Double.parseDouble(z.next());
                   tc = Double.parseDouble(z.next());
                   ee = Double.parseDouble(z.next());
                   me = Double.parseDouble(z.next());
               }
               int ch = Integer.parseInt(JOptionPane.showInputDialog(frame, "Enter the number of Stocks"));
               total = ch * is;
               JOptionPane.showMessageDialog(frame, "total " + total); //Transactions Function should b called here
               is += ch * constant;


               try {
                   FileWriter fw = new FileWriter("H:\\VSE\\src\\Data.txt");
                   FileWriter fin = new FileWriter("H:\\VSE\\src\\Holdings.txt", true);
                   fw.write(Double.toString(cs));
                   fw.write(" ");
                   fw.write(Double.toString(is));
                   fw.write(" ");
                   fw.write(Double.toString(ec));
                   fw.write(" ");
                   fw.write(Double.toString(tc));
                   fw.write(" ");
                   fw.write(Double.toString(ee));
                   fw.write(" ");
                   fw.write(Double.toString(me));
                   fin.write("is");
                   fin.write(" ");
                   fin.write(Double.toString(ch));
                   fin.write(" ");
                   fin.write(Double.toString(is));
                   fin.write("\n");


                   fw.close();
                   fin.close();
               } catch (Exception e) {
               }
           }
           if (buy1.equalsIgnoreCase("3")) {
               try {
                   z = new Scanner(new File("H:\\VSE\\src\\Data.txt"));
               } catch (FileNotFoundException e) {

               }
               while (z.hasNext()) {
                   cs = Double.parseDouble(z.next());
                   is = Double.parseDouble(z.next());
                   ec = Double.parseDouble(z.next());
                   tc = Double.parseDouble(z.next());
                   ee = Double.parseDouble(z.next());
                   me = Double.parseDouble(z.next());
               }
               int ch = Integer.parseInt(JOptionPane.showInputDialog(frame, "Enter the number of Stocks"));
               total = ch * ec;
               JOptionPane.showMessageDialog(frame, "total " + total); //Transactions Function should b called here
               ec += ch * constant;


               try {
                   FileWriter fw = new FileWriter("H:\\VSE\\src\\Data.txt");
                   FileWriter fin = new FileWriter("H:\\VSE\\src\\Holdings.txt", true);
                   fw.write(Double.toString(cs));
                   fw.write(" ");
                   fw.write(Double.toString(is));
                   fw.write(" ");
                   fw.write(Double.toString(ec));
                   fw.write(" ");
                   fw.write(Double.toString(tc));
                   fw.write(" ");
                   fw.write(Double.toString(ee));
                   fw.write(" ");
                   fw.write(Double.toString(me));
                   fin.write("ec");
                   fin.write(" ");
                   fin.write(Double.toString(ch));
                   fin.write(" ");
                   fin.write(Double.toString(ec));
                   fin.write("\n");


                   fw.close();
                   fin.close();
               } catch (Exception e) {
               }
           }
           if (buy1.equalsIgnoreCase("4")) {
               try {
                   z = new Scanner(new File("H:\\VSE\\src\\Data.txt"));
               } catch (FileNotFoundException e) {

               }
               while (z.hasNext()) {
                   cs = Double.parseDouble(z.next());
                   is = Double.parseDouble(z.next());
                   ec = Double.parseDouble(z.next());
                   tc = Double.parseDouble(z.next());
                   ee = Double.parseDouble(z.next());
                   me = Double.parseDouble(z.next());
               }
               int ch = Integer.parseInt(JOptionPane.showInputDialog(frame, "Enter the number of Stocks"));
               total = ch * tc;
               JOptionPane.showMessageDialog(frame, "total " + total); //Transactions Function should b called here
               tc += ch * constant;


               try {
                   FileWriter fw = new FileWriter("H:\\VSE\\src\\Data.txt");
                   FileWriter fin = new FileWriter("H:\\VSE\\src\\Holdings.txt", true);
                   fw.write(Double.toString(cs));
                   fw.write(" ");
                   fw.write(Double.toString(is));
                   fw.write(" ");
                   fw.write(Double.toString(ec));
                   fw.write(" ");
                   fw.write(Double.toString(tc));
                   fw.write(" ");
                   fw.write(Double.toString(ee));
                   fw.write(" ");
                   fw.write(Double.toString(me));
                   fin.write("tc");
                   fin.write(" ");
                   fin.write(Double.toString(ch));
                   fin.write(" ");
                   fin.write(Double.toString(tc));
                   fin.write("\n");


                   fw.close();
                   fin.close();
               } catch (Exception e) {
               }
           }
           if (buy1.equalsIgnoreCase("5")) {
               try {
                   z = new Scanner(new File("H:\\VSE\\src\\Data.txt"));
               } catch (FileNotFoundException e) {

               }
               while (z.hasNext()) {
                   cs = Double.parseDouble(z.next());
                   is = Double.parseDouble(z.next());
                   ec = Double.parseDouble(z.next());
                   tc = Double.parseDouble(z.next());
                   ee = Double.parseDouble(z.next());
                   me = Double.parseDouble(z.next());
               }
               int ch = Integer.parseInt(JOptionPane.showInputDialog(frame, "Enter the number of Stocks"));
               total = ch * ee;
               JOptionPane.showMessageDialog(frame, "total " + total); //Transactions Function should b called here
               ee += ch * constant;


               try {
                   FileWriter fw = new FileWriter("H:\\VSE\\src\\Data.txt");
                   FileWriter fin = new FileWriter("H:\\VSE\\src\\Holdings.txt", true);
                   fw.write(Double.toString(cs));
                   fw.write(" ");
                   fw.write(Double.toString(is));
                   fw.write(" ");
                   fw.write(Double.toString(ec));
                   fw.write(" ");
                   fw.write(Double.toString(tc));
                   fw.write(" ");
                   fw.write(Double.toString(ee));
                   fw.write(" ");
                   fw.write(Double.toString(me));
                   fin.write("ee");
                   fin.write(" ");
                   fin.write(Double.toString(ch));
                   fin.write(" ");
                   fin.write(Double.toString(ee));
                   fin.write("\n");


                   fw.close();
                   fin.close();
               } catch (Exception e) {
               }
           }
           if (buy1.equalsIgnoreCase("6")) {
               try {
                   z = new Scanner(new File("H:\\VSE\\src\\Data.txt"));
               } catch (FileNotFoundException e) {

               }
               while (z.hasNext()) {
                   cs = Double.parseDouble(z.next());
                   is = Double.parseDouble(z.next());
                   ec = Double.parseDouble(z.next());
                   tc = Double.parseDouble(z.next());
                   ee = Double.parseDouble(z.next());
                   me = Double.parseDouble(z.next());
               }
               int ch = Integer.parseInt(JOptionPane.showInputDialog(frame, "Enter the number of Stocks"));
               total = ch * me;
               JOptionPane.showMessageDialog(frame, "total " + total); //Transactions Function should b called here
               me += ch * constant;


               try {
                   FileWriter fw = new FileWriter("H:\\VSE\\src\\Data.txt");
                   FileWriter fin = new FileWriter("H:\\VSE\\src\\Holdings.txt", true);
                   fw.write(Double.toString(cs));
                   fw.write(" ");
                   fw.write(Double.toString(is));
                   fw.write(" ");
                   fw.write(Double.toString(ec));
                   fw.write(" ");
                   fw.write(Double.toString(tc));
                   fw.write(" ");
                   fw.write(Double.toString(ee));
                   fw.write(" ");
                   fw.write(Double.toString(me));
                   fin.write("me");
                   fin.write(" ");
                   fin.write(Double.toString(ch));
                   fin.write(" ");
                   fin.write(Double.toString(me));
                   fin.write("\n");


                   fw.close();
                   fin.close();
               } catch (Exception e) {
               }

           }
           if (buy1.equalsIgnoreCase("7"))
           {
               break;
           }
       }
   }




}




