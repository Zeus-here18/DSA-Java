
public class smallestelement {
    public static int getSmallest(int [] arr){
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;

    }

    public static void main(String[] args) {
        int[] arr = {5,3,8,-1,4};
        System.out.println("Smallest element is:" + getSmallest(arr));
    }
}
