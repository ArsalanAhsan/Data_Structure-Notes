import java.util.Arrays;

class RemoveElementArray {
    public static void main(String[] arrgs){
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        removeElements(nums, val);

    }
    public static int removeElements(int[] nums, int val) {
        // Counter for keeping track of elements other than val
        int count = 0;
        // Loop through all the elements of the array
        for (int i = 0; i < nums.length; i++) {
            // If the element is not val
            if (nums[i] != val) {
                nums[count++] = nums[i];
            }
        }
        System.out.println(count);
        return count;
        
    }
}