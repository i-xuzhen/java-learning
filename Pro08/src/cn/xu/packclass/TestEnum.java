package cn.xu.packclass;

import java.util.Random;

/**
 * 测试枚举，
 * 设置一组常量
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
			System.out.println("春天");
			break;
		case SUMMER:
			System.out.println("夏天");
			break;
		case AUTUNM:
			System.out.println("秋天");
			break;
		case WINDTER:
			System.out.println("冬天");	
			break;
	}
  }
}

enum Season{
	SPRING,SUMMER,AUTUNM,WINDTER
}

enum Week{
	星期一,星期二,星期三,星期四,星期五,星期六,星期日
}

