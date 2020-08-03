
import java.awt.*;
import javax.swing.*;

public class BallGame extends JFrame{

  Image ball = Toolkit.getDefaultToolkit().getImage("image/ball.png");
  Image desk = Toolkit.getDefaultToolkit().getImage("image/desk.jpg");
  
  double x=100;
  double y=100;
  boolean right=true;
  
  public void paint(Graphics g) {
	  System.out.println("窗口被画了一次！");
	  g.drawImage(desk,0,0,null);
	  g.drawImage(ball,(int)x,(int)y,null);
	  if(right) {
		  x=x+10;
	  }else {
		  x=x-10;
	  }
	  if(x>856-40-30) {//856是窗口宽度，40是桌子边框的宽度，30是小球直径
		  right=false;
	  }
	  if(x<40) {//40是桌子边框宽度
		  right=true;
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
		BallGame game=new BallGame();
		game.launchFrame();
		
	}
}
