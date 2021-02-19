/*
Author: xie yanan

1. 编程实现以下需求：
定义一个长度为[16][16]的整型二维数组并输入或指定所有位置的元素值，
分别实现二维数组中所有行和所有列中所有元素的累加和并打印。
再分别实现二维数组中左上角到右下角和右上角到左下角所有元素的累加和并打印。
*/

public class Question1 {
	public static void main(String[] args) {

		int NUM = 16;

		int[][] twoDArray = new int[NUM][NUM];
		int element = 100;

		// insert elements
		for (int row=0; row<NUM; row++) {
			for (int col=0; col<NUM; col++) {
				twoDArray[row][col] = element;
				element++;
			}
		}


		// print 2D array
		System.out.println("【1】生成2维数组:");
		for (int row=0; row<NUM; row++) {
			for (int col=0; col<NUM; col++) {
				System.out.print(twoDArray[row][col] + " ");
			}
			System.out.println();
		}


		// accumulation
		int total = 0;
		
		for (int row=0; row<NUM; row++) {
			for (int col=0; col<NUM; col++) {
				total += twoDArray[row][col];
			}
		}
		System.out.println("【2】所有数字累加之和：" + total);


		// upper left -> bottom right
		int totalSlash = 0;
		System.out.print("【3】左上角到右下角的数字依次为：" );
		for (int row=0; row<NUM; row++) {
			System.out.print(twoDArray[row][row] + ", ");
			totalSlash += twoDArray[row][row];
		}
		System.out.println("累加之和：" + totalSlash);


		// upper right -> bottom left
		int totalBackSlash = 0;
		System.out.print("【4】右上角到左下角的数字依次为：" );
		for (int row=0; row<NUM; row++) {
			System.out.print(twoDArray[row][NUM-row-1] + ", ");
			totalBackSlash += twoDArray[row][NUM-row-1];
		}
		System.out.println("累加之和：" + totalBackSlash);

	}
}