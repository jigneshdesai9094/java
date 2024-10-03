import javax.swing.*;
import java.awt.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.File;

class imageOperation {
    // get key oparation
    public static void keyOperation(int key, String in, String msg) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(null);
        File file = fileChooser.getSelectedFile();
        try {
            FileInputStream fis = new FileInputStream(file);
            byte[] data = new byte[fis.available()];
            fis.read(data);
            int i = 0;

            for (byte b : data) {
                if (in == "in") {
                    data[i] = (byte) (b ^ key);
                    System.out.println(b);
                    i++;
                } else {
                    data[i] = (byte) (data[i] ^ key);
                    System.out.println(b);
                    i++;
                }
            }
            FileOutputStream f = new FileOutputStream(file);
            f.write(data);
            f.close();
            fis.close();
            JOptionPane.showMessageDialog(null, msg);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        JFrame f = new JFrame();
        f.setLocationRelativeTo(null);
        f.setTitle("image operation");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(900, 500);
        f.setLocationRelativeTo(null);

        JPanel contentPanel = new JPanel();
        contentPanel.add(new JLabel("Welcome to the application!"));
        f.getContentPane().add(contentPanel, BorderLayout.CENTER);
        f.setLayout(null);
        contentPanel.setBounds(0, 500, 300, 0);
        // create first button
        JButton button = new JButton();
        button.setText("Choose file for increption");
        button.setPreferredSize(new Dimension(220, 26)); // Set size
        button.setFont(new Font("Arial", Font.BOLD, 13)); // Set font
        button.setBackground(Color.LIGHT_GRAY); // Set background color
        button.setForeground(Color.BLACK); // Set text color

        // create second button
        JButton button2 = new JButton();
        button2.setText("Choose file for decreption");
        button2.setPreferredSize(new Dimension(220, 26)); // Set size
        button2.setFont(new Font("Arial", Font.BOLD, 13)); // Set font
        button2.setBackground(Color.LIGHT_GRAY); // Set background color
        button2.setForeground(Color.black); // Set text color

        // create text box
        JTextField text = new JTextField(10);
        text.setPreferredSize(new Dimension(200, 26));
        JTextField text2 = new JTextField(10);
        text2.setPreferredSize(new Dimension(200, 26));

        // get key function call
        button.addActionListener(e -> {
            String t = text.getText();
            if (t.isEmpty()) {
                JOptionPane.showMessageDialog(null, "something wrong please,enter increpted key");
            } else {
                int temp = Integer.parseInt(t);
                String in = "in";
                String msg = "increpted";
                keyOperation(temp, in, msg);
            }

        });
        button2.addActionListener(e -> {
            String t2 = text2.getText();
            if (t2.isEmpty()) {
                JOptionPane.showMessageDialog(null, "something wrong please,enter decrepted key");
            } else {
                int temp2 = Integer.parseInt(t2);
                String in = "de";
                String msg = "Decrepted";
                keyOperation(temp2, in, msg);
            }
        });

        f.setLayout(new FlowLayout());
        f.add(button);
        f.add(text);
        f.add(button2);
        f.add(text2);
        // Dimension size =button2.getPreferredSize();
        // button2.setBounds(100, 500, size.width, size.height);
        f.setVisible(true);
    }
}