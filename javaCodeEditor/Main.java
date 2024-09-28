import javax.swing.JFrame;

public class Main
{
    public static void main(String args[])
    {
          MyFrame f=new MyFrame();
          f.setTitle("Java Code Editor");
          f.setVisible(true);
          f.setSize(500, 500);
          f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}