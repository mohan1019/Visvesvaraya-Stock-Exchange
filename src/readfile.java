import javax.swing.*;
import java.util.*;
import java.io.*;
public class readfile
{
    private Scanner x;
    private Scanner y;

    JFrame frame = new JFrame("VSE");

    public void openFile()
    {
        try
        {
            x=new Scanner(new File("H:\\VSE\\src\\Username.txt"));
            y=new Scanner(new File("H:\\VSE\\src\\Password.txt"));

        }
        catch(Exception e)
        {
            System.out.println("File not found");
        }
    }

    public String UsernameFile() {

        while (x.hasNext()) {
            String a = x.next();
            return a;
        }
        return "";

    }
        public String PasswordFile()
        {

        while(y.hasNext()){
            String b=y.next();
            return b;
        }
        return "";

    }

    public void close()
    {
        x.close();
        y.close();
    }


}

            
           
      
           