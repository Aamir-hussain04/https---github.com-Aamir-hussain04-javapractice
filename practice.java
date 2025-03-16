import java.util.Scanner;

import javax.swing.plaf.TreeUI;
//public class practice{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter what you are best at");
//        String s = sc.nextLine();
//        String s1= sc.nextLine();
//        System.out.println("The best i can do is "+ s+" " + s1);
//
//    }
//}
public class practice{
    public static void main(String[] args){
        Scanner ss = new Scanner(System.in);
        int age;
        while(true){
            System.out.print("enter your age:");
            age = ss.nextInt();

            if(age<=0){
                System.out.println("invalid age!!!");
                break;
            }  
            System.out.println("your enter age is = " + age);             
        }
        
    }
}