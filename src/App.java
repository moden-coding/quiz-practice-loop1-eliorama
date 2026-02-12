/**
 *  Write a Java program that reads an unspecified number of integers from the user 
 *  until the user enters -1. For each number, indicate whether it is odd or even. 
 *  After the user enters -1, print the count of even and odd numbers entered.
 */

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

int even = 0;
int odd = 0;
       while (true) {
        System.out.println("Input a number:");
int inputnumber = Integer.valueOf(scanner.nextLine()); 
if (inputnumber%2 == 0){
System.out.println("The number is even");
even++;
}else{
    System.out.println("The number is odd");
    odd++;
} if (inputnumber == -1){
    break ;
}
       } 

   System.out.println("Odd numbers: " + odd + " Even numbers: " + even);
}
 

    }
