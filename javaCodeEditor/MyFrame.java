import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;
import java.awt.*;


public class MyFrame extends JFrame implements KeyListener {
     JMenuBar jMenuBar;
     JMenu jMenu,jMenu2;
     JTextArea jTextArea;
     MyFrame()
     {
        // Menu Bar
        
        jMenuBar=new JMenuBar();
        jMenu=new JMenu("File");
        jMenu2=new JMenu("Edit");

        jMenuBar.add(jMenu);
        jMenuBar.add(jMenu2);
        this.setJMenuBar(jMenuBar);
         
       // Textarea
        jTextArea=new JTextArea();
        this.add(jTextArea,BorderLayout.CENTER);
        jTextArea.addKeyListener(this);
     }   
     @Override
     public void keyPressed(KeyEvent e) {
         // TODO Auto-generated method stub
         
     }
     @Override
     public void keyReleased(KeyEvent e) {
         // TODO Auto-generated method stub
         
     }
    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }
}
