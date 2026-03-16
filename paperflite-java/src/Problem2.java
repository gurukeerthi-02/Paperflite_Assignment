//Example 1:
//Input: num = "1432219", k = 3
//Output: "1219"
//Explanation: Remove the three digits 4, 3, and 2 to form the new number 1219
//which is the smallest.
//Example 2:
//Input: num = "10200", k = 1
//Output: "200"
//Explanation: Remove the leading 1 and the number is 200. Note that the
//output must not contain leading zeroes.
//Example 3:
//Input: num = "10", k = 2
//Output: "0"
//
//Explanation: Remove all the digits from the number and it is left with nothing
//which is 0.

public class Problem2 {
    public static void main(String[] args) {
      String num = "1432219";
      int k = 3;
        System.out.println(findSmallestValue(num, k));
    }

    static String findSmallestValue(String num, int k) {
        StringBuilder result = new StringBuilder();

        for(char value: num.toCharArray()) {

            while( result.length() > 0 && result.charAt(result.length() - 1) > value && k > 0){
                result.deleteCharAt(result.length() - 1);
                k--;
            }

            result.append(value);
        }

        while(result.length() > 0 && result.charAt(0) == '0'){
            result.deleteCharAt(0);
        }

        return result.isEmpty() ? "0" : result.toString();
    }
}
