package question2;

public class Question2Optimised {
    public static String[] fingLargestCommonString(String str1, String str2) {

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
        // System.out.println("长度较短的字符串为：" + shorterString);


        // max count of possible common substrings
        final int MAX_POSSIBLE_COUNT =
                (1 + shorterString.length()) * shorterString.length() / 2;
        String[] results = new String[MAX_POSSIBLE_COUNT];
        int resultIndex = 0;

        for (int i = shorterString.length(); i >= 1; i--) {

            // get all substrings in current length i
            String[] subStrings = new String[shorterString.length() - i + 1];
            int arrIndex = 0;
            for (int index = 0; index <= shorterString.length() - i; index++) {
                subStrings[arrIndex] = shorterString.substring(index, index + i);
                arrIndex++;
            }

            // check if each substring is contained in the longer string
            for (String subString : subStrings) {
                if (longerString.contains(subString)) {
                    results[resultIndex] = subString;
                    resultIndex++;
                }
            }

            // if current length returns some common substrings, then no need to check
            // next length, but do not forget to check ALL substrings of current length.
            if (null != results[0]) {
                break;
            }
        }

        return results;

    }

    public static void main(String[] args) {
        //String[] results = fingLargestCommonString("asdafghjka", "aaasdfg");
        String[] results = fingLargestCommonString("asgbkm", "asg00bkm");

        for (String result : results) {
            if (null != result) {
                System.out.println(result);
            }
        }
    }
}
