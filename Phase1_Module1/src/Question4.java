/* 
Author: xie yanan
4. 编程题
自定义数组扩容规则，当已存储元素数量达到总容量的 80%时，扩容 1.5 倍。
例如，总容量是 10，当输入第 8 个元素时，数组进行扩容，容量从 10 变 15。
*/

import java.util.Scanner;

public class Question4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一个整数，自定义数组的初始容量：");

		int initLength = sc.nextInt();
		int[] myArray = new int[initLength];

		System.out.println("现在你拥有了一个容量为"+initLength+"的数组，我们开始游戏吧");
		boolean continueGame = true;
		int myIndex = 0;

		while (continueGame) {
			for (int index=myIndex; index<=initLength*.8-1; index++) {
			    System.out.println("请输入第"+(index+1)+"个数字：");
			    myArray[index] = sc.nextInt();
			    myIndex++;
		    }
		    System.out.println("哇哦，已经占用了80%的数组容量，还要继续吗？ Y/N");

		    if (sc.next().equals("Y")) {
		    	continueGame = true;
		    	initLength *= 1.5;
		        myArray = new int[initLength];
		        System.out.println("好的，已成功经为你扩容1.5倍，当前容量为"+initLength+"，游戏继续!");

		    } else {
		    	continueGame = false;
		    }

		}

		System.out.println("放弃继续扩容，游戏结束，再见！");



	}
}
