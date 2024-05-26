public class Question4 {

    public static int findMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Input array is empty or null");
        }
        int max = arr[0]; 
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int maxElement = findMax(array);
        System.out.println("Maximum element in the array: " + maxElement); 
    }
}
