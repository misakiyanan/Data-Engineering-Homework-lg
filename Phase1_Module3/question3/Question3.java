package question3;

/*
3. 编程题
准备一个 HashMap 集合，统计字符串"123,456,789,123,456"中每个数字字符串出现的次数并打印出来。
 如：
        123 出现了 2 次
        456 出现了 2 次
        789 出现了 1 次
 */

import java.util.*;

public class Question3 {
    public static HashMap<String, Integer> stringCount(String str) {
        // split a comma-separated string
        // https://stackoverflow.com/questions/10631715/how-to-split-a-comma-separated-string
        List<String> arr = Arrays.asList(str.split(","));
        HashMap<String, Integer> intCount = new HashMap<>();

        for (String intString : arr) {
            if (!intCount.containsKey(intString)) {
                intCount.put(intString, 1);
            } else {
                intCount.put(intString, intCount.get(intString) +1);
            }
        }
        return intCount;
    }

    // formatting output
    public static void outputFormat(HashMap<String, Integer> intCount) {
        for (String key: intCount.keySet()) {
            System.out.println(key+ " 出现了 " + intCount.get(key)+ " 次");
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> intCount = stringCount("123,456,789,123,456");
        outputFormat(intCount);
    }
}
