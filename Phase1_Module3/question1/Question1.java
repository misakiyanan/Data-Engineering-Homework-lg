/**
 * @author: xie yanan
 * 1. 编程题
 *  编程统计字符串"ABCD123!@#$%ab"中大写字母、小写字母、数字、其它字符的个数并打印出来。
 */

package question1;

public class Question1 {
    static int upperCharCount = 0;
    static int lowerCharCount = 0;
    static int digitCharCount = 0;
    static int specialCharCount = 0;

    // match with regular expression
    private static void match(String subStr) {
        String upperChar = "^[A-Z]$";
        String lowerChar = "^[a-z]$";
        String digitChar = "^[0-9]$";
        String specialChar = "^[^A-Za-z0-9]$";

        String outputMsg = "该字符为";

        if (subStr.matches(upperChar)) {
            upperCharCount += 1;
            System.out.println(outputMsg + "大写字母");
        }
        if (subStr.matches(lowerChar)) {
            lowerCharCount += 1;
            System.out.println(outputMsg + "小写字母");
        }
        if (subStr.matches(digitChar)) {
            digitCharCount += 1;
            System.out.println(outputMsg + "数字");
        }
        if (subStr.matches(specialChar)) {
            specialCharCount += 1;
            System.out.println(outputMsg + "其他字符");
        }
    }

    public static void charStats(String str) {
        // iterate all chars in string
        for (int i=0; i<str.length(); i++) {
            char currentChar = str.charAt(i);
            System.out.print("第"+i+"个字符为："+currentChar+"，");
            match(Character.toString(currentChar));
            // Character.toString is a static method ...
        }

        System.out.println("\n>>>统计结果：");

        System.out.println("大写字母个数：" + upperCharCount);
        System.out.println("小写字母个数：" + lowerCharCount);
        System.out.println("数字个数：" + digitCharCount);
        System.out.println("其他字符个数：" + specialCharCount);

    }


    public static void main(String[] args) {
        charStats("ABCD123!@#$%ab");
    }
}
