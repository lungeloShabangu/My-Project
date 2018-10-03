/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditions.program;

/**
 *
 * @author User
 */
import java.util.*;
public class ConditionsProgram {

    
    public static void main(String[] args) {
        // TODO code application logic 
       
        Scanner input = new Scanner(System.in);
        myClass myObj=new myClass();
         int myArr[]= new int [7];
        
         //
         // Finding the largest number among seven numbers
        System.out.println(" Enter seven numbers below");
        for (int i = 0; i<7;i++){
            myArr[i]=input.nextInt();
        }
        System.out.println("The largest among secven numbers is "+myObj.findHighestAmongSevenNumbers(myArr));
     
        
        // Finding the second highest number
        System.out.println("Enter numbers below.");
        int x=input.nextInt();
        int z=input.nextInt();
        int y=input.nextInt();
       System.out.println("The second highest among three is "+myObj.secondHighestNumberInThree(x, y, z));
       
       
       //Finding a leap year
       System.out.println("Enter year");
       int year = input.nextInt();
       myObj.printLeapYear(year);
       
       
       //Printing words fizz, buzz and fizzbuzz
       System.out.println("\nEnter number to check its multiples");
       int num=input.nextInt();
       myObj.printWords(num);
     
       
       //Checking if a number is positive or negative
        System.out.println("Enter number to check if its positive or negative");
        int numToCheck=input.nextInt();
        System.out.println(numToCheck+" is "+myObj.positiveNegative(numToCheck));
        
        
        //Checking if a number is an even or odd number
        System.out.println("Enter number to check if its an even or odd number");
        int oddEven=input.nextInt();
        System.out.println(oddEven+" is "+myObj.oddEvenNumber(oddEven));
    }
}
