import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.text.*;

class MyFrame1 extends JFrame implements KeyListener
{ 
    JTextPane jt=new JTextPane();
    StyledDocument doc ;
    SimpleAttributeSet style;
 
    MyFrame1()
    {
        setTitle("Java Code Editor");
        setSize(600, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(jt,BorderLayout.CENTER);
        jt.addKeyListener(this);
        doc = jt.getStyledDocument();
        style = new SimpleAttributeSet();
        StyleConstants.setForeground(style, Color.BLUE);
    }
    @Override
     public void keyPressed(KeyEvent e) {
        // try
        // {
           
        //    String arr[]={"public"};
        //    int pos = jt.getCaretPosition();
        //    System.out.println("Pos ="+pos);
        //    for(String a:arr)
        //    {
        //     int beg=pos-(a.length()-1);
        //     if(beg>=0)
        //      System.out.println(jt.getText(0,4));
        //      //if(a.length()-1>=0)
        //        //System.out.println(jt.getText(a.length()-1,a.length()));
        //    }
        // }catch(Exception err)
        // {
        //     err.printStackTrace();
        // }
         
     }
     
     @Override
     public void keyReleased(KeyEvent e) {
        try
        {
           
           String arr[]={"public","static","void","if","for","switch"};
           int pos = jt.getCaretPosition();
           System.out.println("Pos ="+pos);
           for(String a:arr)
           {
            int beg=pos-(a.length());
            
            if(beg>=0)
            {
             System.out.println(jt.getText(beg,a.length()));
             String s=jt.getText(beg,a.length());
             if((s.trim()).equals(a))
              doc.setCharacterAttributes(beg, a.length(), style, false);
            }
             //if(a.length()-1>=0)
               //System.out.println(jt.getText(a.length()-1,a.length()));
           }
        }catch(Exception err)
        {
            err.printStackTrace();
        }
         
     }

     @Override
     public void keyTyped(KeyEvent e) {
         // TODO Auto-generated method stub
         
     }
}
public class MyFrame{

     public static void main(String[] args) {
        MyFrame1 f=new MyFrame1();
     
     }
     
    
      
}
