import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.awt.event.*;
import javax.swing.JScrollPane;
import javax.swing.table.*;
import javax.swing.*;
public class Visvesvarayatable extends JFrame
{

    protected JTable j;
    protected tabledata data;
    protected JLabel title;
    public Visvesvarayatable()
    {
        super("WATCHLIST");
        setSize(600,300);
        data=new tabledata();
        title=new JLabel(data.getTitle());
        title.setFont(new Font("TimesRoman",Font.BOLD,26));
        title.setForeground(Color.red);
        getContentPane().add(title,BorderLayout.NORTH);
        j=new JTable();
        j.setAutoCreateColumnsFromModel(false);
        j.setModel(data);
        for(int k1=0;k1<tabledata.columns.length;k1++)
        {
            DefaultTableCellRenderer ren=new DefaultTableCellRenderer();
            ren.setHorizontalAlignment(tabledata.columns[k1].alignment);
            TableColumn column=new TableColumn(k1,tabledata.columns[k1].width,ren,null);
            j.addColumn(column);
        }
        JTableHeader header=j.getTableHeader();
        header.setUpdateTableInRealTime(false);
        JScrollPane sp=new JScrollPane();
        sp.getViewport().add(j);
        getContentPane().add(sp,BorderLayout.CENTER);
        WindowListener wndCloser=new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        };
        addWindowListener(wndCloser);
        setVisible(true);
    }
    public static void main(String argv[])
    {
        new Visvesvarayatable();
    }
}
class watchlistData
{
    public String v_symbol;
    public String v_name;
    public Double v_lastprice;
    public Double v_open;
    public watchlistData(String symbol,String name,double lastprice,double open)
    {
        v_symbol=symbol;
        v_name=name;
        v_lastprice=new Double(lastprice);
        v_open=new Double(open);
    }
}
class ColumnData
{
    public String title;
    public int width;
    public int alignment;
    public ColumnData(String ti,int wi,int al)
    {
        title=ti;
        width=wi;
        alignment=al;
    }
}
class tabledata extends AbstractTableModel
{
    private Scanner z;
    double cs,is,ec,ee,tc,me;
    static final public ColumnData columns[]={
            new ColumnData("$YMBOL", 100,JLabel.LEFT),
            new ColumnData("NAME", 250,JLabel.LEFT),
            new ColumnData("LA$T", 100,JLabel.RIGHT),

    };
    public Vector visvesvaraya;
    public tabledata()
    {
        visvesvaraya=new Vector();
        setDefaultData();
    }
    public void setDefaultData()
    {

        try {
            z = new Scanner(new File("H:\\VSE\\src\\Data.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("gsfyuguy");

        }
        while(z.hasNext()) {
            cs = Double.parseDouble(z.next());
            is = Double.parseDouble(z.next());
            ec = Double.parseDouble(z.next());
            tc = Double.parseDouble(z.next());
            ee = Double.parseDouble(z.next());
            me = Double.parseDouble(z.next());
        }
        visvesvaraya.removeAllElements();
        visvesvaraya.addElement(new watchlistData("CSE","Computer science.",
                cs ,1000.0));
        visvesvaraya.addElement(new watchlistData("IS","Information Science",
                is,800.0));
        visvesvaraya.addElement(new watchlistData("EC","Electronics and Comms",
                ec,700.0));
        visvesvaraya.addElement(new watchlistData("TC","TeleCommunication",
                tc,900.0));
        visvesvaraya.addElement(new watchlistData("EE","Electrical and electronics",
                ee,600.0));
        visvesvaraya.addElement(new watchlistData("ME","Mechanical Engineering",
                me,500.0));

    }
    public int getRowCount()
    {
        return visvesvaraya==null?0:visvesvaraya.size();
    }
    public int getColumnCount()
    {
        return columns.length;
    }
    public String getColumnName(int column)
    {
        return columns[column].title;
    }
    public Object getValueAt(int nRow,int nCol)
    {
        if(nRow<0||nRow>=getRowCount())
            return "";
        watchlistData row=(watchlistData)visvesvaraya.elementAt(nRow);
        switch(nCol)
        {
            case 0:return row.v_symbol;
            case 1:return row.v_name;
            case 2:return row.v_lastprice;

        }
        return "";
    }
    public String getTitle()
    {
        return "WATCHLIST";
    }
}
        
    
        
    
        
                                               
    
    