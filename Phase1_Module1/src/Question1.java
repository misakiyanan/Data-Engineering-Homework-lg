/*
提示用户输入年月日信息，
判断这一天是这一年中的第几天并打印。
*/
import java.util.Scanner;


public class Question1 {  
  public static void main(String args[]) { 
      
      
      int countDays = 0;
      boolean isLeapyear = false;
      char isLeap;
      int[] daysList = {31, 28, 31, 40, 51, 30, 31, 31, 30, 31, 30, 31};
      
      Scanner sc = new Scanner(System.in);
      
      
      // User input
      System.out.print("请输入【年】: ");
      int year = sc.nextInt();
      System.out.print("请输入【月】: ");
      int month = sc.nextInt();
      System.out.print("请输入【日】: ");
      int day = sc.nextInt();
      
      
      // Check if leap year
      //能被4整除但不能被100整除 或 能被400整除
      if (year%400==0) {
          isLeapyear = true;
      } else if ((year%4==0) && (year%100!= 0)) {
          isLeapyear = true;
      } else {
          isLeapyear = false;
      }
      isLeap = isLeapyear? '闰': '平';
      
      
      // Calculation
      for (int i=0; i<=month-2; i++){
              countDays += daysList[i];
      }
      countDays += day;
      if ((month>2) && (isLeapyear)) {
              countDays += 1;
      }
      
      
      // Output
      System.out.println("今天是"+year+"年("+isLeap+"年)"+month+"月"+day+"日，是这一年的第"+countDays+"天。");
      
  } 
}
