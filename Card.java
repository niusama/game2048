package softwa2048;

import javax.swing.*;

public class Card {
     int num=0;
     int x=0;
      int y=0;
    public Card(int x,int y,int num)
    {
        this.x=x;this.y=y;this.num=num;
    }
    public JLabel draw()
    {
        String route="D:\\MYJAVA\\MYJAVAFILE+\\helloworld\\src\\softwa2048\\image\\A-"+this.num+".png";
        JLabel image=new JLabel(new ImageIcon(route));
        image.setBounds(this.x*80,this.y*80,70,70);
        return image;
    }

}

