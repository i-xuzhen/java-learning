package cn.oo;
/**
 * ���Խӿں�ʵ����
 * @author shen
 *
 */
public class TestInterface {
	public static void main(String[] args) {
		Volant v=new Angel();
		v.fly();
		Honest h=new GoodMan();
		h.helpOther();
	}
}
/*
 * ���нӿ�
 */
interface Volant{
	int FLY_HIGHT=100;
	void fly();
}

interface Honest{
	void helpOther();
}

class Angel implements Volant,Honest{

	@Override
	public void helpOther() {
		System.out.println("Angel.helpOther()");// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		System.out.println("Angel.fly()");
		// TODO Auto-generated method stub
		
	}//ʵ�������ʵ�ֶ�����ӿ�
	
}

class GoodMan implements Honest{

	@Override
	public void helpOther() {
		System.out.println("GoodMan.helpOther");// TODO Auto-generated method stub
		
	}
	
}

class BirdMan implements Volant{

	@Override
	public void fly() {
		System.out.println("BirdMan.fly()");// TODO Auto-generated method stub
		
	}
	
}