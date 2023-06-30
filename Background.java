package softwa2048;

import javax.swing.*;

public class Background {
    public static  void setBackground(JFrame jj,int sum)
    {
        String route="D:\\MYJAVA\\MYJAVAFILE+\\helloworld\\src\\softwa2048\\image\\A-"+"Background"+".jpg";
        JLabel image=new JLabel(new ImageIcon(route));
        image.setBounds(0,0,500,500);
        JLabel score=new JLabel("µÃ·Ö£º"+sum);
        score.setBounds(0,0,50,50);
        jj.add(score);
        jj.add(image);
    }
}
