package DSA;

import java.util.HashMap;
import java.util.Map;

public class Max2_Sum_2342 {
    public static void main(String[] args) {
        int [] nums = {18,43,36,13,7};
        System.out.println( maximumSum(nums));
    }

    public static int maximumSum(int[] nums) {
        Map<Integer, Integer> dic = new HashMap<>();
        int ans = -1;
        for (int num: nums) {
            int digitSum = getDigitSum(num);
            if (dic.containsKey(digitSum)) {
                ans = Math.max(ans, num + dic.get(digitSum));
            }

            dic.put(digitSum, Math.max(dic.getOrDefault(digitSum, 0), num));
        }

        System.out.println(dic);

        return ans;
    }

    public static int getDigitSum(int num) {
        int digitSum = 0;
        while (num > 0) {
            digitSum += num % 10;
            num /= 10;
        }
        System.out.println(Integer.MAX_VALUE);

        return digitSum;
    }
}
