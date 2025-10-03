import java.util.Arrays;

public class distinctelement {
    public static int countDistincts(int [] arr){
        Arrays.sort(arr);
        int count =1;
        for(int i =1; i < arr.length; i++){
            if(arr[i] != arr[i-1]){
                count++;
            }
        }
        return  count;
    }
    public static void main(String[] args) {
        int [] arr = {5,8,5,7,8,1};
        System.out.println("Distinct elements are:" + countDistincts(arr));
    }
}
