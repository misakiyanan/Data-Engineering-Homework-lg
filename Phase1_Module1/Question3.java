/* 
Author: xie yanan
3. 编程题
实现双色球抽奖游戏中奖号码的生成，中奖号码由 6 个红球号码和 1 个蓝球号码组成。
其中红球号码要求随机生成 6 个 1~33 之间不重复的随机号码。
其中蓝球号码要求随机生成 1 个 1~16 之间的随机号码。
*/

import java.util.Random;

public class Question3 {
	public static void main(String[] args) {
		Random rand = new Random();

		int REDBALLS = 6;
		int BLUEBALLS = 1;
		int[] redNums = new int[REDBALLS];
		int blueNum;
		
		int upperboundRed = 32; // rand.nextInt generates[0,n), so we add 1
		int upperboundBlue = 15;


		// Red
		redNums[0] = rand.nextInt(upperboundRed) + 1;
		System.out.print("红色球号码：[ " + redNums[0] + " ");
		outer: for (int i=1; i<redNums.length; i++) {
			int randCurrent = rand.nextInt(upperboundRed) + 1;

			// check if already exists
			for (int j=0; j<i; j++) {
				if (randCurrent == redNums[j]) {
					i--;
					continue outer;

				} else {
					redNums[i] = randCurrent;
				}
			}
			System.out.print(""+redNums[i]+" ");
		}
		System.out.println("]");


		// Blue
		blueNum = rand.nextInt(upperboundBlue) + 1;
		System.out.println("蓝色球号码：[ " + blueNum + " ]");


	}
}