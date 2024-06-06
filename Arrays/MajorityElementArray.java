import java.util.Arrays;

public class MajorityElementArray {
    public static void main(String[] args) {
        int[] nums = {2, 1, 2, 3 ,4 ,5 ,4 ,4 ,7};
        int majority = majorityElement(nums);
        System.out.println("Majority element: " + majority);
        System.out.println("Array contents:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];
    }

    
    }