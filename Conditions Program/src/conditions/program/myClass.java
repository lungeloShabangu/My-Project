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
public class myClass {
    //
    public int highestNumberInThree(int x, int y, int z)
    {
        int highest=0;
     
        if(x>y&&x>z)
        {
            highest=x;
        }
        else if(y>z&&y>x)
        {
            highest=y;
        }
        else if(z>y&&z>x)
            highest=z;
      
        return highest;
    }
    
    public int secondHighestNumberInThree(int x, int y, int z)
    {
        int secondHighest=0;
      
        if((x>y&&x<z)||(x>z&&x<y))
        {
            secondHighest=x;
   
        }
        else if((y>z&&y<x)||(y>x&&y<z))
        {
            secondHighest=y;
        
        }
        else if((z>y&&z<x)||(z<y&&z>x)){
            secondHighest=z;
        }
        
        return secondHighest;
    }
    
public int findHighestAmongSevenNumbers(int[] myArr)
    {
        int highest=0;
        for(int i=0;i<myArr.length;i++){
            if(myArr[i]>highest)
                highest=myArr[i];
        }
        return highest;
    }
    
     public void printWords(int x)
      {     
          for (int i = 1; i <= x; i++)
            {
                if (i % 15 == 0)
                {
                    System.out.println("FizzBuzz");
                }
                else if (i % 3 == 0)
                {
                    System.out.println("Fizz");
                }
                else if (i % 5 == 0)
                {
                    System.out.println("Buzz");
                }
              
                {
                    System.out.println(i);
                }
            }
    }
     public String positiveNegative(int x)
     {
         
         if(x>0){
             return "Positive";}
         else 
             return "Negative";
     }

     public String oddEvenNumber(int num)
     {
         boolean exists=false;
         if(num % 2 == 0)
            return "Even";
         else
         return "Odd";
     }
     
     public void printLeapYear(int year)
     {
      
      //ANY YEAR THAT IS DIVISIBLE BY 400 IS A LEAP YEAR
      //IF DIVISIBLE BY 4 BUT NOT 100 THEN ITS A LEAP
       int myYear;      
       if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
           System.out.println(year+" Is a leap year");
       else
         System.out.print(year+" Is not a leap year");
    }    
}
