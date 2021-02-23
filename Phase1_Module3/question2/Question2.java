/*
  @author: xie yanan

 * 2. 编程题
 * 编程获取两个指定字符串中的最大相同子串。
 * 如： s1="asdafghjka", s2="aaasdfg" 他们的最大子串为"asd"
 * 提示： 将短的那个串进行长度依次递减的子串与较长的串比较。
 *
 */

package question2;

public class Question2 {

    private static String[] getSubStrings(String str) {

        final int MAX_POSSIBLE_COUNT = (1+str.length()) * str.length() / 2;
        String[] subStrings = new String[MAX_POSSIBLE_COUNT];
        int arrIndex = 0;
        System.out.print("\n在较短的字符串内，");

        for (int i=str.length(); i>=1; i--) {
            System.out.print("长度为"+i+"的子字符串包括：");
            for (int index=0; index<=str.length()-i; index++) {
                String subString = str.substring(index, index+i);
                subStrings[arrIndex] = subString;
                arrIndex++;
                System.out.print(subString + " ");
            }
            System.out.println();
        }

        return subStrings;
    }


    private static String[] findAllCommonSubStrings(String str1, String str2) {
        // check length
        String longerString;
        String shorterString;

        if (str1.length() >= str2.length()) {
            longerString = str1;
            shorterString = str2;
        } else {
            longerString = str2;
            shorterString = str1;
        }
        System.out.println("长度较短的字符串为：" + shorterString);

        // iterate all candidate substrings to check if it is contained in longer string
        String[] candidates = getSubStrings(shorterString);
        String[] commonStrings = new String[candidates.length];
        int index = 0;
        for (String candidate : candidates) {
            if (longerString.contains(candidate)) {
                commonStrings[index] = candidate;
                index++;
            }
        }

        // print all common substrings
        System.out.println("\n所有的公共子字符串：");
        for (String commonString : commonStrings) {
            if (null != commonString) {
                System.out.print(commonString + " ");
            }
        }

        return commonStrings;
    }


    public static String[] findLongestCommon(String str1, String str2) {
        String[] commonStrings = findAllCommonSubStrings(str1, str2);
        String[] longestCommon = new String[commonStrings.length];

        for (int i = 0; i<commonStrings.length; i++) {
            longestCommon[i] = commonStrings[i];
            if ((i < commonStrings.length-1)
                    && (commonStrings[i].length() > commonStrings[i+1].length())) {
                break;
            }
        }
        System.out.println("\n最大的公共子字符串：");
       for (String longest : longestCommon) {
           if (null != longest) {
               System.out.print(longest + " ");
           }
       }

        return longestCommon;
    }


    public static void main(String[] args) {
        findLongestCommon("asdafghjka", "aaasdfg");
        System.out.println("\n\n===============================");
        findLongestCommon("asgbkm", "asg00bkm");

    }
}
