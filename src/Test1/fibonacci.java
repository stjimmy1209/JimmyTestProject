package Test1;

public class fibonacci {
    public static void main(String[] args) {

        int[] nums = new int[45];
        nums[0] = 0;
        nums[1] = 1;
        for (int i = 2; i < nums.length; i++) {

            nums[i] = nums[i-1]+ nums[i-2];
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]+ ",");
        }
    }
}
