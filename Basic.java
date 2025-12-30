//  1.Code

// public class Basic {
//     public static void main(String[] args){
//         System.out.println("Hello World");
//     }
// }


//                                    A.If / Else


//  2. Write a program to check whether a number is positive, negative, or zero.

// import java.util.Scanner;
// public class Basic{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int a = sc.nextInt();

//         if(a>0){
//             System.out.println(a+ " is Positive.");

//         }else if(a<0){
//             System.out.println(a+" is Negative.");

//         }else{
//             System.out.println(a+" is Zero.");
//         }
//     }
// }


//  2. Write a program to check whether a number is even or odd.

// import java.util.Scanner;
// public class Basic {

//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a number: ");
//         int a = sc.nextInt();

//         if(a%2==0){
//             System.out.println(a+ " is Even number.");
//         }else{
//             System.out.println(a + " is Odd number.");
//         }
//     }
// } 


//  3.Input three numbers and find the largest among them.

// import java.util.Scanner;

// public class Basic {
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter number A: ");
//         int a = sc.nextInt();

//         System.out.print("Enter number B: ");
//         int b = sc.nextInt();

//         System.out.print("Enter number C: ");
//         int c = sc.nextInt();

//         if(a>b && a>c){
//             System.out.println("A is largest number.");
//         }else if(b>a && b>c){
//             System.out.println("B is largest number.");
//         }else{
//             System.out.println("C is largest number.");
//         }
//     }
// }


//  4. Write a program to check if a person is eligible to vote (age ≥ 18).

// import java.util.Scanner;
// public class Basic {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter your age: ");
//         int a = sc.nextInt();

//         if(a>=18){
//             System.out.println("You are eligible for voting.");
//         }else{
//             System.out.println("You are not eligible for voting.");
//         }
//     } 
// }

//  5.Input marks and print the grade (A/B/C/D/Fail).

// import java.util.*;
// public class Basic {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter your Mark: ");
//         int mark = sc.nextInt();

//         if(mark>=90){
//             System.out.println("Great!!, Grade A.");
//         }else if(mark>=75 ){
//             System.out.println("Grade B.");
//         }else if(mark>=60 ){
//             System.out.println("Grade C.");
//         }else if(mark>=42 ){
//             System.out.println("Grade D.");
//         }else{
//             System.out.println("Fail.");
//         }
//     }
// }


//                             B. Switch Case



//   6.Write a program using a switch case to display the day of the week (1–7).


// import java.util.Scanner;

// public class Basic {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a number between week(1-7): ");
//         int day =  sc.nextInt();

//         switch(day){
//             case 1:
//                 System.out.println("Monday");
//                 break;

//             case 2:
//                 System.out.println("Tuesday");
//                 break;

//             case 3:
//                 System.out.println("Wednesday");
//                 break;

//             case 4:
//                 System.out.println("Thursday");
//                 break;

//             case 5:
//                 System.out.println("Friday");
//                 break;

//             case 6:
//                 System.out.println("Saturday");
//                 break;

//             case 7:
//                 System.out.println("Sunday");
//                 break;
//             default:
//                 System.out.println("Enter a valid Day!!!");
//                 break;
//         }
//     }
// }

//  7.Create a simple calculator using switch ( +, -, *, / ).


// import java.util.*;

// public class Basic{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter number A: ");
//         double a = sc.nextDouble();

//         System.out.print("Enter an Operator (+,-,*,/,%): ");
//         char op= sc.next().charAt(0); 

//         System.out.print("Enter number B: ");
//         double b = sc.nextDouble();

//         switch(op){
//             case '+':
//                 System.out.println("Sum: " + (a+b));
//                 break;

//             case '-':
//                 System.out.println("Difference: "+ (a-b) );
//                 break;

//             case '*':
//                 System.out.println("Product: " + (a*b));
//                 break;

//             case '%':
//                 System.out.println("Remainder: " + (a%b));
//                 break;

//             case '/':
//                 System.out.println("Divide: " + (a/b));
//                 break;

//             default:
//                 System.out.println("Enter a Valid Operator(+,-,*,/,%)");
//                 break;
            
//         }
//     }
// }

//  8.Use switch to print the number of days in a month (1–12).


// import java.util.Scanner;
// public class Basic{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Choose Month number(1-12): ");
//         int month = sc.nextInt();

//         switch(month){
//             case 1:
//                 System.out.println("31 Day in January.");
//                 break;

//             case 2:
//                 System.out.println("28 or 29 Day in Fabruary.");
//                 break;

