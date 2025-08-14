// import java.util.Scanner;
// public class whichday {
//     public void printday(int day){
//         switch (day) {
//             case 1:
//                 System.out.println("Monday");
//                 break;
            
//             case 2:
//                 System.out.println("tuesday");
//                 break;
            
//             case 3:
//                 System.out.println("wednesday");
//                 break;
            
//             case 4:
//                 System.out.println("thursday");
//                 break;
            
//             case 5:
//                 System.out.println("friday");
//                 break;
            
//             case 6:
//                 System.out.println("saturday");
//                 break;
            
//             case 10:
//                 System.out.println("Sunday");
//                 break;
            
        
//             default:
//                 break;
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.println("Enter a number between 1 to 7");
//         int day = sc.nextInt();
//         whichday wd = new whichday();   
//         wd.printday(day);
//         sc.close();
//     }
    
// }
import java.util.*;
public class whichday {
    public void printday(int day){
        switch (day){
            case 1:
            System.out.println("Monday");
            break;
            
            case 2:
            System.out.println("tuesday");
            break;

            case 3:
            System.out.println("wednesday");
            break;

            case 4:
            System.out.println("thursday");
            break;

            case 5:
            System.out.println("friday");
            break;
            
            case 6:
            System.out.println("satday");
            break;

            case 7:
            System.out.println("sunday");
            break;

        }
        
        }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number between 1 to 7: ");
            int day = sc.nextInt();
            whichday wd = new whichday();
            wd.printday(day);
            sc.close();
    }
}