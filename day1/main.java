import java.util.Scanner;
public class main{
    public static void main(String[] args) {
        String result = getInput();
        System.out.println("Returned String: " + result);
        
    }
    static String getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String userInput = sc.nextLine();
        return userInput;
    }
}