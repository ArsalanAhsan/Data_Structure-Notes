public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {

        int[] nums = {1,1,2,3,4,5,6,6,6,7,8};

        int k = removeDuplicates(nums);
        // Print the modified array
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println(); // Print a newline

        
    }
    public static int removeDuplicates(int[] nums){
        int count=0;
        for(int i=0;i<=nums.length-1;i++){
            if(i<nums.length-1 && nums[i] == nums[i+1]){
                continue;

            }
            nums[count] = nums[i];
            count++;
        }
        System.out.println(count);

        return count;

    }
}
