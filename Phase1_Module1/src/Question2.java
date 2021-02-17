/* 
Author: xie yanan
2. 编程题
编程找出 1000 以内的所有完数并打印出来。
所谓完数就是一个数恰好等于它的因子之和， 如： 6=1＋2＋3
*/

public class Question2 {

	public static void main(String[] args) {
		System.out.print("1000以内的完数有：[ ");
		// int[] perfectNum = int[];

		for(int i=2; i<=1000; i++) {
			int[] factors = new int[i];
			factors[0] = 1;
			int factorIndex = 1;
			int sumOfFactors = 0;

			// find all factors
			for(int j=2; j<=i/2; j++) {
				if (i % j == 0) {
					factors[factorIndex] = j;
					factorIndex += 1;
				}
			}

			// calculate sum of factors
			for (int index=0; index<factors.length; index++) {
				sumOfFactors += factors[index];
			}

			// check if perfect number
			if (sumOfFactors == i) {
				System.out.print(""+i+" ");
			}


		}
		System.out.println("]");
	}
}
