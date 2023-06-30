package softwa2048;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;
import javax.swing.*;
import softwa2048.*;


public class Main {
    static int map[][]=new int[5][5];
    static  int sum=0;
    static JFrame mainframe=new JFrame("2048游戏");
    public  static  void main(String []arg)
    {

        mainframe.setSize(550,550);
        mainframe.setDefaultCloseOperation(3);
        mainframe.setAlwaysOnTop(true);
        mainframe.setLayout(null);
        drawimage();
        key();//获取键盘上下左右
        arrytest();
        mainframe.setVisible(true);
    }
    public static void drawimage()
    {

        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=4;j++)
            {
                Card image=new Card(i,j,map[i][j]);
                mainframe.add(image.draw());
            }
        }
        Background.setBackground(mainframe,sum);
    }

    public static  void key()
    {
        mainframe.setFocusable(true);
        mainframe.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                int code=e.getKeyCode();
                System.out.println(code);
                switch (code)
                {
                    case 38:{//left;
                        System.out.println("左");
                        stransmap(37);
                    };break;
                    case 37:{//up
                        System.out.println("上");
                        stransmap(38);

                    };break;
                    case 40:{//right
                        System.out.println("右");
                        stransmap(39);

                    };break;
                    case 39:{//down
                        System.out.println("下");
                        stransmap(40);
                    };break;
                }
                mainframe.getContentPane().removeAll();
               if(!random.randomnum(map))
               {
                random.gameover(mainframe);
               }
                drawimage();
//                mainframe.setVisible(false);
//                mainframe.setVisible(true);
                mainframe.repaint();
                System.out.println("***********");
            }
        });

    }
    public static  void stransmap(int direct )
    {

        switch (direct)
        {
            case 38://up
            {
                for(int i=1;i<=4;i++)
                {
                    for(int j=1;j<=4;j++)
                    {
                        System.out.println("yes");
                        digui(i,j,direct);
                    }
                }
            } break;
            case 40:{//down

                for(int i=4;i>=1;i--)
                {
                    for(int j=1;j<=4;j++)
                    {
                        System.out.println("yes");
                        digui(i,j,direct);
                    }
                }
            }break;
            case 37:
            {//left
                for(int j=1;j<=4;j++)
                    {
                        for(int i=1;i<=4;i++)
                        {
                        System.out.println("yes");
                        digui(i,j,direct);
                        }
                }
            }break;
            case 39:{//right
                for(int j=4;j>=1;j--)
                {
                    for(int i=1;i<=4;i++)
                    {
                        System.out.println("yes");
                        digui(i,j,direct);
                    }
                }
            }
        }
        arrytest();
    }
    public static  void digui(int i,int j,int k)
    {

        switch (k)
        {
            case 38:{
                if(i<=1)return ;
                if(map[i-1][j]==map[i][j])
                {
                    map[i-1][j]*=2;
                    sum+=map[i-1][j];
                    map[i][j]=0;
                }
                if(map[i-1][j]==0&&map[i][j]!=0)
                {
                  map[i-1][j]=map[i][j];
                  map[i][j]=0;
                }
                digui(i-1,j,k);
            }break;
            case 40:
            {//down
                    if(i>=4)return ;
                    if(map[i+1][j]==map[i][j])
                    {
                        map[i+1][j]*=2;
                        sum+=map[i+1][j];
                        map[i][j]=0;
                    }

                    if(map[i+1][j]==0&&map[i][j]!=0)
                    {
                        map[i+1][j]=map[i][j];
                        map[i][j]=0;
                    }
                    digui(i+1,j,k);
            }break;
            case 37:{//left
                if(j<=1)return ;
                if(map[i][j-1]==map[i][j])
                {
                    map[i][j-1]*=2;
                    sum+=map[i][j-1];
                    map[i][j]=0;
                }
                if(map[i][j-1]==0&&map[i][j]!=0)
                {
                    map[i][j-1]=map[i][j];
                    map[i][j]=0;
                }
                digui(i,j-1,k);
            }break;
            case 39:
                {//right
                    if(j>=4)return ;
                    if(map[i][j+1]==map[i][j])
                    {
                        map[i][j+1]*=2;
                        sum+=map[i][j+1];
                        map[i][j]=0;
                    }
                    if(map[i][j+1]==0&&map[i][j]!=0)
                    {
                        map[i][j+1]=map[i][j];
                        map[i][j]=0;
                    }
                    digui(i,j+1,k);
                }
            }
    }

        public  static  void arrytest()
        {
            for(int t=1;t<=4;t++)
            {
                for(int f=1;f<=4;f++)
                {
                    System.out.print(map[t][f]);
                }
                System.out.println();
            }
        }
}
