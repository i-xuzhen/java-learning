package pro04;
/*
 * ���Թ��캯��
 */

class Point{
	double x,y;
	//���췽��������Ҫһ��
    public Point(double $x, double $y) {
        x = $x;
        y = $y;
    }
    public double getDitance(Point p) {
    	return Math.sqrt((x- p.x)*(x-p.x)+(y-p.y)*(y-p.y));
    }
	
}

public class TestConstructor {
	public static void main(String[] args) {
		Point p= new Point(3.0,4.0);
		Point origin= new Point(0.0,0.0);
		
		System.out.println(p.getDitance(origin));
	}
}
