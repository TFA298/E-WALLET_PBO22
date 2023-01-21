package ViewGUI;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public abstract class MainFrame extends JFrame {

    public MainFrame(String title, int lenght , int width){
         setTitle(title);
         setSize(width, lenght);
         setLayout(null);
         setLocationRelativeTo(null);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    protected abstract void component();
    protected abstract void event();

    @Override
    public void setVisible(boolean b){
        if (b == true){
            component();
            event();
        }
        super.setVisible(b);
    }

    protected void boundedAdd(Component com, int x, int y, int width, int height){
        int constX = 15, constY = 55;
        x = x-(constX/2);
        y = y-(constY/2);
        width = width+(constX/2);
        com.setBounds(x,y,width,height);
        add(com);
    }

    protected void setSize(Component com, int size){
        Font oldFont = com.getFont();
        Font newFont = new Font(oldFont.getFontName(),oldFont.getStyle(),size);
        com.setFont(newFont);
    }

    protected ImageIcon loadImage(String imagePath, int width, int height) {
       try {
           BufferedImage bImage;
           Image imgrResize;
           ImageIcon imgIcon = null;

           bImage = ImageIO.read(new File(imagePath));

           imgrResize = bImage.getScaledInstance(width,height,Image.SCALE_SMOOTH);

           imgIcon = new ImageIcon(imgrResize);

           return  imgIcon;
       }catch (IOException ex){
           return null;
       }
    }
}
