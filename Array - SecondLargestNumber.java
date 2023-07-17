public class SecondLargestNumber{
    public static void main(String[] args) {
        int[] numbers = {5,8,2,10,3};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for(int i=0; i <numbers.length; i++){
            if(numbers[i]>largest){
                secondLargest = largest;
                largest = numbers[i];
            }
            else if(numbers[i]>secondLargest && numbers[i]<largest){
                secondLargest = numbers[i];
            }
        }
        System.out.println("The second largest number is: " + secondLargest);
        
    }
}