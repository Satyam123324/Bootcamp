public class maxInArray {
    public static void main(String[] args){
        int[] arr = {1,4,16,19,20};
        int max = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("The maximum element in the array is: " + max);
    }
}
