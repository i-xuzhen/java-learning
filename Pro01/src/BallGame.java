
import java.awt.*;
import javax.swing.*;

public class BallGame extends JFrame{

  Image ball = Toolkit.getDefaultToolkit().getImage("image/ball.png");
  Image desk = Toolkit.getDefaultToolkit().getImage("image/desk.jpg");
  
  double x=100;
  double y=100;
  boolean right=true;
  
  public void paint(Graphics g) {
	  System.out.println("���ڱ�����һ�Σ�");
	  g.drawImage(desk,0,0,null);
	  g.drawImage(ball,(int)x,(int)y,null);
	  if(right) {
		  x=x+10;
	  }else {
		  x=x-10;
	  }
	  if(x>856-40-30) {//856�Ǵ��ڿ�ȣ�40�����ӱ߿�Ŀ�ȣ�30��С��ֱ��
		  right=false;
	  }
	  if(x<40) {//40�����ӱ߿���
		  right=true;
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
		BallGame game=new BallGame();
		game.launchFrame();
		
	}
}