//             case 3:
//                 System.out.println("31 Day in March.");
//                 break;

//             case 4:
//                 System.out.println("30 day in April.");
//                 break;

//             case 5:
//                 System.out.println("31 day in May.");
//                 break;

//             case 6:
//                 System.out.println("30 Day in June.");
//                 break;

//             case 7:
//                 System.out.println("31 Day in July.");
//                 break;

//             case 8:
//                 System.out.println("31 Day in Augest.");
//                 break;

//             case 9:
//                 System.out.println("30 Day in September.");
//                 break;

//             case 10:
//                 System.out.println("31 Day in Octuber.");
//                 break;

//             case 11:
//                 System.out.println("30 Day in November.");
//                 break;

//             case 12:
//                 System.out.println("31 Day in December.");
//                 break;

//             default:
//                 System.out.println("Enter a number(1-12).");
//                 break;
//         }
//     }
// }


//                         C. Loops (for, while, do-while)


//   9.Print numbers from 1 to 100 using a for loop.

// import java.util.Scanner;

// public class Basic{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter limit to print number:- ");
//         int n = sc.nextInt();

//         for(int i=1;i<=n; i++){
//             System.out.println(i);
//         }
//     }
// }


//   10. Print the sum of first 50 natural numbers.

// import java.util.Scanner;
// public class Basic {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a number: ");
//         int a = sc.nextInt();

//         int sum =0;
//         for(int i=0; i<=a; i++){
//             sum=sum+i;
//         }
//             System.out.println(sum);
//     }
// }


//   11. Print the multiplication table of any number.

// import java.util.Scanner;
// public class Basic {

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number:- ");
//         int n = sc.nextInt();

//         for(int i=1; i<=10; i++){
//         System.out.println(n+"x"+i+" = "+n*i);
//         }
//     }
// }

//  12. Count how many digits are in a number (e.g., 12345 → 5 digits).

// import java.util.Scanner;
// public class Basic {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a group of number: ");
//         int n = sc.nextInt();

//         int count=0;

//         while(n!=0){
//             n=n/10;
//             count++;
//         }
//         System.out.println(count);
        
//     }
// }

//  13.Print all even numbers between 1 and 50.

// import java.util.Scanner;
// public class Basic{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();

//         for(int i=0; i<=n; i+=2){
            
//                 System.out.print(i + " ");
//             }
//         }
//     }



//  14.Reverse a number (e.g., 1234 → 4321) using a loop.


// import java.util.Scanner;
// public class Basic{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//        int rev=0;

//        while(n!=0){
//         int digit=n%10;
//         rev = rev*10+digit;
//         n=n/10;
//        }
//        System.out.println("Reverse number:- " + rev);
//     }
// }

//   15.Print the factorial of a number using a while loop.

// import java.util.Scanner;
// public class Basic{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();

//         int i=1;
//         int fact=1;
//         while(i<=n){
//             fact = fact*i;

//             i++;
//         }

//         System.out.println("Factorial: "+ fact);
//     }
// }


//                      E. Methods


//   16. Print numbers 1–10, but stop the loop if the number is 7 (use break).


// import java.util.Scanner;
// public class Basic{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the size: ");
//         int size = sc.nextInt();
//         int i;

//         for(i=1;i<=size;i++){
//             if(i==7)
//                 break;
//                 System.out.print(i + " ");
            
//         }
//     }
// }


//  17.Print numbers 1–10, but skip printing 5 (use continue).


// import java.util.Scanner;
// public class Basic{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int i;
//         for(i=1; i<=size;i++){
//             if(i==5)
//                 continue;
//             System.out.println(i);

//         }
//     }
// }


//   18. Take a loop from 1–50 and stop when the sum becomes greater than 100

// import java.util.Scanner;
// public class Basic{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the size: ");
//         int size = sc.nextInt();
//         int sum=0;

//         for(int i=1;i<=size;i++){
//             sum = sum+i;
//             if(sum<100){
//             System.out.println("Sum: " + sum);
//             }

//         }
//     }
// }


//  19. Create a method to check whether a number is prime or not.


// static boolean isPrime(int n) {
//     if (n <= 1) return false;

//     for (int i = 2; i <= n / 2; i++) {
//         if (n % i == 0) return false;
//     }
//     return true;
// }

// // calling
// System.out.println(isPrime(13)); // true


// 20. Create a method that takes 2 numbers and returns their greatest.

// static int greatest(int a, int b) {
//     return (a > b) ? a : b;
// }

// // calling
// System.out.println(greatest(10, 25));
