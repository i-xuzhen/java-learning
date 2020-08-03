/**
 * 测试多选择结构
 * @author shen
 *
 */
public class TestMultIFELSE {
	public static void main(String[] args) {
		int age=(int)(100*Math.random());
		if(age<15) {
			System.out.println("儿童，喜欢玩！");
		}else if(age<45){
			System.out.println("青年，要学习！");
		}else if(age<65) {
			System.out.println("中老年，多运动");
		}else if(age<85) {
			System.out.println("老年，学点新东西保持年轻心态！");
		}else {
			System.out.println("老寿星！");
		}
	}
}
