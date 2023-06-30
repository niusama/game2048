package softwa2048;

import javax.swing.*;
import java.util.Random;
public class random {
    public  static  boolean randomnum(int map[][])
    {
        if(!check(map))return false ;
        Random randomnumx=new Random();
        Random randomnumy=new Random();
        int x=Math.abs( randomnumx.nextInt(4)+1);
        int y=Math.abs( randomnumy.nextInt(4)+1);
        if(map[x][y]==0)
        {
            map[x][y]=((randomnumx.nextInt(9)%2)+1)*2;
            return true;
        }else return randomnum(map);
    }
    public static  boolean check(int map[][])
    {
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=4;j++)
            {
                if(map[i][j]==0)
                    return true;//alive
            }
        }
        return false;//die
    }
    public static void gameover(JFrame jj)
    {
        String route="D:\\MYJAVA\\MYJAVAFILE+\\helloworld\\src\\softwa2048\\image\\A-"+"lose"+".png";
        JLabel image=new JLabel(new ImageIcon(route));
        image.setBounds(0,0,500,500);
        jj.add(image);
    }

}
