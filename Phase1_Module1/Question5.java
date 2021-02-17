/* 
Author: xie yanan
5. 编程题
使用双重循环实现五子棋游戏棋盘的绘制， 棋盘界面的具体效果如下：

  0 1 2 3 4 5 6 7 8 9 a b c d e f
0 + + + + + + + + + + + + + + + +
1 + + + + + + + + + + + + + + + + 
2 + + + + + + + + + + + + + + + + 
3 + + + + + + + + + + + + + + + + 
4 + + + + + + + + + + + + + + + + 
5 + + + + + + + + + + + + + + + + 
6 + + + + + + + + + + + + + + + + 
7 + + + + + + + + + + + + + + + + 
8 + + + + + + + + + + + + + + + + 
9 + + + + + + + + + + + + + + + + 
a + + + + + + + + + + + + + + + + 
b + + + + + + + + + + + + + + + + 
c + + + + + + + + + + + + + + + + 
d + + + + + + + + + + + + + + + + 
e + + + + + + + + + + + + + + + + 
f + + + + + + + + + + + + + + + + 

*/

import java.lang.String;
// ref. print in hex
// https://stackoverflow.com/questions/9321553/java-convert-integer-to-hex-integer

public class Question5 {
	public static void main(String[] args) {
		for (int row=-1; row<=15; row++) {
			for (int col=-1; col<=15; col++) {
				if (col==-1 && row==-1) {
					System.out.print("  ");
				} else if (row==-1 && col>=0) {
					System.out.print("" + String.format("%x ", col));
				} else if (col==-1 && row>=0) {
					System.out.print("" + String.format("%x ", row));
				} else {
					System.out.print("+ ");
				}
			}
			System.out.println();
		}	
	}
}


// alternative

// public class Question5 {
// 	public static void main(String[] args) {

// 		for (int row=-1; row<=15; row++) {
// 			if (row==-1) {
// 				for (int col=-1; col<=15; col++) {
// 					if (col==-1) {
// 						System.out.print("  ");
// 					} else {
// 						System.out.print(String.format("%x ", col));
// 						
// 					}

// 				}
// 			}
// 			if (row >= 0) {
// 				for (int col=-1; col<=15; col++) {
// 					if (col==-1) {
// 						System.out.print("" + String.format("%x ", row));
// 					} else {
// 						System.out.print("+ ");
// 					}
// 				}
// 			}
// 			System.out.println();
			
// 		}
 
// 	}
// }
