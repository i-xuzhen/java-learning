
import java.awt.*;
import javax.swing.*;

public class BallGame2 extends JFrame{

  Image ball = Toolkit.getDefaultToolkit().getImage("image/ball.png");
  Image desk = Toolkit.getDefaultToolkit().getImage("image/desk.jpg");
  
  double x=100;
  double y=100;
 
  double degree=3.14/3; //弧度60度；
  
  public void paint(Graphics g) {
	  System.out.println("窗口被画了一次！");
	  g.drawImage(desk,0,0,null);
	  g.drawImage(ball,(int)x,(int)y,null);

	  x=x+10*Math.cos(degree);
	  y=y+10*Math.sin(degree); 	  
	  
	  if(y>500-40-30||y<80) {
		  degree=-degree;
	  }
	  if(x<40||x>856-40-30) {
		  degree=3.14-degree;
	  }
  }
	  
  
  
  //窗口加载
	void launchFrame() {
		setSize(856,500);
		setLocation(50,50);
		setVisible(true);
		
 //重画
		while(true) {
			repaint();
			try {
				Thread.sleep(40);//40ms,1秒=1000毫秒，大约一秒画25次窗口
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println("hello world!");
		BallGame2 game=new BallGame2();
		game.launchFrame();
		
	}
}
