import java.util.Scanner;
//public class Main{
//    public static void main(String[] args) {
//        int age=30;
//        String name= "aamir";
//        long salary=345678;
//        System.out.println("name: "+ name);
//        System.out.println("age: "+ age);
//        System.out.println("salary: "+ salary);
//    }
//}
    
        //int[][] marks = {{98,93,97}, {92,93,99}};`````\\\]]]\\\\\\\\\\\\\\\
        //System.out.println(marks[0][2]);
    
        //double price= 100;
        //double fprice= price + 18.0;
        //System.out.println(fprice);
//class Main{
//    public static void main(String[] args) {
// 
//        int price=100;
//        double fprice= price + 18.23;
//        System.out.println(fprice); 
//    }
//}

        // int a=8;
        // int b=3;
        // if (a>b){
        //     System.out.println("a is greater than b");
        // }
        // else{
        //     System.out.println("b is greater than a");
        // }

//}

        //Scanner scanner= new Scanner(System.in);
        //System.out.println("enter your name: ");
        //String name= scanner.nextLine();
        //System.out.println(name);

//&& LOGICAL OPERATOR if both operations are true
        //int a=10;
        //int b=35;
        //if (a<57 && b<57){
        //    System.out.println("both a and b are less than 57");
        //}
        //else{
        //    System.out.println("a and b are not lesser than 57");
        //}


//|| LOGICAL OPERAator IF ONE OF THE OPERATIONS ARE TRUE
        //int a=37;
        //int b=30;
        //if (a<18 || b<18){
        //    System.out.println("either one or both are lesser than 18");
        //}
        //else{
        //    System.out.println("either one or both a and b greater than 18");
        //}
//do while loop
// import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number=0;  
        do{     
            System.out.print("enter a number:");
            number = sc.nextInt();
            System.out.println("your number is: " + number);
        }while(number>0);
        System.out.println("THE END");
    }  

}


//ask user+ to guess a random number between 0 to 100
        //int number= (int)(Math.random()*100);
        //System.out.print("Guess the number :");
        //Scanner sc=new Scanner(System.in);
        //int mynumber=0;
        //do{
        //     mynumber=sc.nextInt();
        //    if (mynumber==number){
        //        System.out.println("you guessed correct number !!");
        //        break;
        //    }
        //    else if(mynumber<number){
        //        System.out.println("guessed number is too small");
        //    }
        //    else {
        //        System.out.println("guessed number is too large");
        //    }
        //}while(mynumber>=0);
 //System.out.println("the correct number is "+ number);


//creating class and object
//public class Main{
    //public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Enter your name: ");
        //String name = sc.nextLine();
        //System.out.println("Your name is: " + name);
    //}
//}

//average of 3 subjects
//public class Main{
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        double English, Maths, Physics;
//        System.out.println("Enter the marks of sunjects: ");
// //input marks of subjects
//        System.out.print("English Marks: ");
//        English = scanner.nextDouble();
//        System.out.print("Maths Marks: ");
//        Maths = scanner.nextDouble();
//        System.out.print("Physics Marks: ");
//        Physics = scanner.nextDouble();
//
//        double average = (English+Maths+Physics)/3;
//        System.out.println("The average of 3 subjects is: " + average);
//                
//    }
//}


//KM intometers
// import java.util.Scanner;
// public class Main{
//    public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         double km=0;
//        do{  
//            System.out.println("enter the distance in km: ");
//            km=sc.nextDouble();
//            double meter = 1000*km;
//            System.out.println("the distance in meter is: "+ meter );
//        }while(true);
//    }
// }
    