package cn.xu.packclass;

import java.util.Random;

/**
 * ����ö�٣�
 * ����һ�鳣��
 * @author shen
 *
 */
public class TestEnum {
	public static void main(String[] args) {
		for(Week k:Week.values()) {
			System.out.println(k);
		}
		Season a=Season.AUTUNM;
		switch(a) {
		case SPRING:
			System.out.println("����");
			break;
		case SUMMER:
			System.out.println("����");
			break;
		case AUTUNM:
			System.out.println("����");
			break;
		case WINDTER:
			System.out.println("����");	
			break;
	}
  }
}

enum Season{
	SPRING,SUMMER,AUTUNM,WINDTER
}

enum Week{
	����һ,���ڶ�,������,������,������,������,������
}

