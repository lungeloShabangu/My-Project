/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterations;

/**
 *
 * @author User
 */
import java.util.Arrays;
import java.util.Scanner;

public class Iterations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] myArray = { 12, 12, 17, 13, 12, 19,9};
        myClass myObj=new myClass();
        Scanner input = new Scanner(System.in);
        
        //Counting spaces in a string
        System.out.println("\nEnter string below to count spaces");
        String myString=input.nextLine();
       
        System.out.println("This sentence has "+myObj.countSpaces(myString)+" spaces");
        System.out.println("--------------------------------------------------------------------");

        //Displaying the number of words in a sentence
        System.out.println("The sentence also has "+myObj.countWords(myString)+" words");
        System.out.println("--------------------------------------------------------------------");

        
        //Replacing Space with underscore
        System.out.println();
        myObj.replaceSpaces(myString);
        System.out.println("--------------------------------------------------------------------");

        //Rversing a String
        System.out.println("Reversed String below");
        myObj.reverseString(myString);
        System.out.println("--------------------------------------------------------------------");

         //Converting numeric string value "1234" to integer 1234
         System.out.println("Converting string to int");
         String myString2=input.nextLine();
         System.out.println(myObj.convertString(myString2));
         System.out.println("--------------------------------------------------------------------");
        
        //Displaying the highest number in an array
        System.out.println("\nThe highest number in the array is "+myObj.findLargentnumber(myArray));
        System.out.println("--------------------------------------------------------------------");
       
        //Displaying the second highest number in an array
        System.out.println("\nThe second highest number in the array is "+myObj.findSecondLargest(myArray));
        System.out.println("--------------------------------------------------------------------");
         
        //Checking if a certain value exists in an array
        System.out.println("\nEnter number to check if it exists in an array");
        int num=input.nextInt();
        System.out.println(num+" "+myObj.contains(myArray, num));
        System.out.println("--------------------------------------------------------------------");
         
        //Find number of occurences of a number in an array
        System.out.println("\nEnter number below of occurrences ");
        int number=input.nextInt();
        System.out.println(myObj.occurence(myArray, number)+" occurences");
        System.out.println("--------------------------------------------------------------------");
         
        //Displaying the number that has the maximum occurence in an array
        System.out.println("\nThe number that has maximum occurence in an array is "+myObj.maxRepeating(myArray));
        System.out.println("--------------------------------------------------------------------");
         
       //Sorting an array
       System.out.println("The sorted array in ascending order is "+myObj.sortArray(myArray));
       System.out.println("--------------------------------------------------------------------");

       //Finding all even numbers in an array
   /*    System.out.println("Even numbers "+myObj.findEven(myArray));
       System.out.println("--------------------------------------------------------------------");
       
          //Finding the maximum difference between two consecutive items in an array of numbers
       System.out.println("The maximum difference between two consecutive items in an array is "+myObj.findMaxDifferenceBtwnTwoConsequtives(myArray));
       System.out.println("--------------------------------------------------------------------");
        
       //Generating a fibinacci Series
       System.out.println("Enter number to generate fibonacci series");
       int fibonacciNumber=input.nextInt();
       myObj.generateFibonacci(fibonacciNumber);
       System.out.println("--------------------------------------------------------------------");
      
      System.out.println("Enter number to find sum of odd numbers between it and start");
      int num1=input.nextInt();
      System.out.println("The sum of odd numbers in an array is "+myObj.findSumOfOddNumbersInArray(num1));
      System.out.println("--------------------------------------------------------------------");
     
     //Displaying number of digits in a number
     System.out.println("Enter number below, to check how many digits it has");
     int myNum=input.nextInt();
     System.out.println(myNum+" has "+myObj.findNumberOfDigits(myNum)+" digits");
     System.out.println("--------------------------------------------------------------------");
     
     //Displaying the sum of digits in a number
       System.out.println("Enter number below to find the sum of its digits");
       int myNum1=input.nextInt();
       System.out.println("The sum of the digits in this number is "+myObj.sumOfDigits(myNum1));
       System.out.println("--------------------------------------------------------------------");

       //Reversing a number
       System.out.println("Enter number to reverse below");
       int revNum=input.nextInt();
       myObj.reverseNumber(revNum);
       System.out.println("--------------------------------------------------------------------");
    
       //Swapping first and last digit
       System.out.println("Enter number to swap its first and last digit");
       int swapNum=input.nextInt();
       myObj.swapFirstAndLast(swapNum);
       System.out.println("--------------------------------------------------------------------");
       
       //Checking if a letter is vowel or consonent
       System.out.println("Enter letter below to check if its consonent or vowel");
       char myChar=input.next().charAt(0);
       System.out.println(myChar+" is a "+myObj.VowelCheck(myChar));
       System.out.println("--------------------------------------------------------------------");*/
       
     

    }        
}
