package DSA;

public class Minimum_Value_1413 {
    public static void main(String[] args) {
        int[] nums = {-3,2,-3,4,2};
       int res =  minStartValue(nums);
        System.out.println(res);
    }

    public  static int minStartValue(int[] nums) {
        int startValue = 1;
        while(true) {
            int sum = startValue;
            boolean isValid = true;

            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
                if (sum < 1) {
                    isValid = false ;
                    break;
                }
            }
            if(isValid){
                return startValue;
            }else {
                startValue++;
            }

        }

    }


}
