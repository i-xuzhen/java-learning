
import java.awt.*;
import javax.swing.*;

public class BallGame2 extends JFrame{

  Image ball = Toolkit.getDefaultToolkit().getImage("image/ball.png");
  Image desk = Toolkit.getDefaultToolkit().getImage("image/desk.jpg");
  
  double x=100;
  double y=100;
 
  double degree=3.14/3; //����60�ȣ�
  
  public void paint(Graphics g) {
	  System.out.println("���ڱ�����һ�Σ�");
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
	  
  
  
  //���ڼ���
	void launchFrame() {
		setSize(856,500);
		setLocation(50,50);
		setVisible(true);
		
 //�ػ�
		while(true) {
			repaint();
			try {
				Thread.sleep(40);//40ms,1��=1000���룬��Լһ�뻭25�δ���
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
