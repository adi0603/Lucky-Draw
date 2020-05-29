import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
class Lucky_Draw extends JFrame implements ActionListener
{
    JTextField t1=new JTextField(75);
    JLabel l1=new JLabel("Enter Names Separating with commas");
    JTextField e1=new JTextField(15);
    JButton b2=new JButton("           ENTER          ");
    JLabel l2=new JLabel("                                                                Valency                                                                                            ");
    JLabel l3=new JLabel("  Author   :   ADITYA PANDEY");
    public Lucky_Draw()
    {
        setLayout(new FlowLayout());
        setSize(1000,200);
        setVisible(true);
        setResizable(false);
        setTitle("  LUCKY DRAW ");
        add(l1);
        add(t1);
        add(b2);
        b2.addActionListener(this);
        add(l2); 
        e1.setEditable(false);
        add(e1);
        add(l3);
    }

    public void actionPerformed(ActionEvent l)
    {
        try
        { 
            String a=t1.getText().toUpperCase();
            StringTokenizer st=new StringTokenizer(a,",");
            String na[]=new String[20];
            String s="";
            int i=0;
            while(st.hasMoreTokens())
            {
                na[i]=st.nextToken();
                i++;
            }
            int r=(int)((i-1+1)*Math.random()+1);
            s=na[r-1];
            e1.setText(s);
        }
        catch(Exception y)
        {
            e1.setText("ERROR");
        }
    }

    public static void main(String args[])
    {
        Lucky_Draw ob=new Lucky_Draw();
    }
}