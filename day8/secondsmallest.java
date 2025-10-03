import java.util.Arrays;

public class secondsmallest {
    public static int secsmallest(int [] arr){
        Arrays.sort(arr);
        return arr[1];

    }
    public static void main(String[] args) {
        int [] arr = {5,3,8,-1,4};
        System.out.println("Second smallest element is:" + secsmallest(arr));
    }
}

